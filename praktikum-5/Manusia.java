/**
 * Nama File    : Manusia.java
 * Deskripsi    : Class dasar untuk implementasi sistem perpajakan
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglLahir;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    // Constructor
    public Manusia(String nama, LocalDate tglLahir, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public Manusia(String nama, LocalDate tglLahir, double pendapatan) {
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = "";
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    // Getter and Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public LocalDate getTglLahir() {
        return tglLahir;
    }
    
    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    
    // Abstract Methods
    public abstract double hitungPajak();
    public abstract int hitungMasaKerja();
    
    // Method for printing info
    public void cetakInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("=== Informasi " + this.getClass().getSimpleName() + " ===");
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir.format(formatter));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
