/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 21/02/2025
 */


public class Garis {
    /* ATRIBUT */
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    /* METHOD */
    // Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    Garis(){
        this.awal = new Titik(0,0);
        this.akhir = new Titik(1,1);
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir
    Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // Selektor (getter) titik Awal
    Titik getAwal(){
        return awal;
    }

    // Selektor (getter) titik Akhir
    Titik getAkhir(){
        return akhir;
    }

    // Mutator (setter) titik Awal
    void setAwal(Titik awal){
        this.awal =awal;
    }

    // Mutator (setter) titik Akhir
    void setAkhir(Titik akhir){
        this.akhir = akhir;
    }

    // Selektor (getter) static counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    // Selektor panjang
    double getPanjang(){
        return awal.getJarak(akhir);
    }

    // Selektor gradien
    double getGradien(){
        return ((akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis()));
    }

    // Selektor titik tengah
    Titik getTitikTengah(){
        return new Titik(((awal.getAbsis() + akhir.getAbsis()) / 2),((awal.getOrdinat() + akhir.getOrdinat()) / 2));
    }

    // Mengecek apakah 2 garis sejajar
    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah 2 garis tegak lurus
    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan ke layar titik awal dan titik akhir
    void printGaris(){
        System.out.println("Titik awal = (" + awal.getAbsis() + ", " + awal.getOrdinat() + ")" + ", Titik akhir = (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    void printPersamaanGaris(){
        double m = getGradien();
        double c = awal.getOrdinat() - (getGradien() * awal.getAbsis());
        System.out.println("y = " + m + "x + " + c);
    }

}
