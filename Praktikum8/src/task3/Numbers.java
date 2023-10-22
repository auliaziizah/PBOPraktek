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
// Numbers.java
//
// Demonstrates selectionSort on an array of integers.
//*************************************************************
import java.util.Scanner;
public class Numbers {
    //---------------------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    //---------------------------------------------------------
    public static void main (String[] args)
    {
        Integer[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        
        System.out.println ("\nEnter the number...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();
        
        Sorting.insertionSort(intList);
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}
