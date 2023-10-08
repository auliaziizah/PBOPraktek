/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.task1;

/**
 *
 * @author Asus
 */

/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color
     * @param r */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    
    public Circle(double r, String c) { // 3rd constructor 
        radius = r;
        color = c;
    }

    /** Returns the radius
     * @return  */
    public double getRadius() {
        return radius; 
    }

    public String getColor() {  //getter color
        return color;
    }
    
    public void setColor(String color) {    //setter color
        this.color = color;
    }
    
    /** Returns the area of this Circle instance
     * @return  */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of 
   Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

