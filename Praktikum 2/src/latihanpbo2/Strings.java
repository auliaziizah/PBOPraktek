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

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.next();  //input pengguna
        String B = scanner.next();  //input pengguna
        /*input pengguna, metode next adalah membaca input yang akan dipishakan jika 
        menemukan karakter whitespace(spasi, tab, atau karakter pemisah lainnya)*/

        int sumOfLengths = A.length() + B.length(); //menjumlahkan panjang karakter string A dan B
        System.out.println(sumOfLengths);

        if (A.compareTo(B) > 0) { //Perbandingan leksikografis
            System.out.println("Yes"); //jika string A lebih besar
        } else {
            System.out.println("No"); //jika string B lebih besar
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        /*Subtring adalah mengambil sebagian dari string asli
        toUpperCase adalah mengonversi ke huruf kapital*/
        
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
