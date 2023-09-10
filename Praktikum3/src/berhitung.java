/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        String operator = scanner.next();
        int B = scanner.nextInt();
        int result = 0;

        if (A >= 1 && B <= 1000){   //batasan bilangan
                switch (operator) {
                    case "+":
                        result = A + B;
                        break;
                    case "-":
                        result = A - B;
                        break;
                    case "*":
                        result = A * B;
                        break;
                    case "/":
                        result = A / B;
                        break;
                    case "%":
                        result = A % B; 
                        break;
                    default:
                        System.out.println("Operator tidak dapat dioperasikan");
                        break;
                }
                System.out.println(result);
        }else{
            System.out.println("Bilangan pertama harus lebih dari sama dengan 1 dan bilangan kedua harus kurang dari sama dengan 1000");
        }
        scanner.close();
    }
}
