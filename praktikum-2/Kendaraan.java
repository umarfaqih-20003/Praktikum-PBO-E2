/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 27/02/2025
 */

public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;

    /* METHOD */
    public Kendaraan(){

    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getnoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat  = noPlat;
    }

    public void setJenis(String jenis){
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")){
            this.jenis = jenis;
        }
        else{
            System.out.println("Jenis kendaraan harus motor atau mobil.");
        }
        
    }
}
