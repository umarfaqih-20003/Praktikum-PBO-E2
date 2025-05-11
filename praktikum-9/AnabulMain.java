/**
* File : AnabulMain.java
* Deskripsi : Main class untuk menguji hierarki kelas Anabul
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class AnabulMain {
    public static void main(String[] args) {
        // Membuat objek kucing
        Kucing kucing = new Kucing("Si Meong");
        System.out.println("== Kucing ==");
        System.out.println("Nama: " + kucing.getNama());
        System.out.println("Suara: " + kucing.bersuara());
        System.out.println("Gerakan: " + kucing.bergerak());
        System.out.println();
        
        // Membuat objek anjing
        Anjing anjing = new Anjing("Si Doggy");
        System.out.println("== Anjing ==");
        System.out.println("Nama: " + anjing.getNama());
        System.out.println("Suara: " + anjing.bersuara());
        System.out.println("Gerakan: " + anjing.bergerak());
        System.out.println();
        
        // Membuat objek burung
        Burung burung = new Burung("Si Kicau");
        System.out.println("== Burung ==");
        System.out.println("Nama: " + burung.getNama());
        System.out.println("Suara: " + burung.bersuara());
        System.out.println("Gerakan: " + burung.bergerak());
    }
}