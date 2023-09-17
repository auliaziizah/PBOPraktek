/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus
 */

public class inventori {
    private barang[] barangs;

    public void initBarang() {
        barangs = new barang[2];
        barangs[0] = new barang("001", "Baju", 10);
        barangs[1] = new barang("002", "Celana", 20);
    }

    public void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }

    public void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);
        showBarang();
    }
public static void main(String[] args) {
        inventori beli = new inventori();
        beli.pengadaan();
    }
}
