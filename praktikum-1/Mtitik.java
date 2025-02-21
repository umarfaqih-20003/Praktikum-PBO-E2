/* Nama File    : Mtitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20/02/2025
 */

 public class Mtitik { 
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        T1.refleksiX();
        T1.printTitik();
        T1.refleksiY();
        T1.printTitik();
  
        // Titik T3 = new Titik(); //Membuat objek titik T3 (0,0)
        // Titik T4 = new Titik(3,5); //Membuat objek titik T4 (3,5)

        // System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());
        System.out.println("Kuadran = " + T1.getKuadran());
        System.out.println("Jarak Pusat = " + T1.getJarakPusat());
        System.out.println("Jarak Titik = " + T2.getJarak(T1));

        Titik T3 = T1.getRefleksiX();
        Titik T4 = T1.getRefleksiY();
        T3.printTitik();
        T4.printTitik();

    }
 }
