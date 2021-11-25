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
public class Q8 {
    public static void main(String[] args) {
        Random r = new Random();
        int numberOfPrime = r.nextInt(101);
        System.out.println("Number of prime number of find: " + numberOfPrime);
        int primePrinted = 0;
        int currentNumber = 2;
        
        while(primePrinted < numberOfPrime){
            boolean isPrime = true;
            for(int i=2; i<= currentNumber/2; i++){
                if(currentNumber % i == 0){
                    isPrime = false;
                    break;
                }               
            }
            
           if(isPrime){
                primePrinted++;
                System.out.println(currentNumber);
            }
                
            currentNumber++;
        }
    }
}
