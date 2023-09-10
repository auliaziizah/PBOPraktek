/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class array {
    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};

        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

        // Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

        // Loop to print the arrays in the desired format
        int length1 = threeDimensionalArray.length;
        for (int i = 0; i < length1; i++) {
            int[][] twoDArray = threeDimensionalArray[i];
            int length2 = twoDArray.length;
            System.out.print("{");
            for (int j = 0; j < length2; j++) {
                int[] oneDArray = twoDArray[j];
                int length3 = oneDArray.length;
                System.out.print("{");
                for (int k = 0; k < length3; k++) {
                    System.out.print(oneDArray[k]);
                    if (k < length3 - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print(" }");
                if (j < length2 - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" }");
        }
    }
}
