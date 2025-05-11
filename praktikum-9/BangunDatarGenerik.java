/**
* File : BangunDatarGenerik.java
* Deskripsi : Kelas generik untuk bangun datar
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public abstract class BangunDatarGenerik<T extends Number> {
    // Atribut generik
    protected T panjang;
    
    // Constructor
    public BangunDatarGenerik(T panjang) {
        this.panjang = panjang;
    }
    
    // Getter dan setter
    public T getPanjang() {
        return panjang;
    }
    
    public void setPanjang(T panjang) {
        this.panjang = panjang;
    }
    
    // Metode abstract yang akan diimplementasikan oleh kelas anak
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}