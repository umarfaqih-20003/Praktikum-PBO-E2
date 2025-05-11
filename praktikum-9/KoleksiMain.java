/**
* File : KoleksiMain.java
* Deskripsi : Main class untuk menguji kelas Koleksi generik
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class KoleksiMain {
    public static void main(String[] args) {
        // Membuat objek koleksi untuk karakter dengan ukuran maksimum 10
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);
        
        // Menambahkan 10 karakter ke dalam koleksi
        koleksiKarakter.add('J');
        koleksiKarakter.add('A');
        koleksiKarakter.add('V');
        koleksiKarakter.add('A');
        koleksiKarakter.add('P');
        koleksiKarakter.add('R');
        koleksiKarakter.add('O');
        koleksiKarakter.add('G');
        koleksiKarakter.add('R');
        koleksiKarakter.add('M');
        
        // Menampilkan semua elemen koleksi
        System.out.println("== Koleksi Awal ==");
        koleksiKarakter.showAll();
        
        // Mengubah elemen di indeks tertentu
        System.out.println("\n== Mengubah Elemen ==");
        koleksiKarakter.setIsi(9, 'A'); // Mengubah 'M' menjadi 'A'
        koleksiKarakter.showAll();
        
        // Menghapus elemen di indeks tertentu
        System.out.println("\n== Menghapus Elemen ==");
        koleksiKarakter.delete(2); // Menghapus 'V'
        koleksiKarakter.showAll();
        
        // Menambahkan elemen baru setelah penghapusan
        System.out.println("\n== Menambahkan Elemen Baru ==");
        koleksiKarakter.add('X');
        koleksiKarakter.showAll();
        
        // Mengakses elemen di indeks tertentu
        System.out.println("\n== Mengakses Elemen ==");
        System.out.println("Elemen di indeks 3: " + koleksiKarakter.getIsi(3));
        
        // Mencoba akses di luar batas
        System.out.println("\n== Mencoba Akses Di Luar Batas ==");
        System.out.println("Elemen di indeks 20: " + koleksiKarakter.getIsi(20));
        
        // Mencoba menambahkan elemen melebihi kapasitas
        System.out.println("\n== Mencoba Menambahkan Melebihi Kapasitas ==");
        koleksiKarakter.add('Y');
    }
}