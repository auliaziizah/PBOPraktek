/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpbo2;

/**
 *
 * @author Asus
 */
    public class ConvertDataType {
        static short methodOne(long l){ //konversi tipe data long menjadi short
            int i = (int) l;
            return (short)i; 
        }
        public static void main(String[] args)
        {
            double d = 10.25;
            float f = (float) d; 
            byte b = (byte) methodOne((long) f); 
            System.out.println(b);
        }
    }
