/**
* File : PersegiPanjang.java
* Deskripsi : Kelas untuk bangun datar persegi panjang
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class PersegiPanjang<T extends Number> extends BangunDatarGenerik<T> {
    // Atribut tambahan untuk persegi panjang
    private T lebar;
    
    // Constructor
    public PersegiPanjang(T panjang, T lebar) {
        super(panjang);
        this.lebar = lebar;
    }
    
    // Getter dan setter untuk lebar
    public T getLebar() {
        return lebar;
    }
    
    public void setLebar(T lebar) {
        this.lebar = lebar;
    }
    
    // Implementasi metode abstract dari kelas induk
    @Override
    public double hitungLuas() {
        // Luas persegi panjang = panjang * lebar
        double p = panjang.doubleValue();
        double l = lebar.doubleValue();
        return p * l;
    }
    
    @Override
    public double hitungKeliling() {
        // Keliling persegi panjang = 2 * (panjang + lebar)
        double p = panjang.doubleValue();
        double l = lebar.doubleValue();
        return 2 * (p + l);
    }
}