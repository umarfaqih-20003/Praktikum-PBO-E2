/* Nama File    : Manajer.java
 * Deskripsi    : Implementasi class Manajer
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Manajer extends Pegawai {
    /* ATRIBUT */
    private int tunjangan = 700000;

    /* METHOD */
    Manajer () {

    }

    Manajer (String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData () {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
