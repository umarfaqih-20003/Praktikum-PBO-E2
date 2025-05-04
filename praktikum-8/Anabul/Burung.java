/**
 * Nama File : Burung.java
 * Deskripsi : kelas untuk hewan peliharaan jenis burung
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : 1 Mei 2025
 */

 public class Burung extends Anabul {
    
    // Konstruktor
    public Burung(String nama) {
        super(nama);
    }
    
    // Implementasi metode bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: cuit");
    }
    
    // Implementasi metode bergerak
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
}