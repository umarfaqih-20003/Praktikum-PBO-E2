/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 16/03/2025
 */

class DosenTetap extends Dosen {
    /* ATRIBUT */
    protected String fakultas;
    protected String jabatan;

    /* METHOD */
    public DosenTetap(String nip, String nama, String tanggalLahir, String tmt, 
                      double gajiPokok, String nidn, String fakultas, String jabatan) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, nidn);
        this.fakultas = fakultas;
        this.jabatan = jabatan;
    }

    @Override
    public String hitungBUP() {
        String[] parts = tanggalLahir.split(" ");
        int hari = Integer.parseInt(parts[0]);
        String bulan = parts[1];
        int tahun = Integer.parseInt(parts[2]);
        
        return hari + " " + bulan + " " + (tahun + 65);
    }
    
    @Override
    public double hitungTunjangan() {
        int tahun = masaKerja / 12;
        int sisaBulan = masaKerja % 12;
        
        return 0.02 * tahun * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        int tahun = masaKerja / 12;
        int bulan = masaKerja % 12;
        
        System.out.println("NIP       : " + nip);
        System.out.println("NIDN      : " + nidn);
        System.out.println("Nama      : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT       : " + tmt);
        System.out.println("Jabatan   : " + jabatan);
        System.out.println("Fakultas  : " + fakultas);
        System.out.println("Masa Kerja: " + tahun + " tahun " + bulan + " bulan");
        System.out.println("BUP       : " + hitungBUP());
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : " + "2% x " + tahun + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}