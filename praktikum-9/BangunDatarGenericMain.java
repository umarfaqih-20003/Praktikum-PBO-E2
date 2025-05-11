/**
* File : BangunDatarGenericMain.java
* Deskripsi : Main class untuk menguji kelas bangun datar generik
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class BangunDatarGenericMain {
    public static void main(String[] args) {
        // Membuat objek persegi dengan tipe Integer
        Persegi<Integer> persegi = new Persegi<>(5);
        System.out.println("== Persegi ==");
        System.out.println("Sisi: " + persegi.getPanjang());
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());
        System.out.println();
        
        // Membuat objek persegi panjang dengan tipe Double
        PersegiPanjang<Double> persegiPanjang = new PersegiPanjang<>(6.5, 3.5);
        System.out.println("== Persegi Panjang ==");
        System.out.println("Panjang: " + persegiPanjang.getPanjang());
        System.out.println("Lebar: " + persegiPanjang.getLebar());
        System.out.println("Luas: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
        System.out.println();
        
        // Membuat objek segitiga siku-siku dengan tipe Float
        Segitiga<Float> segitigaSiku = new Segitiga<>(4.0f, 3.0f);
        System.out.println("== Segitiga Siku-siku ==");
        System.out.println("Alas: " + segitigaSiku.getAlas());
        System.out.println("Tinggi: " + segitigaSiku.getTinggi());
        System.out.println("Sisi Miring: " + segitigaSiku.getSisiC());
        System.out.println("Luas: " + segitigaSiku.hitungLuas());
        System.out.println("Keliling: " + segitigaSiku.hitungKeliling());
        System.out.println();
        
        // Membuat objek segitiga sembarang dengan tipe Integer
        Segitiga<Integer> segitigaSembarang = new Segitiga<>(5, 7, 8);
        System.out.println("== Segitiga Sembarang ==");
        System.out.println("Sisi A: " + segitigaSembarang.getPanjang());
        System.out.println("Sisi B: " + segitigaSembarang.getSisiB());
        System.out.println("Sisi C: " + segitigaSembarang.getSisiC());
        System.out.println("Tinggi: " + segitigaSembarang.getTinggi());
        System.out.println("Luas: " + segitigaSembarang.hitungLuas());
        System.out.println("Keliling: " + segitigaSembarang.hitungKeliling());
    }
}