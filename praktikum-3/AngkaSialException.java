/**
 * File         : AngkaSialException.java
 * Deskripsi    : Ekspresi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 6 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
