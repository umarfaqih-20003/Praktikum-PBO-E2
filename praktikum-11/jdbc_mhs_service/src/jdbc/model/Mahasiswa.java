/**
 * File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan mehod dari class Mahasiswa
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : 22 Mei 2025
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author asus
 */
public class Mahasiswa {
    private int id;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString() {
        return "Mahasiswa{" + "id= " + id +  ", nama= " + nama + '}';
    }
}
