/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Random;

/**
 *
 * @author chiew256
 */
public class Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int rnd = r.nextInt(Integer.MAX_VALUE);
        System.out.println("Random number is " + rnd);
        
        int cnt = 0;
        int temp = rnd;
        while(temp != 0){         
            temp /= 10;
            cnt++;
        }
        
        System.out.println("The number of digits in the integer " + rnd +  " is " + cnt);
    }
}
