/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus
 */
public class barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        this.stok = stk;
    }
    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah penambahan stok harus lebih dari 0.");
        }
    }
}
