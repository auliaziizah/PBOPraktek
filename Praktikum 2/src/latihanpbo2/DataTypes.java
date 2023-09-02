/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpbo2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
//kelas Scanner untuk membaca input dari pengguna melalui konsol.

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // deklarasi objek Scanner yang digunakan untuk membaca input dari pengguna melalui konsol.  
        int T = scanner.nextInt(); //input pengguna dengan tipe data integer
           // pengulangan dilakukan sebanyak T kali 
        
        for (int i = 0; i < T; i++) {
            try {
                long n = scanner.nextLong(); // Input pengguna bilangan bulat (long)

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) { //kondisi jika masuk dalam rentang byte
                    System.out.println(n + " can be fitted in:");
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) { //kondisi jika masuk dalam rentang short
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) { //kondisi jika masuk dalam rentang int
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) { //kondisi jika masuk dalam rentang long
                    System.out.println("* long");
                }
            } catch (Exception e) { //kondisi jika tidak masuk ke semua kondisi diatas
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        
        scanner.close(); //Program menutup objek Scanner setelah selesai membaca input.
    }
}
