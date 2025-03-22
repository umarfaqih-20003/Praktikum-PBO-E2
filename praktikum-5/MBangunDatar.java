/**
 * Nama File    : MainBangunDatar.java
 * Deskripsi    : Main class untuk menguji implementasi BangunDatar dan IResize
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 20 Maret 2025
 */

 public class MBangunDatar {
    public static void main(String[] args) {
        // Percobaan instantiasi objek
        // BangunDatar B1 = new BangunDatar(); // Error: Cannot instantiate abstract class
        
        // Menggunakan reference type BangunDatar
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);
        
        // Memanggil method dari objek Persegi dan Lingkaran
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling P2: " + P2.getKeliling());
        
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L1: " + L1.getKeliling());
        System.out.println("Luas L2: " + L2.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());
        
        // Mengecek apakah luas sama
        System.out.println("P1 sama luas dengan P2: " + P1.isEqualLuas(P2));
        System.out.println("P1 sama keliling dengan L1: " + P1.isEqualKeliling(L1));
        
        // Testing IResize
        System.out.println("\nTesting IResize:");
        System.out.println("Sisi Persegi P2 sebelum zoom: " + P2.getSisi());
        P2.zoomIn();
        System.out.println("Sisi Persegi P2 setelah zoomIn: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Sisi Persegi P2 setelah zoomOut: " + P2.getSisi());
        P2.zoom(2.0);
        System.out.println("Sisi Persegi P2 setelah zoom(2.0): " + P2.getSisi());
        
        System.out.println("Jari-jari Lingkaran L2 sebelum zoom: " + L2.getJariJari());
        L2.zoomIn();
        System.out.println("Jari-jari Lingkaran L2 setelah zoomIn: " + L2.getJariJari());
        L2.zoomOut();
        System.out.println("Jari-jari Lingkaran L2 setelah zoomOut: " + L2.getJariJari());
        L2.zoom(3.0);
        System.out.println("Jari-jari Lingkaran L2 setelah zoom(3.0): " + L2.getJariJari());
    }
}