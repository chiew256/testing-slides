/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author chiew256
 */
public class Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle 1", 8, 10);
        rectangle.computePerimeter();
        rectangle.computeArea();
        rectangle.display();
        
        System.out.println("\n");
        
        rectangle.input(12, 14);
        rectangle.computePerimeter();
        rectangle.computeArea();
        rectangle.display();
        
        System.out.println("\n");
        Square square = new Square("Square 1", 10);
        square.computePerimeter();
        square.computeArea();
        square.display();
        
        System.out.println("\n");
        Circle circle = new Circle("Circle 1", 10);
        circle.computePerimeter();
        circle.computeArea();
        circle.display();
    }
}

class Shape{
    private String name;
    protected double perimeter;
    protected double area;
    
    public Shape(String name){
        this.name = name;
    }
    
        public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void display(){
        System.out.printf("%s has perimeter of %.2f and area of %.2f", name, perimeter,area);
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width; 
    }
    
    public void input(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public void computePerimeter(){
        this.perimeter = 2 * (length * width);
    }
    
    public void computeArea(){
        this.area =  length * width;
    }
}

class Square extends Shape{
    private double sideLength;
    
    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }
    
    public void input(double sideLength){
        this.sideLength = sideLength;
    }
    
    public void computePerimeter(){
        this.perimeter = 4 * sideLength;
    }
    
    public void computeArea(){
        this.area = sideLength * sideLength;
    }
}

class Circle extends Shape{
    private double diameter;

    public Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }
    
    public void input(double diameter){
        this.diameter = diameter;
    }
    
    public void computePerimeter(){
        this.perimeter = (Math.PI * diameter);
    }
    
    public void computeArea(){
        this.area = (Math.PI * Math.pow(diameter / 2, 2));
    }
    
}