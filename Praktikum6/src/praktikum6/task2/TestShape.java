/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.task2;

/**
 *
 * @author Asus
 */
public class TestShape {
    public static void main(String[] args) {
        // Membuat objek Shape
        Shape shape = new Shape();
        
        // Menggunakan metode-metode Shape
        System.out.println("Shape 1:");
        System.out.println("Color: " + shape.getColor());
        System.out.println("Filled: " + shape.isFilled());
        System.out.println(shape.toString());
        
        // Membuat objek Circle
        Circle circle = new Circle(2.5, "blue", false);
        
        // Menggunakan metode-metode Circle
        System.out.println("\nCircle 1:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());
        
        // Membuat objek Rectangle
        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", true);
        
        // Menggunakan metode-metode Rectangle
        System.out.println("\nRectangle 1:");
        System.out.println(rectangle); // Memanggil metode toString() dari Rectangle
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        
        // Membuat objek Square
        Square square = new Square(2.0);
        
        // Menggunakan metode-metode Square
        System.out.println("\nSquare 1:");
        System.out.println(square); // Memanggil metode toString() dari Square
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square.toString());
    }
}
