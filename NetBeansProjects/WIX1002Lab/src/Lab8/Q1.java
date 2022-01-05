/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author chiew256
 */
import java.util.Arrays;
import java.util.Random;


public class Q1 {
    public static void main(String[] args) {
        Number a = new Number();
        a.showAll();
        a.showEven();
        a.showPrime();
        a.showSquare();
        a.showMax();
        a.showMin();
        a.showAverage();
        System.out.println("\n\n");

        Number b = new Number(5);
        b.showAll();
        b.showEven();
        b.showPrime();
        b.showSquare();
        b.showMax();
        b.showMin();
        b.showAverage();
        System.out.println("\n\n");

        Number c = new Number(4,50);
        c.showAll();
        c.showEven();
        c.showPrime();
        c.showSquare();
        c.showMax();
        c.showMin();
        c.showAverage();
        System.out.println("\n\n");
    }
}

class Number{
    private int occurence = 10;
    private int maximum = 100;
    private int [] rnd_number_array;

    public Number(){
        rnd_number_array = new int[occurence];
        generate();
    }

    public Number(int occurence){
        this.occurence = occurence;
        rnd_number_array = new int[occurence];
        generate();
    }

    public Number(int occurence, int maximum){
        this.occurence = occurence;
        this.maximum = maximum;
        rnd_number_array = new int[occurence];
        generate();
    }

    public void generate(){
        Random r = new Random();
        for(int i=0; i<occurence; i++){
            rnd_number_array[i] = r.nextInt(maximum + 1);
        }
    }

    public void showMin(){
        System.out.println("min");
        int min =  rnd_number_array[0];
        for(int i=0; i<occurence; i++){
            if(min > rnd_number_array[i]){
                min = rnd_number_array[i];
            }
        }
        System.out.println(min);
    }

    public void showMax(){
        System.out.println("max");
        int max =  rnd_number_array[0];
        for(int i=0; i<occurence; i++){
            if(max < rnd_number_array[i]){
                max = rnd_number_array[i];
            }
        }
        System.out.println(max);
    }

    public void showAverage(){
        System.out.println("avg");
        int sum = 0;
        for(int i=0; i<occurence; i++){
            sum += rnd_number_array[i];
        }
        System.out.printf("%.4f", sum/(double)occurence);
    }

    public void showEven(){
        System.out.println("even");
        for(int i=0; i<occurence; i++){
            if(rnd_number_array[i] % 2 == 0){
                System.out.print(rnd_number_array[i] + " ");
            }
        }
        System.out.println();
    }

    public void showPrime(){
        System.out.println("prime");
        for(int i=0; i<occurence; i++){
            if(isPrime(rnd_number_array[i])){
                System.out.print(rnd_number_array[i] + " ");
            }
        }
        System.out.println();
    }

    public void showSquare(){
        System.out.println("square");
        for(int i=0; i<occurence; i++){
            if(isSquare(rnd_number_array[i])){
                System.out.print(rnd_number_array[i] + " ");
            }
        }
        System.out.println();
    }

    public void showAll(){
        System.out.println("all");
        for(int i=0; i<occurence; i++){
            System.out.print(rnd_number_array[i] + " ");
        }
        System.out.println();
    }

    private boolean isPrime(int num){
        if(num == 0){
            return false;
        }
        if(num == 1){
            return false;
        }

        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    private boolean isSquare(int num){
        if(num == 0){
            return false;
        }
        int n = (int) Math.sqrt(num);
        if(Math.pow(n,2) == num){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Number{" +
                "occurence=" + occurence +
                ", maximum=" + maximum +
                ", rnd_number_array=" + Arrays.toString(rnd_number_array)
                + "}";
    }
}