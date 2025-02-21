/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Februari 2025
 */

public class Titik {
    /* ATRIBUT */    
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* METHOD */
    //konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai absis
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan kuadran dari titik
    int getKuadran(){
        if ((absis > 0) && (ordinat > 0)){
            return 1;
        }
        else if ((absis < 0) && (ordinat > 0)){
            return 2;
        }
        else if ((absis < 0) && (ordinat < 0)){
            return 3;
        }
        else if ((absis > 0) && (ordinat < 0)){
            return 4;
        }
        else {
            return -1;
        }
    }

    //mengembalikan jarak titik dengan titik pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    //mengembalikan jarak antar titik
    double getJarak(Titik T){
        return Math.sqrt(((T.absis - this.absis)*(T.absis - this.absis)) + ((T.ordinat - this.ordinat)*(T.ordinat - this.ordinat)));
    }

    //merefleksikan titik dengan sumbu X
    void refleksiX(){
        absis = -absis;
    }

    //merefleksikan titik dengan sumbu Y
    void refleksiY(){
        ordinat = -ordinat;
    }

    //mengembalikan nilai refleksi oleh sumbu X
    Titik getRefleksiX(){
        return new Titik(-absis,ordinat);
    }

    //mengembalikan nilai refleksi oleh sumbu X
    Titik getRefleksiY(){
        return new Titik(absis,-ordinat);
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
} //endclass
