/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumlima;

import java.util.Scanner;
import java.util.logging.*;

public class Utama {
    private static final Logger logger = Logger.getLogger(Utama.class.getName());

    static class Produk {
        String namaProduk;
        int harga;
        int qty;

        Produk(String namaProduk, int harga, int qty) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.qty = qty;
        }

        int hitungTotal() {
            return harga * qty;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargatotal = 0;
        String keputusan = "Y";

        Produk[] menu = new Produk[10]; // Maksimum 10 menu
        menu[0] = new Produk("Batagor", 5000, 0);
        menu[1] = new Produk("Roti Bakar", 12000, 0);
        menu[2] = new Produk("Indomie+Telor", 10000, 0);
        menu[3] = new Produk("Kwetiaw", 12000, 0);
        menu[4] = new Produk("Nasi Goreng", 12000, 0);
        menu[5] = new Produk("Air Mineral", 3000, 0);
        menu[6] = new Produk("Teh Manis", 4000, 0);
        menu[7] = new Produk("Jus Alpukat", 8000, 0);
        menu[8] = new Produk("Teh Botol", 5000, 0);
        menu[9] = new Produk("Kopi", 3000, 0);

        logger.info("Daftar Menu Makanan ");
        logger.info("--------------------------------");
        for (int j = 0; j < 10; j++) {
            if (menu[j] != null) { // Pastikan elemen tidak null sebelum mengaksesnya
                String menuString = String.format("%-2d. %-20s = Rp %d", (j + 1), menu[j].namaProduk, menu[j].harga);
                logger.info(menuString);
            }
        }

        while (keputusan.equalsIgnoreCase("Y")) {
            logger.info("Pilih nomor menu yang akan dipesan: ");
            int pilihan = input.nextInt();
            if (pilihan >= 1 && pilihan <= 10) {
                logger.info("Jumlah yang akan dipesan: ");
                int jumlah = input.nextInt();
                menu[pilihan - 1].qty += jumlah;
                logger.info("Ingin memesan lagi? (Y/N): ");
                keputusan = input.next();
            } else {
                logger.warning("Menu tidak valid.");
            }
        }

        logger.info("\nMenu yang dipesan beserta total bayar nya:");
        for (int j = 0; j < 10; j++) {
            if (menu[j].qty > 0) {
                String pesan = menu[j].namaProduk + " (" + menu[j].qty + " x Rp " + menu[j].harga + ") = Rp " + menu[j].hitungTotal();
                logger.info(pesan);
                hargatotal += menu[j].hitungTotal();
            }
        }

        String total = "\nTotal Bayar: Rp " + hargatotal;
        logger.info(total);
    }
}
