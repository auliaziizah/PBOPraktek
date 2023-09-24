/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumlima;

import java.util.logging.*;

public class RestaurantMain {
    private static final Logger logger = Logger.getLogger(RestaurantMain.class.getName());

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        while (true) {
            logger.info("\nMenu Makanan:");
            menu.tampilMenuMakanan();
            menu.pesanMakanan();
            logger.info("Apakah ingin memesan lagi? (Y/N)");
            String jawaban = menu.scanner.next();
            if (!jawaban.equalsIgnoreCase("Y")) {
                break;
            }
        }

        menu.tutupScanner();
    }
}
