/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author chiew256
 */
public class Q3 {
    public static void main(String[] args) {
        WeightCalculator person1 = new WeightCalculator();
        person1.input(17,150);
        person1.calculateRecommendWeight();
        person1.display();
    }
}


class WeightCalculator{
    private int age;
    private int height;
    private double recommendWeight;

    public WeightCalculator(){
        age = 0;
        height = 0;
        recommendWeight = 0;
    }

    public void input(int age, int height){
        this.age = age;
        this.height = height;
    }

    public void calculateRecommendWeight(){
        recommendWeight = (height - 100 + age / 10) * 0.9;
    }

    public void display(){
        System.out.println("Age is " + age);
        System.out.println("Height is " + height);
        System.out.println("Recommend weight is " + recommendWeight);
    }
}