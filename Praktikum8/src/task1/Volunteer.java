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
// Valunteer.java           Author: Lewis/Loftus
//
// Represents a generic staff member.
//*************************************************************

public class Volunteer extends StaffMember
{
    //---------------------------------------------------------
    // Sets up a valunteer using the specified information.
    //---------------------------------------------------------
    public Volunteer (String eName, String eAddress, String ePhone)
    {
        super (eName, eAddress, ePhone);
    }
    //---------------------------------------------------------
    // Returns a zero pay value for thine valunteer
    //---------------------------------------------------------
    @Override
    public double pay()
    {
        return 0.0;
    }
}
