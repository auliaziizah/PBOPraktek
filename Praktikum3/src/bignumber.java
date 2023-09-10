/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.math.BigInteger;
import java.util.Scanner;
public class bignumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Membaca dua angka sebagai input
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Membuat objek BigInteger dari tipe data long
        BigInteger bigA =  new BigInteger(a);
        BigInteger bigB =  new BigInteger(b);

        // Melakukan penjumlahan dan perkalian
        BigInteger tambah = bigA.add(bigB);
        BigInteger kali = bigA.multiply(bigB);

        System.out.println(tambah);
        System.out.println(kali);

        scanner.close();
    }
}
