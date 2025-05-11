/**
* File : Anabul.java
* Deskripsi : Kelas induk untuk hewan peliharaan
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public abstract class Anabul {
    // Atribut
    protected String nama;
    
    // Constructor
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    // Getter dan setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Metode abstract yang akan diimplementasikan oleh kelas anak
    public abstract String bersuara();
    public abstract String bergerak();
    
    // Override toString untuk menampilkan info anabul
    @Override
    public String toString() {
        return "Nama: " + nama + ", Suara: " + bersuara() + ", Gerakan: " + bergerak();
    }
}