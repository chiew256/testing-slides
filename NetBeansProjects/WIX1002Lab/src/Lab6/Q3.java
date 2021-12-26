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

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        reversingArray(array);
        System.out.println(Arrays.toString(array));
        reversingArray(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void reversingArray(int [] array){
        int halfLength = array.length/2;
        int temp;
        int maxIndex = array.length - 1;
        for(int i=0; i<halfLength; i++){
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
