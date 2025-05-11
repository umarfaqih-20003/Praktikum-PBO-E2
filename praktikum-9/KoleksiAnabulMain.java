/**
* File : KoleksiAnabulMain.java
* Deskripsi : Main class untuk menguji Koleksi Anabul
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

import java.util.Random;

public class KoleksiAnabulMain {
    public static void main(String[] args) {
        // Membuat objek koleksi untuk anabul dengan ukuran maksimum 10
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>(10);
        
        // Menambahkan 10 elemen anabul secara acak
        String[] namaKucing = {"Kitty", "Meong", "Putih", "Garfield", "Tom"};
        String[] namaAnjing = {"Doggy", "Pluto", "Bobby", "Scooby", "Max"};
        String[] namaBurung = {"Tweety", "Robin", "Kicau", "Birdy", "Rio"};
        
        Random random = new Random();
        
        // Mengisi koleksi
        for (int i = 0; i < 10; i++) {
            int jenis = random.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            
            switch (jenis) {
                case 0:
                    String namaK = namaKucing[random.nextInt(namaKucing.length)];
                    koleksiAnabul.add(new Kucing(namaK + "-" + i));
                    break;
                case 1:
                    String namaA = namaAnjing[random.nextInt(namaAnjing.length)];
                    koleksiAnabul.add(new Anjing(namaA + "-" + i));
                    break;
                case 2:
                    String namaB = namaBurung[random.nextInt(namaBurung.length)];
                    koleksiAnabul.add(new Burung(namaB + "-" + i));
                    break;
            }
        }
        
        // Menampilkan semua elemen koleksi anabul
        System.out.println("== KOLEKSI ANABUL ==");
        System.out.println("Jumlah anabul: " + koleksiAnabul.getSize());
        System.out.println();
        
        // Menampilkan info setiap anabul
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul anabul = koleksiAnabul.getIsi(i);
            System.out.println("Anabul #" + (i + 1));
            System.out.println("Nama: " + anabul.getNama());
            System.out.println("Suara: " + anabul.bersuara());
            System.out.println("Gerakan: " + anabul.bergerak());
            
            // Menentukan jenis anabul
            String jenis = "";
            if (anabul instanceof Kucing) {
                jenis = "Kucing";
            } else if (anabul instanceof Anjing) {
                jenis = "Anjing";
            } else if (anabul instanceof Burung) {
                jenis = "Burung";
            }
            System.out.println("Jenis: " + jenis);
            System.out.println();
        }
        
        // Menggunakan showAll dari Koleksi
        System.out.println("== MENGGUNAKAN SHOW ALL ==");
        koleksiAnabul.showAll();
        
        // Demonstrasi modifikasi koleksi
        System.out.println("\n== DEMONSTRASI MODIFIKASI KOLEKSI ==");
        
        // Menambahkan anabul baru
        System.out.println("1. Menambahkan anabul baru (Burung Nuri)");
        koleksiAnabul.add(new Burung("Nuri"));
        
        // Menghapus anabul di indeks tertentu
        System.out.println("2. Menghapus anabul di indeks 2");
        koleksiAnabul.delete(2);
        
        // Mengubah anabul di indeks tertentu
        System.out.println("3. Mengubah anabul di indeks 0 menjadi Kucing Persia");
        koleksiAnabul.setIsi(0, new Kucing("Persia"));
        
        // Menampilkan koleksi setelah dimodifikasi
        System.out.println("\n== KOLEKSI SETELAH DIMODIFIKASI ==");
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul anabul = koleksiAnabul.getIsi(i);
            System.out.println("Anabul #" + (i + 1) + ": " + anabul.getNama() + 
                             " (" + anabul.bersuara() + ", " + anabul.bergerak() + ")");
        }
    }
}