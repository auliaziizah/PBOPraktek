/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumlima;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;

class MenuItem {
    private final String nama;
    private final double harga;
    private int stok;
    private static final Logger logger = Logger.getLogger(MenuItem.class.getName());

    public MenuItem(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            String stokAda = ("Pesanan " + nama + " sejumlah " + jumlah + " telah dipesan.");
            logger.info(stokAda);
        } else {
            String stokKosong = ("Stok " + nama + " tidak mencukupi."); 
            logger.info(stokKosong);
        }
    }
}

public class Restaurant {
    private final ArrayList<MenuItem> menu = new ArrayList<>();
    final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        MenuItem item = new MenuItem(nama, harga, stok);
        menu.add(item);
        String berhasilPesan = ("Menu " + nama + " telah ditambahkan.");
        logger.info(berhasilPesan);
    }

    public void tampilMenuMakanan() {
        for (MenuItem item : menu) {
            if (item.getStok() > 0) {
                logger.log(Level.INFO, "{0}[{1}]\tRp. {2}", new Object[]{item.getNama(), item.getStok(), item.getHarga()});
            }
        }
    }

    public void pesanMakanan() {
        logger.info("Masukkan nama makanan yang ingin dipesan: ");
        String nama = scanner.nextLine();
        logger.info("Masukkan jumlah yang ingin dipesan: ");
        int jumlah = scanner.nextInt();

        for (MenuItem item : menu) {
            if (item.getNama().equals(nama)) {
                item.kurangiStok(jumlah);
                tampilMenuMakanan();
                return;
            }
        }
        String menuTidakDitemukan = ("Menu " + nama + " tidak ditemukan.");
        logger.info(menuTidakDitemukan);
    }

    public void tutupScanner() {
        scanner.close();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.tambahMenuMakanan("Nasi Goreng", 25000, 10);
        restaurant.tambahMenuMakanan("Mie Goreng", 22000, 8);
        restaurant.tambahMenuMakanan("Ayam Bakar", 35000, 12);

        restaurant.tampilMenuMakanan();
        restaurant.pesanMakanan();

        restaurant.tutupScanner();
    }
}
