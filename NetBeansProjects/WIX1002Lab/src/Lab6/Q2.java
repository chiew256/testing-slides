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
public class Q2 {
    public static void main(String[] args) {
        final int triangleHeight = 3;
        for(int i=0; i<triangleHeight; i++){
            multiPrint(triangleHeight-i, ' ');
            multiPrint(i+1+i, '*');
            System.out.println("");
        }
        System.out.println("");
        
        final int diamondHeight = 7;
        final int halfDiamondHeight = diamondHeight/2;
        
        // Upper part of diamond
        for(int i=0; i<halfDiamondHeight; i++){
            multiPrint(halfDiamondHeight-i, ' ');
            multiPrint(i+1+i, '*');
            System.out.println("");
        }
        
        //Middle part of diamond
        if(diamondHeight % 2 != 0){
            multiPrint(halfDiamondHeight + 1 + halfDiamondHeight, '*');
            System.out.println("");
        }
        
        // Lower part of diamond
        for(int i=halfDiamondHeight - 1; i>=0; i--){
            multiPrint(halfDiamondHeight - i, ' ');
            multiPrint(i+1+i, '*');
            System.out.println("");
        }
    }
    
    public static void multiPrint(int n, char c){
        for(int i=0; i<n; i++){
            System.out.print(c);
        }
    }
}
