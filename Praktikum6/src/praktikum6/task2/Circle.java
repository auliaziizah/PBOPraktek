/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.task2;

/**
 *
 * @author Asus
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double r){
        radius = r;
    }
    
    public Circle(double r, String c, boolean f){
        super(c, f);
        radius = r;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setColor(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString(){
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
