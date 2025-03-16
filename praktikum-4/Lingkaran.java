/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 13/03/2025
 */

public class Lingkaran extends BangunDatar {
    /* ATRIBUT */
    private double jari;

    /* METHOD */
    public Lingkaran() {
        setJmlSisi(1);

    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter / 2;
        // setBorder(border);
        // setWarna(warna);
        // setJmlSisi(1);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
}
