/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author chiew256
 */
import java.math.BigDecimal;

public class Q7 {
    public static void main(String[] args) {
        BigDecimal amount1 = new BigDecimal("153.20");
        BigDecimal amount2 = new BigDecimal("100");
        BigDecimal subtraction = amount1.subtract(amount2);
        System.out.println(subtraction);

        Money money1 = new Money(102.21);
        money1.roundUp();
        money1.calculate();
        money1.displayAmount();

        Money money2 = new Money(51);
        money2.roundUp();
        money2.calculate();
        money2.displayAmount();

        Money subtractMoney = Money.subtraction(money1, money2);
        subtractMoney.calculate();
        subtractMoney.displayAmount();

        Money additionMoney = Money.addition(money1, money2);
        additionMoney.calculate();
        additionMoney.displayAmount();
    }
}

class Money{
    private int RM100, RM50, RM10, RM5, RM1, sen50, sen20, sen10, sen5;
    private double totalAmount;

    public Money(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void roundUp(){
        // 10.11
        // 1011
        int temp = (int)(totalAmount*100);

        // 1
        if(temp % 10 == 9 || temp % 10 == 4){
            totalAmount += 0.01;
        }
        else if(temp % 10 == 8 || temp % 10 == 3){
            totalAmount += 0.02;
        }
        else if(temp % 10 == 7 || temp % 10 == 2){
            totalAmount -= 0.02;
        }
        else if(temp % 10 == 6 || temp % 10 == 1){
            totalAmount -= 0.01;
        }

        // System.out.println(totalAmount)
        // 53.199999
        // 5319.9999999999
        // 5320.000000000
        // 53.20
        totalAmount = Math.round(totalAmount*100) / 100.0;
    }

    public void calculate(){
        double temp = totalAmount;

        // 102/100 = 1.02
        // 1
        // RM102.20
        RM100 += temp / 100;
        temp -= RM100 * 100;
        //RM2.20
        temp = Math.round(temp*100) / 100.0;

        //RM2.20
        RM50 += temp / 50;
        temp -= RM50 * 50;
        temp = Math.round(temp*100) / 100.0;

        RM10 += temp / 10;
        temp -= RM10 * 10;
        temp = Math.round(temp*100) / 100.0;

        RM5 += temp / 5;
        temp -= RM5 * 5;
        temp = Math.round(temp*100) / 100.0;

        RM1 += temp / 1;
        temp -= RM1 * 1;
        temp = Math.round(temp*100) / 100.0;
        //RM0.20

        sen50 += temp / 0.5;
        temp -= sen50 * 0.5;
        temp = Math.round(temp*100) / 100.0;

        sen20 += temp / 0.2;
        temp -= sen20 * 0.2;
        temp = Math.round(temp*100) / 100.0;
        // RM0.00

        sen10 += temp / 0.1;
        temp -= sen10 * 0.1;
        temp = Math.round(temp*100) / 100.0;

        sen5 += temp / 0.05;
    }

    public static Money addition(Money a, Money b){
        Money c = new Money(a.totalAmount + b.totalAmount);
        return c;
    }

    public static Money subtraction(Money a, Money b){
        Money c = new Money(a.totalAmount - b.totalAmount);
        return c;
    }

    public void displayAmount(){
        System.out.printf("The total number of money is RM%.2f\n", totalAmount);
        System.out.println("The number of RM100 is " + RM100);
        System.out.println("The number of RM50 is " + RM50);
        System.out.println("The number of RM10 is " + RM10);
        System.out.println("The number of RM5 is " + RM5);
        System.out.println("The number of RM1 is " + RM1);
        System.out.println("The number of 50 sen is " + sen50);
        System.out.println("The number of 20 sen is " + sen20);
        System.out.println("The number of 10 sen is " + sen10);
        System.out.println("The number of 5 sen is " + sen5 + " \n ");
    }
}
