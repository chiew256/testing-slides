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
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of the car: ");
        double P = sc.nextDouble();
        
        System.out.print("Enter down payment: ");
        double D = sc.nextDouble();
        
        double R;
        do{
            System.out.print("Enter interest rate in %: ");
            R = sc.nextDouble();
        }while(R < 0 || R > 100);
        
        System.out.print("Enter loan duration in year: ");
        double Y = sc.nextDouble();
        
        double M = (P - D)*  (1 + R*Y / 100) / (Y * 12);
        System.out.printf("The monthly payment is %.2f", M);
        System.out.println("");
        
        
    }
}
