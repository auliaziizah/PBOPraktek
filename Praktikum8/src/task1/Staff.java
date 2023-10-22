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
// Staff.java                  Author: Lewis/Loftus
//
// Represents the personnel staff of a particular business.
//*************************************************************

public class Staff 
{
    StaffMember [] staffList;
    //---------------------------------------------------------
    // Sets up the list of staff members.
    //---------------------------------------------------------
    public Staff ()
    {
        staffList = new StaffMember [8];
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        // Add two Commission employees
        staffList[6] = new Commission("Commissioned Employee 1", "Address 1", "123-456-7891", "111-11-1111", 
                6.25, 0.20);
        staffList[7] = new Commission("Commissioned Employee 2", "Address 2", "987-654-3210", "222-22-2222", 
                9.75, 0.15);

        ((Executive) staffList[0]). awardBonus (500.00);
        ((Hourly) staffList [3]).addHours (40);
        
        ((Hourly) staffList[6]).addHours(35); // Hourly employee (Commissioned Employee 1)
        ((Commission) staffList[6]).addSales(400); // Commissioned Employee 1
        ((Hourly) staffList[7]).addHours(40); // Hourly employee (Commissioned Employee 2)
        ((Commission) staffList[7]).addSales(950); // Commissioned Employee 2
    }
    //---------------------------------------------------------
    // Pays all staff members
    //---------------------------------------------------------
    public void payday ()
    {
        double amount;
        for (StaffMember staffList1 : staffList) {
            System.out.println(staffList1);
            amount = staffList1.pay(); // polymorphic
            if (amount == 0.0)
                System.out.println ("Thanks!");
            else
                System.out.println ("Paid: " + amount);
            System.out.println("---------------------------------------------------------");
        }
    }
}
