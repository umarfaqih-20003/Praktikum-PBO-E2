/**
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
 *                Pengenalan kalusa 'throw' dan 'throws'
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 6 Maret 2025
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial"); // baris 12
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13); // baris 19
            as.cobaAngka(12);
        } catch (AngkaSialException ase) { // baris 21
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**
 * Ketika eksepsi, baris 12 pada AngkaSial.java di atas dieksekusi, karena pada baris 18 tidak bernilai 13, maka pada method cobaAngka akan keluar dari if dan menjalankan baris 12
 * Baris 21 pada AngkaSial.java di atas dieksekusi, karena terjadi eksepsi pada baris 19 yang akan menjalankan baris 21
 * 
 */
