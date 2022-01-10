/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

import java.util.Random;

/**
 *
 * @author chiew256
 */
public class Q4 {
    public static void main(String[] args) {
//        PlayerGame1 player1 = new PlayerGame1("A");
//        PlayerGame1 player2 = new PlayerGame1("B");
//        System.out.println("Dice Game 1");
//        DiceGame game1 = new DiceGame(player1, player2);
//        game1.start();
//        
//        System.out.println("\n\n");
        
        PlayerGame2 player3 = new PlayerGame2("C");
        PlayerGame2 player4 = new PlayerGame2("D");
        System.out.println("Dice Game 2");
        DiceGame game2 = new DiceGame(player3, player4);
        game2.start();
    }
}

abstract class Player{
    protected int score = 0;
    protected String name;
    
    public Player(){
        this.name = "NO NAME";
    }
    
    public Player(String name){
        this.name = name;
    }
    
    public void display(){
        System.out.println("The score for " + name + " is " + score);
    }
    
        public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void roll();
}

class PlayerGame1 extends Player{
    private int dice1;
    private int dice2;
    private Random r = new Random();
    
    public PlayerGame1(String name){
        super(name);
    }

    @Override
    public void roll() {
        dice1 = 0;
        dice2 = 0;
        
        do{
            dice1 = r.nextInt(6) + 1;
            this.score += dice1;
            dice2 = r.nextInt(6) + 1;
            this.score += dice2;
            System.out.println(getName() + " rolls " + dice1 + " and " + dice2);
            display();
        }while(dice1 == dice2);
    }
}

class PlayerGame2 extends Player{
    private int dice;
    private Random r = new Random();
    
    public PlayerGame2(String name){
        super(name);
    }

    @Override
    public void roll() {
        dice = r.nextInt(6) + 1;
        this.score += dice;
        System.out.println(getName() + " rolls " + dice);
        
        if(score > 100){
            this.score -= dice;
        }
        
        display();
        
        if(dice == 6){
            dice = r.nextInt(6) + 1;
            System.out.println(getName() + " rolls " + dice);
            
            if(dice != 6){
                this.score += dice;
                if(score > 100){
                    this.score -= 100;
                }
            }
            else{}
            display();
        }
    }
}

class DiceGame{
    private Player player1;
    private Player player2;
    private int round;
    
    public DiceGame(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.round = 1;
    }
    
    public void start(){
        round = 1;
        while(!isWin(player1) && !isWin(player2)){
            System.out.println("Round " + round);
            player1.roll();
            if(isWin(player1)){
                System.out.println(player1.getName() + " wins!");
                break;
            }
            
            player2.roll();
            if(isWin(player2)){
                System.out.println(player2.getName() + " wins!");
                break;
            }
            System.out.println("");
            round++;
        }
    }
    
    private boolean isWin(Player player){
        return player.getScore() >= 100;
    }
}