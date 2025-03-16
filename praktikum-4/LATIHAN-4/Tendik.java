/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 16/03/2025
 */

class Tendik extends Pegawai {
    /* ATRIBUT */
    protected String bidang; 
    
    /* METHOD */
    public Tendik(String nip, String nama, String tanggalLahir, String tmt, 
                  double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public String hitungBUP() {
        String[] parts = tanggalLahir.split(" ");
        int hari = Integer.parseInt(parts[0]);
        String bulan = parts[1];
        int tahun = Integer.parseInt(parts[2]);
        
        return hari + " " + bulan + " " + (tahun + 55);
    }
    
    @Override
    public double hitungTunjangan() {
        int tahun = masaKerja / 12;
        return 0.01 * tahun * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        int tahun = masaKerja / 12;
        int bulan = masaKerja % 12;
        
        System.out.println("NIP       : " + nip);
        System.out.println("Nama      : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT       : " + tmt);
        System.out.println("Bidang    : " + bidang);
        System.out.println("Masa Kerja: " + tahun + " tahun " + bulan + " bulan");
        System.out.println("BUP       : " + hitungBUP());
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : " + "1% x " + tahun + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
