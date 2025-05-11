/**
* File : Anjing.java
* Deskripsi : Kelas untuk hewan peliharaan jenis anjing
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class Anjing extends Anabul {
    // Constructor
    public Anjing(String nama) {
        super(nama);
    }
    
    // Implementasi metode abstract dari kelas induk
    @Override
    public String bersuara() {
        return "guk-guk";
    }
    
    @Override
    public String bergerak() {
        return "melata";
    }
}