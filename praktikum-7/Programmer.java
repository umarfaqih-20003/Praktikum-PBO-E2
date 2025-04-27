/* Nama File    : Programmer.java
 * Deskripsi    : Implementasi class Programmer
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Programmer extends Pegawai {
    /* ATRIBUT */
    private int bonus = 450000;

    /* METHOD */
    Programmer () {

    }

    Programmer (String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData () {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
