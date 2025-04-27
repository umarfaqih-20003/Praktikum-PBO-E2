/* Nama File    : Kucing.java
 * Deskripsi    : Implementasi class Kucing
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Kucing extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    /* Constructor dengan parameter nama */
    public Kucing(String nama) {
        super(nama); // Memanggil constructor kelas induk
    }
    
    /* Implementasi method bersuara */
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: Meong!");
    }
    
    /* Implementasi method bergerak */
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan: Melata");
    }
}