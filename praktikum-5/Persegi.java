/**
 * Nama File    : Persegi.java
 * Deskripsi    : Implementasi bangun datar persegi
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

 public class Persegi extends BangunDatar implements IResize {
    private double sisi;
    
    // Constructor
    public Persegi() {
        super();
        this.sisi = 1.0;
    }
    
    public Persegi(double sisi) {
        super();
        this.sisi = sisi;
    }
    
    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
    }
    
    // Getter and Setter
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    // Implementasi method abstract
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    
    // Implementasi interface IResize
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }
    
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }
    
    @Override
    public void zoom(double factor) {
        sisi = sisi * factor;
    }
}