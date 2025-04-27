/* Nama File    : Car.java
 * Deskripsi    : Implementasi class Car
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.0f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
