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
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);
        double results = 0;
        
        if(operand == '/'){
            results = num1 / num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + results);
        }
        else if(operand == '*'){
            results = num1 * num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + results);
        }
        else if(operand == '+'){
            results = num1 + num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + results);
        }
        else if(operand == '-'){
            results = num1 - num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + results);
        }
        else if(operand == '%'){
            results = num1 % num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + results);
        }
        else{
            System.out.println("Invalid operand");
        }    
    }
}
