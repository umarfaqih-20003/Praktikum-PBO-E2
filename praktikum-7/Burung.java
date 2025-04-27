/* Nama File    : Burung.java
 * Deskripsi    : Implementasi class Burung
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Burung extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    /* Constructor dengan parameter nama */
    public Burung(String nama) {
        super(nama); // Memanggil constructor kelas induk
    }
    
    /* Implementasi method bersuara */
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: Cuit!");
    }
    
    /* Implementasi method bergerak */
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan: Terbang");
    }
}