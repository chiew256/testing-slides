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
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int sum = 0;
        int sum_square = 0;
        int n = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while(true){
            System.out.print("Enter a score [negative score to quit]:");
            score = sc.nextInt();
            if(score < 0){
                break;
            }
            
            sum += score;
            sum_square += Math.pow(score, 2);
            if(score < min){
                min = score;
            }
            if(score > max){
                max = score;
            }    
            n++;
        }
        
        System.out.println("Minimum score: " + min);
        System.out.println("Maximum score: " + max);
        double average = (double)sum/n;
        System.out.printf("Average score: %.2f \n", average);
        double std = Math.sqrt( (sum_square- Math.pow(sum,2)/n )/(n-1));
        System.out.printf("Standard deviation: %.2f", std);
    }
}
