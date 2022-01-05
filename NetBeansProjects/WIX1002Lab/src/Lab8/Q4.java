/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author chiew256
 */
public class Q4 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        fraction1.input(3,6);
        System.out.println("Numerator is " + fraction1.getNumerator());
        System.out.println("Denominator is " + fraction1.getDenominator());
        fraction1.displayFraction();
    }
}

class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 1;
        denominator = 1;
    }

    public void input(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //mutator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //accessor

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void displayFraction(){
        int gcd = 1;
        int max;
        if(denominator >= numerator){
            max = denominator;
        }
        else{
            max = numerator;
        }

        for(int i=max; i>=1; i--){
            if(denominator % i == 0 && numerator % i == 0){
                gcd = i;
                break;
            }
        }

        denominator /= gcd;
        numerator /= gcd;

        if(denominator == 1){
            System.out.println("The simplest fraction is " + numerator);
        }
        else{
            System.out.println("The simplest fraction is " + numerator + " / " + denominator);
        }
    }
}

