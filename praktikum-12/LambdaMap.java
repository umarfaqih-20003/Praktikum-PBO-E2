import java.util.HashMap;
import java.util.Map;

/* Nama File : LambdaMap.java
 * Deskripsi : Contoh penggunaan lambda pada Map
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : Kamis, 5 Juni 2025
 */

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123120003", "Umar Faqih");
        mahasiswaMap.put("24060123120004", "Faqih Umar");
        mahasiswaMap.put("24060123120005", "Adi Bambang");
        mahasiswaMap.put("24060123120006", "Cici Didi");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> System.out.println("NIM : " + key + ", Nama : " + value));
    }
}
