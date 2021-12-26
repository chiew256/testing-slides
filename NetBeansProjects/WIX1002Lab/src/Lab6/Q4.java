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
public class Q4 {
    public static void main(String[] args) {
        System.out.println("GCD  for 24 and 8 is " + gcd(25,8));
        System.out.println("");
        System.out.println("GCD  for 200 and 625 is " + gcd(200,625 ));
    }
    
    public static int gcd(int dividend, int divisor){
        int remainder;
        while(true){
            remainder = dividend % divisor;
            System.out.println("Dividend " + dividend);
            System.out.println("Divisor " + divisor);
            System.out.println("Remainder " + remainder);
           
            if(remainder == 0){
                break;
            }
            
            dividend = divisor;
            divisor = remainder;
            System.out.println("");
            
        }
        return divisor;
    }
}
