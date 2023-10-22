/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Strings {
    //---------------------------------------------------------
    // Reads in an array of strings, sorts them,
    // then prints them in sorted order.
    //---------------------------------------------------------
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        stringList = new String[size];

        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }

        Sorting.insertionSort(stringList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
        }
    }
}

