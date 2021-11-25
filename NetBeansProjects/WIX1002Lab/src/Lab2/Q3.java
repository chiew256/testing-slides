/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Random;

/**
 *
 * @author chiew256
 */
public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int rd1 = r.nextInt(41) + 10;
        System.out.println("The random number is " + rd1);
        
        int rd2 = r.nextInt(41) + 10;
        System.out.println("The random number is " + rd2);
        
        int rd3 = r.nextInt(41) + 10;
        System.out.println("The random number is " + rd3);
        
        int sum = rd1 + rd2 + rd3;
        System.out.println("Sum of the numbers is " + sum);
        
        double avg = sum / 3;
        System.out.printf("Average of the numbers is %.2f", avg);
        System.out.println("");
    }
    
}
