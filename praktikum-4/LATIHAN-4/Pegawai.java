/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 16/03/2025
 */

 abstract class Pegawai {
    /* ATRIBUT */
    protected String nip;
    protected String nama;
    protected String tanggalLahir;
    protected String tmt;
    protected double gajiPokok;
    protected int masaKerja; 
    
    /* METHOD */
    // konstruktor Pegawai
    public Pegawai() {

    }
    
    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        this.masaKerja = hitungMasaKerja(tmt);
    }
    
    protected int hitungMasaKerja(String tmt) {
        // Pisahkan tanggal TMT menjadi komponen hari, bulan, dan tahun
        String[] parts = tmt.split(" ");
        int hari = Integer.parseInt(parts[0]);
        int bulan = getBulanIndex(parts[1]);
        int tahun = Integer.parseInt(parts[2]);
        
        // Tanggal saat ini: 10 Maret 2025
        int hariIni = 10;
        int bulanIni = 3; // Maret
        int tahunIni = 2025;
        
        // Hitung selisih dalam bulan
        int selisihTahun = tahunIni - tahun;
        int selisihBulan = bulanIni - bulan;
        
        int totalBulan = selisihTahun * 12 + selisihBulan;
        
        // Koreksi jika tanggal di bulan ini belum mencapai tanggal TMT
        if (hariIni < hari) {
            totalBulan--;
        }
        
        return totalBulan;
    }
    
    // method bantuan untuk mendapatkan index bulan dari nama bulan
    protected int getBulanIndex(String namaBulan) {
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        for (int i = 0; i < bulan.length; i++) {
            if (bulan[i].equalsIgnoreCase(namaBulan)) {
                return i + 1;
            }
        }
        return 0; 
    }
    
    public abstract String hitungBUP();
    
    public abstract double hitungTunjangan();
    
    public abstract void printInfo();
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public String getTmt() {
        return tmt;
    }
    
    public void setTmt(String tmt) {
        this.tmt = tmt;
        // Update masa kerja saat TMT diubah
        this.masaKerja = hitungMasaKerja(tmt);
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int getMasaKerja() {
        return masaKerja;
    }
    
    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }
}