/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 27/02/2025
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat garis G1 dan garis G3 dengan titik awal (0,0) dan titik akhir (1,1)
        Garis G1 = new Garis();
        Garis G3 = new Garis();

        // Membuat garis baru dengan masukan titik yang sudah ada
        Titik T1 = new Titik(1,2);
        Titik T2 = new Titik(3,5);
        Titik T3 = new Titik(5,7);
        Titik T4 = new Titik(9,11);
        Garis G2 = new Garis(T1, T2);
        
        // Selektor titik awal dari garis G1 dan garis G2
        System.out.println("Titik awal garis G1 = (" + G1.getAwal().getAbsis() + ", " + G1.getAwal().getOrdinat() + ")");
        System.out.println("Titik awal garis G2 = (" + G2.getAwal().getAbsis() + ", " + G2.getAwal().getOrdinat() + ")");

        // Selektor titik akhir dari garis G1 dan garis G2
        System.out.println("Titik akhir garis G1 = (" + G1.getAkhir().getAbsis() + ", " + G1.getAkhir().getOrdinat() + ")");
        System.out.println("Titik akhir garis G2 = (" + G2.getAkhir().getAbsis() + ", " + G2.getAkhir().getOrdinat() + ")");

        // Mengeset garis G3  dengan titik awal T3
        G3.setAwal(T3);

        // Mengeset garis G3 dengan titik akhir T4
        G3.setAkhir(T4);

        // Mengecek titik awal garis G3 setelah dilakukan mutator titik awal T3
        System.out.println("Titik awal garis G3 = (" + G3.getAwal().getAbsis() + ", " + G3.getAwal().getOrdinat() + ")");

        // Mengecek titik akhir garis G3 setelah dilakukan mutator titik akhir T4
        System.out.println("Titik akhir garis G3 = (" + G3.getAkhir().getAbsis() + ", " + G3.getAkhir().getOrdinat() + ")");

        // Selektor getCounter
        System.out.println("Jumlah garis yang dibuat = " + Garis.getCounterGaris());

        // Selektor panjang dari garis G1
        System.out.println("Panjang garis G1 = " + G1.getPanjang());

        // Selektor gradien dari garis G2
        System.out.println("Gradien garis G2 = " + G2.getGradien());

        // Selektor titik tengah dari garis G3
        System.out.println("Titik tengah garis G3 = (" + G3.getTitikTengah().getAbsis() + ", " + G3.getTitikTengah().getOrdinat() + ")");

        // Mengecek apakah garis G1 sejajar dengan garis G2
        System.out.println("Apakah garis G1 sejajar dengan garis G2? = " + G1.isSejajar(G2));

        // Mengecek apakah garis G2 tegak lurus dengan garis G3
        System.out.println("Apakah garis G2 tegak lurus dengan garis G3? = " + G2.isTegakLurus(G3));

        // Menampilkan ke layar titik awal dan titik akhir dari garis G2
        G2.printGaris();

        // Menampilkan persamaan garis dalam bentuk string dari garis G3
        G3.printPersamaanGaris();

    }
    
}
