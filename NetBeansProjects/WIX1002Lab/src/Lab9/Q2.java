/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author chiew256
 */
public class Q2 {
    public static void main(String[] args) {
        Student student = new Student("Chiew Kian Khoon", "Male", "10/5/2001", "course.txt");
        student.display();
        student.displayCourseList();
        student.displayGrade();
    }
    
}

//WMES1105
//Principle of Information Systems
//2009
//1
//74
//WXES1109
//Systems and Computers Organization
//2009
//1
//60
//WXES1112
//Computing Mathematics 1
//2009
//2
//82
//WXES1114
//Programming I
//2009
//2
//52
//GXEX1411
//Ethnic Relations
//2009
//2
//43

class Student extends PersonProfile{
    private String fileName;
    private String [][] courseList;
    
    public Student(String name, String gender, String dateOfBirth,String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        courseList = new String[countCourse()][5];
        getCourse();
    }
    
    private int countCourse(){
        int count = 0;
        try{
            Scanner inputStream = new Scanner(new FileInputStream(fileName));
            while(inputStream.hasNextLine()){
            for(int i=0; i<5; i++){
                inputStream.nextLine();
            }
            count++;
            } 
            inputStream.close();
        } catch(FileNotFoundException e){
            System.out.println("The file is not found");
        } catch(IOException e){
            System.out.println("Problem with file output.");
        }
        return count;
    }
    
    private void getCourse(){
        try{
            Scanner inputStream = new Scanner(new FileInputStream(fileName));
            while(inputStream.hasNextLine()){
                for(String [] course : courseList){
                    for(int i=0; i<course.length; i++){
                        course[i] = inputStream.nextLine();
                    }
                }
            }
            inputStream.close();
        } catch(FileNotFoundException e){
            System.out.println("The file is not found");
        } catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
    public void displayGrade(){
        System.out.println("--- Grade ---");
        for(int i=0; i<courseList.length; i++){
            String grade = "";
            int mark = Integer.parseInt(courseList[i][4]);
            if(mark >= 85){
                grade = "A";
            }
            else if(mark >= 75){
                grade = "A-";
            }
            else if(mark >= 70){
                grade = "B+";
            }
            else if(mark >= 65){
                grade = "B";
            }
            else if(mark >= 60){
                grade = "B-";
            }
            else if(mark >= 55){
                grade = "C+";
            }
            else if(mark >= 50){
                grade = "C";
            }
            else if(mark >= 45){
                grade = "C-";
            }
            else if(mark >= 35){
                grade = "E";
            }
            else{
                grade = "F";
            }
            System.out.println("The grade for " + courseList[i][1] + " is " + grade);
        }
    }
    
    public void displayCourseList(){
        System.out.println("--- Course List ---");
        for(int i=0; i<courseList.length; i++){
            System.out.println("Course " + (i+1) + " : ");
            for(int j=0; j<courseList[i].length; j++){
                System.out.println(courseList[i][j]);
            }
            System.out.println("");
        }
    }
}