/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Umar Faqih/24060123120003
 * Tanggal      : 16/03/2025
 */

 class DosenTamu extends Dosen {
    /* ATRIBUT */
    protected String fakultas;
    protected String tanggalBerakhirKontrak;
    protected String nidk; 
    
    /* METHOD */
    // konstruktor DosenTamu
    public DosenTamu() {

    }
    
    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String nidk, String fakultas, String tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, "");
        this.fakultas = fakultas;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
        this.nidk = nidk;
    }
    
    public String getFakultas() {
        return fakultas;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    public String getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }
    
    public void setTanggalBerakhirKontrak(String tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    public String getNidk() {
        return nidk;
    }
    
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    @Override
    public String hitungBUP() {
        return tanggalBerakhirKontrak;
    }

    @Override
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        int tahun = masaKerja / 12;
        int bulan = masaKerja % 12;
        
        System.out.println("NIP       : " + nip);
        System.out.println("NIDK      : " + nidk);
        System.out.println("Nama      : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT       : " + tmt);
        System.out.println("Fakultas  : " + fakultas);
        System.out.println("Masa Kerja: " + tahun + " tahun " + bulan + " bulan");
        System.out.println("Berakhir Kontrak: " + tanggalBerakhirKontrak);
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : " + "2,5% x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}