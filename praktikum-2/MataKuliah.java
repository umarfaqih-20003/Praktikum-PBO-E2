/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 27/02/2025
 */

public class MataKuliah {
    /* ATRIBUT */
    private String idMatKul, nama;
    private int sks;

    /* METHOD */
    public MataKuliah(){

    }
    
    public MataKuliah(String idMatKul,String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatKul(){
        return this.idMatKul;
    }

    public String getNama(){
        return this.nama;
    }

    public int getSks(){
        return this.sks;
    }

    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }


}
