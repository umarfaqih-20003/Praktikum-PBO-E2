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
    Garis(){
        this.awal = new Titik(0,0);
        this.akhir = new Titik(1,1);
        counterGaris++;
    }
    Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Titik getAwal(){
        return awal;
    }

    Titik getAkhir(){
        return akhir;
    }

    void setAwal(Titik awal){
        this.awal =awal;
    }

    void setAkhir(Titik akhir){
        this.akhir = akhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    double getPanjang(){
        return awal.getJarak(akhir);
    }

    double getGradien(){
        return ((akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis()));
    }

    Titik getTitikTengah(){
        return new Titik(((awal.getAbsis() + akhir.getAbsis()) / 2),((awal.getOrdinat() + akhir.getOrdinat()) / 2));
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Titik awal = (" + awal.getAbsis() + ", " + awal.getOrdinat() + ")" + ", Titik akhir = (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }

    void printPersamaanGaris(){
        System.out.println("y = " + getGradien() + "x + " + (awal.getOrdinat() - (getGradien() * awal.getAbsis())));
    }

}
