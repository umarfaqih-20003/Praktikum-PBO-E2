/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 16/03/2025
 */

 abstract class Dosen extends Pegawai {
    /* ATRIBUT */
    protected String nidn;
    
    /* METHOD */
    // konstruktor kelas dosen
    public Dosen() {

    }
    
    public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
}