/**
 * Nama File    : PNS.java
 * Deskripsi    : Class PNS untuk implementasi sistem perpajakan
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia {
    private String nip;
    private LocalDate tglMulaiKerja;
    private static int counterPNS = 0;
    
    // Constructor
    public PNS(String nama, LocalDate tglLahir, String alamat, double pendapatan, String nip) {
        super(nama, tglLahir, alamat, pendapatan);
        this.nip = nip;
        // Extract date from NIP (format: 198302032006041002)
        // Assuming tglMulaiKerja is encoded in NIP: position 9-16 (YYYYMMDD)
        if (nip.length() >= 18) {
            int year = Integer.parseInt(nip.substring(8, 12));
            int month = Integer.parseInt(nip.substring(12, 14));
            int day = Integer.parseInt(nip.substring(14, 16));
            this.tglMulaiKerja = LocalDate.of(year, month, day);
        } else {
            this.tglMulaiKerja = LocalDate.now();
        }
        counterPNS++;
    }
    
    public PNS(String nama, LocalDate tglLahir, double pendapatan, String nip) {
        super(nama, tglLahir, pendapatan);
        this.nip = nip;
        // Extract date from NIP
        if (nip.length() >= 18) {
            int year = Integer.parseInt(nip.substring(8, 12));
            int month = Integer.parseInt(nip.substring(12, 14));
            int day = Integer.parseInt(nip.substring(14, 16));
            this.tglMulaiKerja = LocalDate.of(year, month, day);
        } else {
            this.tglMulaiKerja = LocalDate.now();
        }
        counterPNS++;
    }
    
    // Getter and Setter
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }
    
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    // Implementasi method abstract
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan; // 10% dari pendapatan
    }
    
    @Override
    public int hitungMasaKerja() {
        // Masa kerja = (now - tgl_mulai_kerja) + A
        // A = digit ke 14 dari NIM (kita gunakan 4 sebagai contoh)
        int digitA = 4; // Ganti dengan digit ke-14 dari NIM Anda
        
        Period period = Period.between(tglMulaiKerja, LocalDate.now());
        return period.getYears() + digitA;
    }
    
    // Override for cetakInfo to include PNS specific attributes
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
        System.out.println();
    }
}
