/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 27/02/2025
 */


import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String nim, nama, prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* METHOD */
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mataKuliah){
        if (this.listMatkul.size() < 50){
            this.listMatkul.add(mataKuliah);
        }
        else{
            System.out.println("List mata kuliah sudah penuh.");
        }
    }

    public int getJumlahSKS(){
        int jumlah = 0;
        for (MataKuliah mataKuliah : this.listMatkul){
            jumlah += mataKuliah.getSks();
        }
        return jumlah;
    }

    public int getJumlahMatKul(){
        return this.listMatkul.size();
    }

    public void printMhs(){
        System.out.println("NIM \t\t" + nim);
        System.out.println("Nama \t\t" + nama);
        System.out.println("Prodi \t\t" + prodi);
    }

    public void printDetailMhs(){
        printMhs();
        System.out.println("Daftar Mata Kuliah");
        int i;
        for (i=0; i<listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali\t" + dosenWali.getNama());
        System.out.println("Kendaraan\t" + kendaraan.getJenis());
    }

}
