/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;


/**
 *
 * @author Asus
 */
//*************************************************************
// Hourly.java           Author: Lewis/Loftus
//
// Represents an employee taht gets paid by the hour
//*************************************************************
public class Hourly extends Employee 
{
    private int hoursWorked;
    //---------------------------------------------------------
    // Sets up this hourly employee using teh specified information
    //---------------------------------------------------------
    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }
    //---------------------------------------------------------
    // Adds the specified number of hours to this employee's
    // accumulated hours.
    //---------------------------------------------------------
    public void addHours (int moreHours)
    {
        hoursWorked += moreHours;
    }
    //---------------------------------------------------------
    // Computes and returns the pay for this hourly meployee.
    //---------------------------------------------------------
    @Override
    public double pay()
    {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }
    //---------------------------------------------------------
    // Returns information about this hourly employee as a string.
    //---------------------------------------------------------
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
}
