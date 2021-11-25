/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Random;

/**
 *
 * @author chiew256
 */
public class Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        int player1 = 0;
        int player2 = 0;
        
        for(int i=0; i<2; i++){
            System.out.println("Round " + (i+1));
            int dice = r.nextInt(6) + 1;
            player1 += dice;
            System.out.println("Player 1 rolled " + dice);
            dice  = r.nextInt(6) + 1;
            player2 += dice;
            System.out.println("PLayer 2 rolled " + dice);
            System.out.println("");
        }
        
        if(player1 == player2){
            System.out.println("DRAW!");
        }
        else if(player1 > player2){
            System.out.println("Player 1 wins");
        }
        else if(player2 > player1){
            System.out.println("Player 2 wins");
        }
    }
}
