/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class inputoutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStrings = new String[3];  //array yang menyimpan inputan string
        int[] inputIntegers = new int[3];   // array yang menyimpan inputan integer

        for (int i = 0; i < 3; i++) {
            inputStrings[i] = scanner.next(); 
            inputIntegers[i] = scanner.nextInt();
        }

        System.out.println("==================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", inputStrings[i], inputIntegers[i]);
            //mencetak pasangan input sesuai format
            //-15 adalah lebar yang dialokasikan untuk string
            //03d adalah format 3 digit dengan tambah angka 0 jika angka kurang dari 3 digit
        }
        System.out.println("==================");
        
        scanner.close();
    }
}
