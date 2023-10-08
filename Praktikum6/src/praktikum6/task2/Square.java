/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.task2;

/**
 *
 * @author Asus
 */
public class Square extends Rectangle{
    public Square(){
        super(); // Memanggil konstruktor Rectangle() dengan panjang dan lebar default
    }
    
    public Square(double side){
        super (side, side); // Memanggil konstruktor Rectangle(double w, double l)
    }
    
    public Square(double side, String c, boolean f){
        super(side, side, c, f); // Memanggil konstruktor Rectangle(double w, double l, String c, boolean f)
    }
    
    public double getSide(){
        return getWidth(); //karena sisi pada square sama dengan panjang atau lebar width
    }
    
    public void setSide(double side){
        setWidth(side);  // Karena sisi pada Square sama dengan panjang atau lebar (width)
        setLength(side);
    }
    
    @Override
    public double getArea(){
        double side = getWidth();
        return side * side;
    }

    @Override
    public double getPerimeter(){
        double side = getWidth();
        return 4 * side;
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);  // Karena sisi pada Square sama dengan panjang (width)
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);  // Karena sisi pada Square sama dengan lebar (length)
    }
    
    @Override
    public String toString(){
        return "A Square with side " + getWidth() + ", which is a subclass of " + super.toString();
    }    
}
