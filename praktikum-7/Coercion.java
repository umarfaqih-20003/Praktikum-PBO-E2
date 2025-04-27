/* Nama File    : Coercion.java
 * Deskripsi    : Contoh implementasi polimorfisme coercion
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Coercion {
    public static void main(String[] args) {
        /* Program Nomor 1 */
        int output1 = 'a';
        System.out.println(output1);
        /* Output = 97 (Berhasil)
         * Penjelasan: Di Java, char a diubah menjadi integer, jadi mengembalikan ASCII nua yaitu 97
         */

         /* Program Nomor 2 */
        //  double x = 15.5;
        //  int output2 = x;
        //  System.out.println(output2);
         /* Output = error (Tidak berhasil)
         * Penjelasan: Tidak bisa mengubah double menjadi integer
         */

         /* Program Nomor 3 */
         int y = 25;
         double output3 = y;
         System.out.println(output3);
         /* Output = 25.0 (Berhasil)
         * Penjelasan: Integer dapat diubah menjadi double dengan menambahkan koma nol di belakang angka integernya
         */

         /* Program Nomor 4 */
         int z = 78;
         char output4 = (char) z;
         System.out.println(output4);
         /* Output = N (Berhasil)
         * Penjelasan: Explicit casting dari int ke char. Kode ASCII 78 adalah huruf N
         */

         /* Program Nomor 5 */
         char a = 'a';
         double output5 = a;
         System.out.println(output5);
         /* Output = 97.0 (Berhasil)
         * Penjelasan: char ke int secara implisit (coercion), lalu int ke double. Jadi, 'a' jadi 97.0
         */
    }
}
