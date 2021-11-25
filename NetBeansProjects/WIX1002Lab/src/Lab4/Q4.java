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
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the first day of the year: ");
        int first_day = sc.nextInt();
        
        int days = 0;
        // === If leap year, february have 29 days ===
        if(year % 4 == 0 && year % 100 != 0){
            days += 31 + 29 + 31 + 30;
        }
        else{
            days += 31 + 28 + 31 + 30;
        }
        
        //this basically indicates first day of the May of that year     
        first_day += days;
        first_day %= 7;
        // first_day = first_day % 7;
        
        //May
        System.out.println("-".repeat(40) + "  May  " + "-".repeat(40));
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");
        
        //get the location of first day of the month
        for(int i=0; i<first_day; i++){
            System.out.printf("%13s", " ");
        }
        
        for(int i=1; i<=31; i++){
            System.out.printf("%13d", i);
            first_day++;
            if(first_day % 7 == 0){
                System.out.println();
            }
        }
        
        System.out.println("\n\n");
        
        //August
        //Jun and July
        first_day += 30 + 31;
        System.out.println("");
        System.out.println("-".repeat(40) + "   August   " + "-".repeat(40));
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");
        
                first_day %= 7;
        //get the location of first day of the month
        for(int i = 0 ; i < first_day ; i++){
            System.out.printf("%13s"," ");
        }
        for(int i = 1 ; i <= 31 ; i ++) {
            System.out.printf("%13d", i);
            first_day++;
            if (first_day % 7 == 0)
                System.out.println();
        }

    }
}
