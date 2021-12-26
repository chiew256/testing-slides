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
public class Q1 {
    public static void main(String[] args) {
        System.out.print("Triangular number are: ");
        printTriangularNumber(20);
    }

    public static void printTriangularNumber(int num){
        int triangularNumber = 0;
        for(int i=0; i<=num; i++){
            triangularNumber += i;
            System.out.println("Index: " + i + ", Triangular Number: " + triangularNumber);
        }
    }
}
