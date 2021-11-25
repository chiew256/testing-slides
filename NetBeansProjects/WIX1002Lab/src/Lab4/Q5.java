/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Random;

/**
 *
 * @author chiew256
 */
public class Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int player1 = 0;
        int player2 = 0;
        int dice = 0;
        
        game:
        while(player1 <= 100 && player2 <= 100){
            do{
                dice = r.nextInt(6) + 1;
                System.out.println("Player 1 rolled " + dice);
                player1 += dice;
                System.out.println("Player 1 score: " + player1);
                
                if(player1 > 100){
                    System.out.println("\nPlayer 1 WIN!");
                    break game;
                }
            } while(dice == 6);
            
            do{
                dice = r.nextInt(6) + 1;
                System.out.println("Player 2 rolled " + dice);
                player2 += dice;
                System.out.println("Player 2 score: " + player2);
                
                if(player2 > 100){
                    System.out.println("\nPlayer 2 WIN!");
                    break game;
                }
            }while(dice == 6);
        }
    }
}
