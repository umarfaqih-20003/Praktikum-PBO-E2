/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 21/02/2025
 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();

    Titik T1 = new Titik(1,2);
    Titik T2 = new Titik(3,5);
    Titik T3 = new Titik(5,7);
    Titik T4 = new Titik(9,11);
    Garis G2 = new Garis(T1, T2);
    Garis G3 = new Garis();

    System.out.println("Titik awal garis 1 = (" + G1.getAwal().getAbsis() + ", " + G1.getAwal().getOrdinat() + ")");
    System.out.println("Titik awal garis 2 = (" + G2.getAwal().getAbsis() + ", " + G2.getAwal().getOrdinat() + ")");
    System.out.println("Titik akhir garis 1 = (" + G1.getAkhir().getAbsis() + ", " + G1.getAkhir().getOrdinat() + ")");
    System.out.println("Titik akhir garis 2 = (" + G2.getAkhir().getAbsis() + ", " + G2.getAkhir().getOrdinat() + ")");

    G3.setAwal(T3);
    G3.setAkhir(T4);
    System.out.println("Titik awal garis 3 = (" + G3.getAwal().getAbsis() + ", " + G3.getAwal().getOrdinat() + ")");
    System.out.println("Titik akhir garis 3 = (" + G3.getAkhir().getAbsis() + ", " + G3.getAkhir().getOrdinat() + ")");

    System.out.println("Jumlah garis yang dibuat = " + Garis.getCounterGaris());
    System.out.println("Panjang garis 1 = " + G1.getPanjang());
    System.out.println("Gradien garis 2 = " + G2.getGradien());
    System.out.println("Titik tengah garis 3 = (" + G3.getTitikTengah().getAbsis() + ", " + G3.getTitikTengah().getOrdinat() + ")");
    System.out.println("Apakah G1 sejajar dengan garis 2? = " + G1.isSejajar(G2));
    System.out.println("Apakah G2 tegak lurus dengan garis 3? = " + G2.isTegakLurus(G3));

    G2.printGaris();
    G2.printPersamaanGaris();

    }
    
}
