/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 13/03/2025
 */

public class Persegi extends BangunDatar {
    /* ATRIBUT */
    private double sisi;

    /* METHOD */
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        // super(4, warna, border);
        this.sisi = sisi;
        this.warna = warna;
        this.border = border;
        this.jmlSisi = 4;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2 * (sisi * sisi));
    }

    @Override // opsional, hanya sebagai penanda
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

}
