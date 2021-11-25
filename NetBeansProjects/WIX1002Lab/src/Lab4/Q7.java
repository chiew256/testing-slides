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
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principalAmount = sc.nextInt();
        System.out.print("Enter interest in %: ");
        double interest = sc.nextDouble();
        while(interest < 0 || interest > 100){
            System.out.println("Integer in % couldn't bigger than 100 or smaller than 0");
            System.out.print("Enter interest in %: ");
            interest = sc.nextDouble();
        }
        
        System.out.print("Enter total number of month(s): ");
        int month = sc.nextInt();
        
        double monthlyPayment = (principalAmount * (interest / (12*100)) ) / (1 - Math.pow((1 + interest / (12*100)),-month));
        System.out.printf("%-20s%20s%20s%20s%20s%20s\n", "Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        double totalInterest = 0;
        for(int i=1; i<=month; i++){
            double principalPortionDue = monthlyPayment * Math.pow( (1 + interest/ (12*100) ), -(1+month-i));
            double interestDue = monthlyPayment - principalPortionDue;
            totalInterest += interestDue;
            double remainingPrincipalBalanceDue = (interestDue / (interest / (12*100)) ) - principalPortionDue;
            System.out.printf("%-20d%20.2f%20.2f%20.2f%20.2f%20.2f\n", i, monthlyPayment, principalPortionDue, interestDue, remainingPrincipalBalanceDue, totalInterest);
        }
    }
}
