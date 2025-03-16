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
    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        this.masaKerja = hitungMasaKerja(tmt);
    }
    
    /**
     * Method untuk menghitung masa kerja dari TMT sampai saat ini
     * @param tmt Tanggal Mulai Tanggal bekerja
     * @return Masa kerja dalam bulan
     */
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
    
    /**
     * Method untuk menghitung BUP (Batas Usia Pensiun)
     * @return Tanggal BUP
     */
    public abstract String hitungBUP();
    
    /**
     * Method untuk menghitung tunjangan
     * @return Nilai tunjangan
     */
    public abstract double hitungTunjangan();
    
    /**
     * Method untuk menampilkan informasi pegawai
     */
    public abstract void printInfo();
}