/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author chiew256
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.print("The factors are: ");
        for(int i = 1 ; i <= num ; i++){
            if (i == num) {
                System.out.print(i);
                break;
            }

            if(num % i == 0)
                System.out.print(i + ", ");
        }
    }
}
