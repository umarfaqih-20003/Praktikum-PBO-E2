/**
 * Nama File : Datum.java
 * Deskripsi : kelas generik untuk menyimpan data
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : 1 Mei 2025
 */

 public class Datum<T> {
    // Atribut generik
    private T isi;
    
    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }
    
    // Getter untuk isi
    public T getIsi() {
        return isi;
    }
    
    // Setter untuk isi
    public void setIsi(T isi) {
        this.isi = isi;
    }
}