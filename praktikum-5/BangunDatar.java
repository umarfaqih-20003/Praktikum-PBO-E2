/**
 * Nama File    : BangunDatar.java
 * Deskripsi    : Abstract class untuk representasi bangun datar
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

 public abstract class BangunDatar {
    protected String warna;
    protected String border;
    
    // Constructor
    public BangunDatar() {
        this.warna = "Putih";
        this.border = "Hitam";
    }
    
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }
    
    // Getter and Setter
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }
    
    // Abstract methods
    public abstract double getLuas();
    public abstract double getKeliling();
    
    // Method untuk membandingkan luas
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    
    // Method untuk membandingkan keliling
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}