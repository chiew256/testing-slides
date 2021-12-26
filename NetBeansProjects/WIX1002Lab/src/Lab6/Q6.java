/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author chiew256
 */
public class Q6 {
    public static void main(String[] args) {
        int currentNumber = 2;
        for(int palindromicCount=1; palindromicCount<=20;){
            if(isPalindromicPrime(currentNumber)){
                System.out.println("The number " + palindromicCount + " palindromic prime is " + currentNumber);
                palindromicCount++;
            }
            currentNumber++;
        }
        System.out.println("");
        currentNumber = 2;
        for(int emirpCount=1; emirpCount<=20;){
            if(isEmirp(currentNumber)){
                System.out.println("The number " + emirpCount + " emirp is " + currentNumber);
                emirpCount++;
            }
            currentNumber++;
        }
    }
    // is Prime
    // num will be same after you reverse
    public static boolean isPalindromicPrime(int num){
        int reverseNum = reverse(num);
        if(reverseNum != num){
            return false;
        }
        return isPrime(num);
    }
    
    // is Prime
    // reverse also is prime
    // num will not be same after reverse
    public static boolean isEmirp(int num){
        int reverseNum = reverse(num);
        if(num == reverseNum){
            return false;
        }
        return isPrime(num) && isPrime(reverseNum);
    }
    
    
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i<=num/2;  i++){
            if(num % i == 0){
                return false;   
            }
        }
        
        return true;
    }
        
        
    public static int reverse(int num){
        int reverseNum = 0;
        while(num != 0){
            reverseNum = reverseNum*10 + num%10;
            num /= 10;
        }
        
        return reverseNum;
    }
}
