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
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sales: ");
        double sales = sc.nextDouble();
        double comissions = 0;
        
        if(sales <= 100){
            comissions = sales * 0.05;
        }
        else if(sales > 100 && sales <= 500){
            comissions = sales * 0.075;
        }
        else if(sales > 500 && sales <= 1000){
            comissions = sales * 0.1;
        }
        else{
            comissions = sales * 0.125;
        }
        
        System.out.printf("Sales for " + sales + " is total " + comissions + " comisisons.");
    }
}
