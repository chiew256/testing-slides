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
public class Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10001);
        int sum = 0;
        System.out.println("The random number is " + n);
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        
        System.out.println("The sum of the digit is " + sum);
    }
    
}
