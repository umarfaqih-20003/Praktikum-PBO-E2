/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 27/02/2025
 */

public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;

    /* METHOD */
    // konstruktor tanpa parameter
    public Dosen(){

    }

    // konstruktor dengan parameter nip, nama, dan prodi
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor untuk masing-masing atribut
    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    // mutator untuk masing-masing atribut
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
