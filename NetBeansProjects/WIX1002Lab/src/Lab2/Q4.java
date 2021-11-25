/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author chiew256
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the nunber in seconds: ");
        int seconds = sc.nextInt();
        int s = seconds % 60;
        
        int minutes = (seconds - s) / 60;
        int m = minutes % 60;
        
        int hours = (minutes - m) / 60;
        System.out.println(seconds  + " seconds is " + hours + " hours, " + m + " minutes and " +s + " seconds");
        
        System.out.println("");
        
    }
    
}
