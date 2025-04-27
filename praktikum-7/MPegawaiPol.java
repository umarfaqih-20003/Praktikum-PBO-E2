/* Nama File    : MPegawaiPol.java
 * Deskripsi    : Main program dari class Pegawai
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

import java.util.ArrayList;

public class MPegawaiPol {
    public static void main(String[] args) {
        
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* PENJELASAN MANFAAT POLIMORFISME
 * 
 */
