/**
     * File         : Asersi1.java
     * Deskripsi    : Program untuk menunjukkan asersi
     * Pembuat      : Umar Faqih / 24060123120003
     * Tanggal      : 6 Maret 2025
     */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode"; // dijalankan kalo kondisi assert bernilai false
            System.out.println("x bilangan negatif");
        }
    }
}
