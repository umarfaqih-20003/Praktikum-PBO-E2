/**
 * Nama File    : Petani.java
 * Deskripsi    : Class Petani untuk implementasi sistem perpajakan
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia {
    private String lokasiBertani;
    private LocalDate tglMulaiKerja;
    private static int counterPetani = 0;
    
    // Constructor
    public Petani(String nama, LocalDate tglLahir, String alamat, double pendapatan, String lokasiBertani) {
        super(nama, tglLahir, alamat, pendapatan);
        this.lokasiBertani = lokasiBertani;
        this.tglMulaiKerja = tglLahir.plusYears(15); // Asumsi mulai bertani saat umur 15 tahun
        counterPetani++;
    }
    
    // Getter and Setter
    public String getLokasiBertani() {
        return lokasiBertani;
    }
    
    public void setLokasiBertani(String lokasiBertani) {
        this.lokasiBertani = lokasiBertani;
    }
    
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }
    
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    // Implementasi method abstract
    @Override
    public double hitungPajak() {
        return 0; // Petani tidak kena pajak (0%)
    }
    
    @Override
    public int hitungMasaKerja() {
        // Masa kerja = (now - tgl_mulai_kerja) + C
        // C = digit ke 12 dari NIM (kita gunakan 2 sebagai contoh)
        int digitC = 2; // Ganti dengan digit ke-12 dari NIM Anda
        
        Period period = Period.between(tglMulaiKerja, LocalDate.now());
        return period.getYears() + digitC;
    }
    
    // Override for cetakInfo to include Petani specific attributes
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Lokasi Bertani: " + lokasiBertani);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
        System.out.println();
    }
}
