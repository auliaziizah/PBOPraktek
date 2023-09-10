/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */

import java.util.*;
public class inputoutput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] stringArray = s.split("[! , ? . _ '@]+");  
        //pemisah kata berdasarkan karakter yang telah ditentukan
        
        int n = stringArray.length; 
        //menghitung jumlah elemen array
        
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
