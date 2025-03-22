/**
 * Nama File    : Pengusaha.java
 * Deskripsi    : Class Pengusaha untuk implementasi sistem perpajakan
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia {
    private String npwp;
    private LocalDate tglMulaiKerja;
    private static int counterPengusaha = 0;
    
    // Constructor
    public Pengusaha(String nama, LocalDate tglLahir, String alamat, double pendapatan, String npwp) {
        super(nama, tglLahir, alamat, pendapatan);
        this.npwp = npwp;
        this.tglMulaiKerja = tglLahir.plusYears(20); // Asumsi mulai usaha saat umur 20 tahun
        counterPengusaha++;
    }
    
    // Getter and Setter
    public String getNpwp() {
        return npwp;
    }
    
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }
    
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    // Implementasi method abstract
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan; // 15% dari pendapatan
    }
    
    @Override
    public int hitungMasaKerja() {
        // Masa kerja = (now - tgl_mulai_kerja) + B
        // B = digit ke 13 dari NIM (kita gunakan 3 sebagai contoh)
        int digitB = 3; // Ganti dengan digit ke-13 dari NIM Anda
        
        Period period = Period.between(tglMulaiKerja, LocalDate.now());
        return period.getYears() + digitB;
    }
    
    // Override for cetakInfo to include Pengusaha specific attributes
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
        System.out.println();
    }
}
