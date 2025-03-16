/* Nama File    : MPegawai.java
 * Deskripsi    : berisi main program dari class Pegawai
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 16/03/2025
 */

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", 
            "Andi", 
            "5 Mei 1990", 
            "1 Januari 2015", 
            5000000.00, 
            "78647324", 
            "Fakultas Sains dan Matematika", 
            "Dosen Tetap"
        );
        
        System.out.println("===== INFORMASI DOSEN TETAP =====");
        dosenTetap.printInfo();
        System.out.println();
 
        DosenTamu dosenTamu = new DosenTamu(
            "9545647549", 
            "Budi", 
            "10 Juni 1988", 
            "1 Maret 2020", 
            4500000.00, 
            "DK123456", 
            "Fakultas Ekonomi", 
            "31 Desember 2025"
        );
        
        System.out.println("===== INFORMASI DOSEN TAMU =====");
        dosenTamu.printInfo();
        System.out.println();
        
        Tendik tendik = new Tendik(
            "9545647550", 
            "Citra", 
            "15 Agustus 1992", 
            "1 Juli 2018", 
            3500000.00, 
            "Akademik"
        );
        
        System.out.println("===== INFORMASI TENDIK =====");
        tendik.printInfo();
    }
}