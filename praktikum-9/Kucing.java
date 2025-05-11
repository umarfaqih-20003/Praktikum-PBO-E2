/**
* File : Kucing.java
* Deskripsi : Kelas untuk hewan peliharaan jenis kucing
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class Kucing extends Anabul {
    // Constructor
    public Kucing(String nama) {
        super(nama);
    }
    
    // Implementasi metode abstract dari kelas induk
    @Override
    public String bersuara() {
        return "meong";
    }
    
    @Override
    public String bergerak() {
        return "melata";
    }
}