/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author chiew256
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        System.out.print("Enter f: ");
        double f = sc.nextDouble();
        
        if(a*d - b*c == 0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = (e*d - b*f) / (a*d - b-c);
            double y = (a*f - e*c)/  (a*d - b*c);
            System.out.println("The value for x is " + x);
            System.out.println("The value for y is " + y);
        }
    }
}
