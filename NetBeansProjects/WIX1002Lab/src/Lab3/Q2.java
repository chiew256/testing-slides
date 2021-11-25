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
public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(6);
        String results = "";
        
        switch(random){
            case 0: results = "zero"; break;
            case 1: results = "one"; break;
            case 2: results = "two"; break;
            case 3: results = "three"; break;
            case 4: results = "four"; break;
            case 5: results = "five"; break;
        }
        
        System.out.println(random + " is " + results);
    }
}
