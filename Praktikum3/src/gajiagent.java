/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class gajiagent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = scanner.nextInt();
        int gajiPokok = 500000;
        int hargaItem = 50000;
        double bonusPenjualan = 0;
        double denda = 0;
        double bonusItem = 0;

        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) {
            bonusPenjualan = 0.25 * jumlahPenjualan * hargaItem;
        } else if (jumlahPenjualan > 80) {
            bonusPenjualan = 0.35 * jumlahPenjualan * hargaItem;
        } else if (jumlahPenjualan < 15) {
            denda = (15 - jumlahPenjualan) * 0.15 * hargaItem;
        } else{
            bonusItem = 0.10 * jumlahPenjualan * hargaItem;
        }
        int totalPendapatan = (int) (gajiPokok + bonusPenjualan + bonusItem - denda);

        System.out.println("Total pendapatan: Rp " + totalPendapatan);
    }
}
