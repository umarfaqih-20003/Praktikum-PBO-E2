/**
* File : Koleksi.java
* Deskripsi : Kelas generik untuk mengelola koleksi objek
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class Koleksi<T> {
    // Atribut
    private int nbelm;          // Jumlah elemen efektif
    private Object[] wadah;     // Array untuk menyimpan objek
    private int maxSize;        // Ukuran maksimum koleksi
    
    // Constructor
    public Koleksi(int maxSize) {
        this.maxSize = maxSize;
        this.wadah = new Object[maxSize];
        this.nbelm = 0;
    }
    
    // Getter untuk elemen di indeks tertentu
    @SuppressWarnings("unchecked")
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return (T) wadah[indeks];
        } else {
            return null;
        }
    }
    
    // Setter untuk mengubah elemen di indeks tertentu
    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = nilai;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    
    // Getter untuk jumlah elemen efektif
    public int getSize() {
        return nbelm;
    }
    
    // Setter untuk jumlah elemen efektif
    public void setSize(int size) {
        if (size >= 0 && size <= maxSize) {
            this.nbelm = size;
        } else {
            System.out.println("Ukuran tidak valid!");
        }
    }
    
    // Menambahkan elemen baru ke koleksi
    public void add(T elemen) {
        if (nbelm < maxSize) {
            wadah[nbelm] = elemen;
            nbelm++;
        } else {
            System.out.println("Koleksi sudah penuh!");
        }
    }
    
    // Menghapus elemen di indeks tertentu
    public void delete(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            // Menggeser elemen-elemen setelah indeks ke kiri
            for (int i = indeks; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null; // Menghapus referensi terakhir
            nbelm--;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    
    // Menampilkan semua elemen dalam koleksi
    public void showAll() {
        System.out.println("Isi koleksi:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("[" + i + "] " + wadah[i]);
        }
        System.out.println("Jumlah elemen: " + nbelm);
    }
}