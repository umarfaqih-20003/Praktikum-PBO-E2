/**
 * Nama File    : Lingkaran.java
 * Deskripsi    : Implementasi bangun datar lingkaran
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

 public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;
    
    // Constructor
    public Lingkaran() {
        super();
        this.jariJari = 1.0;
    }
    
    public Lingkaran(double jariJari) {
        super();
        this.jariJari = jariJari;
    }
    
    public Lingkaran(double jariJari, String warna, String border) {
        super(warna, border);
        this.jariJari = jariJari;
    }
    
    // Getter and Setter
    public double getJariJari() {
        return jariJari;
    }
    
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    // Implementasi method abstract
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }
    
    // Implementasi interface IResize
    @Override
    public void zoomIn() {
        jariJari = jariJari * 1.1;
    }
    
    @Override
    public void zoomOut() {
        jariJari = jariJari * 0.9;
    }
    
    @Override
    public void zoom(double factor) {
        jariJari = jariJari * factor;
    }
}