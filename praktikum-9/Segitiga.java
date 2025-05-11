/**
* File : Segitiga.java
* Deskripsi : Kelas untuk bangun datar segitiga
* Pembuat : Umar Faqih / 24060123120003
* Tanggal : 8 Mei 2025
*/

public class Segitiga<T extends Number> extends BangunDatarGenerik<T> {
    // Atribut tambahan untuk segitiga
    private T alas;
    private T tinggi;
    private T sisiB;
    private T sisiC;
    
    // Constructor untuk segitiga siku-siku
    public Segitiga(T alas, T tinggi) {
        super(alas); // sisiA = alas
        this.alas = alas;
        this.tinggi = tinggi;
        
        // Menghitung sisi miring (sisiC) dengan teorema Pythagoras
        double a = alas.doubleValue();
        double t = tinggi.doubleValue();
        double c = Math.sqrt(a * a + t * t);
        
        // Menggunakan cast untuk mengubah double ke tipe generik T
        // Ini hanya contoh sederhana, dalam kasus nyata mungkin perlu cara konversi yang lebih tepat
        if (alas instanceof Integer) {
            this.sisiB = (T) Integer.valueOf((int) t);
            this.sisiC = (T) Integer.valueOf((int) c);
        } else if (alas instanceof Double) {
            this.sisiB = (T) Double.valueOf(t);
            this.sisiC = (T) Double.valueOf(c);
        } else if (alas instanceof Float) {
            this.sisiB = (T) Float.valueOf((float) t);
            this.sisiC = (T) Float.valueOf((float) c);
        } else {
            // Default fallback
            this.sisiB = tinggi;
            this.sisiC = (T) Double.valueOf(c);
        }
    }
    
    // Constructor untuk segitiga dengan 3 sisi
    public Segitiga(T sisiA, T sisiB, T sisiC) {
        super(sisiA);
        this.alas = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        
        // Menghitung tinggi dengan rumus luas segitiga
        // Tinggi = (2 * Luas) / alas
        // Luas dihitung dengan rumus Heron
        double a = sisiA.doubleValue();
        double b = sisiB.doubleValue();
        double c = sisiC.doubleValue();
        
        double s = (a + b + c) / 2; // semi-perimeter
        double luas = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double t = (2 * luas) / a;
        
        if (sisiA instanceof Integer) {
            this.tinggi = (T) Integer.valueOf((int) t);
        } else if (sisiA instanceof Double) {
            this.tinggi = (T) Double.valueOf(t);
        } else if (sisiA instanceof Float) {
            this.tinggi = (T) Float.valueOf((float) t);
        } else {
            this.tinggi = (T) Double.valueOf(t);
        }
    }
    
    // Getter dan setter
    public T getAlas() {
        return alas;
    }
    
    public void setAlas(T alas) {
        this.alas = alas;
    }
    
    public T getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(T tinggi) {
        this.tinggi = tinggi;
    }
    
    public T getSisiB() {
        return sisiB;
    }
    
    public void setSisiB(T sisiB) {
        this.sisiB = sisiB;
    }
    
    public T getSisiC() {
        return sisiC;
    }
    
    public void setSisiC(T sisiC) {
        this.sisiC = sisiC;
    }
    
    // Implementasi metode abstract dari kelas induk
    @Override
    public double hitungLuas() {
        // Luas segitiga = 0.5 * alas * tinggi
        double a = alas.doubleValue();
        double t = tinggi.doubleValue();
        return 0.5 * a * t;
    }
    
    @Override
    public double hitungKeliling() {
        // Keliling segitiga = sisiA + sisiB + sisiC
        double a = alas.doubleValue(); // sisiA = alas
        double b = sisiB.doubleValue();
        double c = sisiC.doubleValue();
        return a + b + c;
    }
}