/**
     * File         : Asersi2.java
     * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
     * Pembuat      : Umar Faqih / 24060123120003
     * Tanggal      : 6 Maret 2025
     */


class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling () {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas adalah penempatan asersi yang kurang efektif dan tidak ada fungsi validasi dalam konstruktor yang menyebabkan tetap bisa dibuat dengan jadi-jari = 0
 * 
 */