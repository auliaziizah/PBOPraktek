/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class bukatutupjalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAngka = 0;
        
        String inputLine = scanner.nextLine();
        String[] platNomorArray = inputLine.split(" ");
        
        if (platNomorArray.length == 4) {   // Memeriksa apakah terdiri dari 4 mobil
            for (int i = 0; i < platNomorArray.length; i++) {
                String platNomor = platNomorArray[i];
                if (platNomor.length() == 4 && platNomor.matches("[0-9]+")) {   // Memeriksa apakah platNomor terdiri dari 4 karakter angka
                    for (int j = 0; j < platNomor.length(); j++) {
                        char karakter = platNomor.charAt(j);    //mengambil karakter yang ada pada index j
                        int angka = Character.getNumericValue(karakter);    //mengambil nilai angka dari var karakter
                        totalAngka += angka;
                    }
                } else {
                    System.out.println("Input nomor mobil yang dimasukkan harus 4 karakter angka");
                    scanner.close();
                    return;
                }
            }
            if ((totalAngka - 999999) % 5 == 0) {
                System.out.println("Berhenti");
            } else {
                System.out.println("Jalan");
            }
        } else {
            System.out.println("Input nomor mobil yang dimasukkan harus 4 mobil");
        }
        scanner.close();
    }
}
