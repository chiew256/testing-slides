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
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int cumulative_sum = 0;
        for(int i=1; i<=num; i++){
            cumulative_sum += i;
            sum += cumulative_sum;
        }
        
        System.out.println("The sum is " + sum);
    }
}
