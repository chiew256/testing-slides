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
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        
        System.out.print("Enter y: ");
        double y = sc.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        if(distance > radius){
            System.out.println("The coordinate point is outside the circle");
        }
        else{
            System.out.println("The coordinate point is inside the circle");
        }
    }
}
