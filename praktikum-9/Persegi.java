/**
* File : Persegi.java
* Deskripsi : Kelas untuk bangun datar persegi
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class Persegi<T extends Number> extends BangunDatarGenerik<T> {
    // Constructor
    public Persegi(T sisi) {
        super(sisi);
    }
    
    // Implementasi metode abstract dari kelas induk
    @Override
    public double hitungLuas() {
        // Luas persegi = sisi * sisi
        double sisi = panjang.doubleValue();
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        // Keliling persegi = 4 * sisi
        double sisi = panjang.doubleValue();
        return 4 * sisi;
    }
}