/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chiew256
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int ans = 0;
        int score = 0;
        while(ans >= 0){
            int multiple1 = r.nextInt(13);
            int multiple2 = r.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(multiple1 + " x " + multiple2 + " = ");
            ans = sc.nextInt();
            if(ansIsCorrect(multiple1, multiple2, ans)){
                score += 1;
            } 
        }
        
        System.out.println("Your score is " + score);
        
    }
    
    public static boolean ansIsCorrect(int a, int b, int ans){
        return ans == a * b;
    }
}
