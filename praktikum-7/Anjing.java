/* Nama File    : Anjing.java
 * Deskripsi    : Implementasi class Anjing
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Anjing extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    /* Constructor dengan parameter nama */
    public Anjing(String nama) {
        super(nama); // Memanggil constructor kelas induk
    }
    
    /* Implementasi method bersuara */
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: Guk-guk!");
    }
    
    /* Implementasi method bergerak */
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan: Melata");
    }
}