/* Nama File    : Sewa.java
 * Deskripsi    : Main program dari class Vehicle
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        
        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bis);
    }
    
    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 1000);
    }
    /* PENJELASAN hitungSewa
     * Polimorfisme inclusion memungkinkan kita membuat satu method hitungSewa(Vehicle v) yang fleksibel untuk berbagai objek turunan tanpa perlu menduplikasi kode.
     * Saat subclass meng-override calRent, method spesifik objek itu akan otomatis dipanggil, memberikan perilaku yang sesuai objek aktual, bukan hanya tipe referensinya.
     * Lebih mudah dikembangkan, karena menambahkan tipe kendaraan baru (misal Truck) cukup membuat subclass baru tanpa perlu ubah hitungSewa()
     */
}
