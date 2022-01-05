import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
       // ObjectInputStream - binary
       // ObjectOutputStream - binary
       // FileInputStream
       // FileOutputStream
       // PrintWriter
       
       try{
           String[][] array = {
                    {"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}
            };
           
           ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("course.dat"));
           
           // write info to binary file
           for(int i=0; i<array.length; i++){
               for(int j=0; j<array[i].length; j++){
                   outputStream.writeUTF(array[i][j]);
               }
           }
           outputStream.close();
           
       } catch(IOException e){
           System.out.println("Problem with file output.");
       }
       
       try{
           ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("course.dat"));
           System.out.print("Enter the course code: ");
           Scanner sc = new Scanner(System.in);
           String code = sc.nextLine();
           boolean found = false;   
           try{
               while(true){
                   String courseCode = inputStream.readUTF();
                   String courseName = inputStream.readUTF();
                   if(courseCode.equals(code)){
                       found = true;
                       System.out.println("The course name for the course code is " + courseName);
                       break;
                   }
               }
           } catch(EOFException e){
               if(found == false){
                   System.out.println("Couldn't find the course code");
               }
           }
           inputStream.close();
       } catch(FileNotFoundException e){
           System.out.println("File is not found");
       } catch(IOException e){
           System.out.println("Problem with file output");
       }
    }
}