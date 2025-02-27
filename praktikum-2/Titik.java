/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 27/02/2025
 */

 public class Titik {
    /* ATRIBUT */    
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* METHOD */
    //konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai absis
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan kuadran dari titik
    public int getKuadran(){
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
    public double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    //mengembalikan jarak antar titik
    public double getJarak(Titik T){
        return Math.sqrt(((T.absis - this.absis)*(T.absis - this.absis)) + ((T.ordinat - this.ordinat)*(T.ordinat - this.ordinat)));
    }

    //merefleksikan titik dengan sumbu X
    public void refleksiX(){
        absis = -absis;
    }

    //merefleksikan titik dengan sumbu Y
    public void refleksiY(){
        ordinat = -ordinat;
    }

    //mengembalikan nilai refleksi oleh sumbu X
    public Titik getRefleksiX(){
        return new Titik(-absis,ordinat);
    }

    //mengembalikan nilai refleksi oleh sumbu X
    public Titik getRefleksiY(){
        return new Titik(absis,-ordinat);
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
} //endclass
