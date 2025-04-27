/* Nama File    : Overloading.java
 * Deskripsi    : Contoh implementasi polimorfisme overloading
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Overloading {

    int tambah (int x, int y) {
        return x + y;
    }

    int tambah (int x, int y, int z) {
        return x + y + z;
    }

    double tambah (double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Overloading O = new Overloading();

        System.out.println(O.tambah(1,2));
        System.out.println(O.tambah(1,2,3));
        System.out.println(O.tambah(1.5,2.5));
    }
}
