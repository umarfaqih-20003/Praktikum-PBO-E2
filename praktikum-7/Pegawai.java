/* Nama File    : Pegawai.java
 * Deskripsi    : Implementasi class Pegawai
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Pegawai {
    /* ATRIBUT */
    protected String nama;
    protected int gajiPokok = 5000000;

    /* METHOD */
    Pegawai () {

    }

    Pegawai (String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", " + "Gaji pokok : " + gajiPokok);
    }
}
