/**
* File : Burung.java
* Deskripsi : Kelas untuk hewan peliharaan jenis burung
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class Burung extends Anabul {
    // Constructor
    public Burung(String nama) {
        super(nama);
    }
    
    // Implementasi metode abstract dari kelas induk
    @Override
    public String bersuara() {
        return "cuit";
    }
    
    @Override
    public String bergerak() {
        return "terbang";
    }
}