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
// Employee.java           Author: Lewis/Loftus
//
// Represents a general paid employee
//*************************************************************

public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;
    //---------------------------------------------------------
    // Sets up an employee with the specified information.
    //---------------------------------------------------------
    public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone);
        
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    //---------------------------------------------------------
    // Returns information about an employee as a string
    //---------------------------------------------------------
    @Override
    public String toString()
    {
        String result = super.toString();
        
        result += "\nSocial Security Number: " + socialSecurityNumber;
        
        return result;
    }
    
    //---------------------------------------------------------
    // Returns the pay rate for this employee.
    //---------------------------------------------------------
    @Override
    public double pay()
    {
        return payRate;
    }
    
}
