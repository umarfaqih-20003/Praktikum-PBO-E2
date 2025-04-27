/* Nama File    : Anabul.java
 * Deskripsi    : Implementasi class Anabul
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public abstract class Anabul {
    /* ATRIBUT */
    protected String nama;
    
    /* METHOD */
    /* Constructor dengan parameter nama */
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    /* Method abstract yang harus diimplementasikan di kelas turunan */
    public abstract void bersuara();
    public abstract void bergerak();
    
    /* Getter untuk nama */
    public String getNama() {
        return nama;
    }
}