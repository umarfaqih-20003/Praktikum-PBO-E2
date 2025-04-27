/* Nama File    : MPerson.java
 * Deskripsi    : Main program dari class Person
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class MPerson {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
        /* PENJELASAN
         * Output: Now online: Sally
         * Saat p.status(1) dipanggil,
         * Di dalam status(int hr), program memanggil this.isAsleep(hr)
         * Karena this menunjuk ke objek Student, maka method isAsleep() yang dipanggil adalah milik Student, bukan milik Person
         * Pada class Student, isAsleep(1) akan mengembalikan false karena false && true hasilnya false
         * Karena isAsleep(1) mengembalikan false, maka jalur else dijalankan: System.out.println("Now online: " + this);
         * this di sini merepresentasikan objek Student (Sally), dan toString() mengembalikan name ("Sally")
         * Maka output akhirnya adalah Now online: Sally
         */
    }
}
