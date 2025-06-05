import java.util.ArrayList;

/* Nama File : LambdaList.java
 * Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : Kamis, 5 Juni 2025
 */

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
