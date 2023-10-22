/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Asus
 */
//*************************************************************
// Salesperson.java
//
// Represents a sales person who has a first name, last name,
// and total number of sales
//*************************************************************

public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;
    //---------------------------------------------------------
    // Constructor : Sets up the sales person object with
    //               the given data.
    //---------------------------------------------------------
    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    //---------------------------------------------------------
    // Returns the sales person as a string
    //---------------------------------------------------------
    @Override
    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    //---------------------------------------------------------
    // Returns true if the sales people have
    // the same name.
    //---------------------------------------------------------
    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName())&&
                firstName.equals(((Salesperson)other).getFirstName()));
    }
    //---------------------------------------------------------
    // Order is based on total sales with the name
    // (lasy, than first) breaking a tie.
    //---------------------------------------------------------
    @Override
    public int compareTo(Object other) {
    int result;

    // First, compare based on total sales
    if (this.totalSales < ((Salesperson)other).getSales()) {
        result = -1;
    } else if (this.totalSales > ((Salesperson)other).getSales()) {
        result = 1;
    } else {
        // If total sales are the same, use names to break the tie
        result = this.lastName.compareTo(((Salesperson)other).getLastName());
        if (result == 0) {
            result = this.firstName.compareTo(((Salesperson)other).getFirstName());
        }
    }

    return result;
}

    //---------------------------------------------------------
    // First name acessor
    //---------------------------------------------------------
    public String getFirstName()
    {
        return firstName;
    }
    //---------------------------------------------------------
    // Last name acessor
    //---------------------------------------------------------
    public String getLastName()
    {
        return lastName;
    }
    //---------------------------------------------------------
    // Total sales acessor
    //---------------------------------------------------------
    public int getSales()
    {
        return totalSales;
    }
}
