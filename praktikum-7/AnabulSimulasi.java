/* Nama File    : AnabulSimulasi.java
 * Deskripsi    : Main program dari class Anabul
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class AnabulSimulasi {
    public static void main(String[] args) {
        /* Membuat array dari objek Anabul */
        Anabul[] anabuls = new Anabul[3];
        
        /* Mengisi array dengan objek dari kelas turunan */
        anabuls[0] = new Kucing("Kitty");
        anabuls[1] = new Anjing("Buddy");
        anabuls[2] = new Burung("Tweety");
        
        /* Menampilkan header */
        System.out.println("=== SIMULASI ANABUL ===");
        
        /* Mensimulasikan bunyi dan gerakan setiap anabul */
        for (Anabul anabul : anabuls) {
            System.out.println("\n-- Informasi " + anabul.getClass().getSimpleName() + " --");
            anabul.bersuara();
            anabul.bergerak();
        }
        
        /* Menampilkan footer */
        System.out.println("\n=== SIMULASI SELESAI ===");
    }
}