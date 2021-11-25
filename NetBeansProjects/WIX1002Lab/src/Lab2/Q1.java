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
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celcius = (fahrenheit - 32) / 1.8;
        System.out.printf("%.2f Fahrenheit in %.2f Celcius", fahrenheit, celcius);
        System.out.println("");
    }
    
}
