/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author chiew256
 */
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Game player1 = new Game("Chiew");
        Game player2 = new Game("Blacky");
        int round = 1;
        while(true){
            System.out.println("Round " + round);

            player1.move();
            System.out.println("Current score for " + player1.getName() + " is " + player1.getScore());
            if(player1.isWin()){
                System.out.println(player1.getName() + " wins the game");
                break;
            }

            player2.move();
            System.out.println("Current score for " + player2.getName() + " is " + player2.getScore());
            if(player2.isWin()){
                System.out.println(player2.getName() + " wins the game");
                break;
            }
            System.out.println();
            round++;
        }
    }
}

class Game{
    private Random r = new Random();
    private String name;
    private int score = 0;

    public Game(String name){
        this.name = name;
    }

    public void move(){
        int dice = r.nextInt(6) + 1;
        System.out.println(name + " rolls " + dice);
        score += dice;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean isWin(){
        return score >= 100;
    }
}

