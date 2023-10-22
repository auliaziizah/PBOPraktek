/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author Asus
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        shapeName = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
