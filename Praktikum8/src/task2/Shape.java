/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author Asus
 */
public abstract class Shape 
{
    protected String shapeName;

    public abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}
