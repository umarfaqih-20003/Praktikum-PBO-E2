/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi main program dari class BangunDatar
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 13/03/2025
 */

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar B1 = new BangunDatar();

        B1.setJmlSisi(3);
        B1.setWarna("Merah");
        B1.setBorder("Hitam");

        Persegi P1 = new Persegi(5, "Merah", "Hijau");

        Lingkaran L1 = new Lingkaran(7, "Hijau", "Merah");

        System.out.println("===== Info Bangun Datar =====");
        B1.printInfo();

        System.out.println("");
        System.out.println("===== Info Persegi =====");
        // System.out.println("Warna Persegi: " + P1.getWarna());
        // System.out.println("Jumlah Sisi Persegi: " + P1.getJmlSisi());
        // System.out.println("Border Persegi: " + P1.getBorder());
        // System.out.println("Ukuran Sisi Persegi: " + P1.getSisi());
        P1.printInfo();

        System.out.println("");
        System.out.println("===== Info Lingkaran =====");
        System.out.println("Warna Lingkaran: " + L1.getWarna());
        System.out.println("Jumlah Sisi Lingkaran: " + L1.getJmlSisi());
        System.out.println("Border Lingkaran: " + L1.getBorder());
        System.out.println("Ukuran Jari-Jari Lingkaran: " + L1.getJari());

        System.out.println("");
        BangunDatar.printCounterBangunDatar();
    }
}
