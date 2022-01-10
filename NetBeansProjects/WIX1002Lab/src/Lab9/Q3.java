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
public class Q3 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Chiew Kian Khoon", "Male", "10/5/2001", "lecturer.txt");
        lecturer.display();
        lecturer.displayCreditHour();
    }
}

//WMES1105
//Principle of Information Systems
//2009
//1
//3 <= credit hour
//45 <= number of students registered
//WXES1109
//Systems and Computers Organization
//2009
//1
//4
//162
//WXES1112
//Computing Mathematics 1
//2009
//2
//4
//122
//WXES1114
//Programming I
//2009
//2
//5
//98

class Lecturer extends PersonProfile{
    private String fileName;
    private String [][] courseList;

    public Lecturer(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        courseList = new String [countCourse()][6];
        getCourse();
        computeCreditHour();
    }
    
    private int countCourse(){
        int count = 0;
        try{
            Scanner inputStream = new Scanner(new FileInputStream(fileName));
            while(inputStream.hasNextLine()){
            for(int i=0; i<6; i++){
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
//                courseList [4][5] = course[0] 
//course[0] = courseCode
//course[1] = courseName
//course[2] = session
        
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
    
    private void computeCreditHour(){
        for(String [] course : courseList){
            int creditHour = Integer.parseInt(course[4]);
            int numOfStudents = Integer.parseInt(course[5]);
            
            if(numOfStudents >= 150){
                course[4] = Integer.toString(creditHour * 3);
            }
            else if(numOfStudents < 150 && numOfStudents >= 100){
                course[4] = Integer.toString(creditHour * 2);
            }
            else if(numOfStudents < 100 && numOfStudents >= 50){
                course[4] = Integer.toString((int) (creditHour * 1.5));
            }
        }
    }
    
    public void displayCreditHour(){
        for(String [] course : courseList){
            System.out.println("The course code is" + course[0]);
            System.out.println("The course name is " + course[1]);
            System.out.println("It is semester " + course[2]);
            System.out.println("It is session " + course[3]);
            System.out.println("Its credit hour is " + course[4]);
            System.out.println("The number of students is "+ course[5]);
            System.out.println("");
        }
    }
    
}
