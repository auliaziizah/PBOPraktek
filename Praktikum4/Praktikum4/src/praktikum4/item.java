/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus
 */
public class item {
    private String name;
    private item() {
        name = "ipin";
    }

    public item(String name) { 
        this();
        System.out.println(this.name);
    }
}
