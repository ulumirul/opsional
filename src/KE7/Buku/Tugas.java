/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KE7.Buku;

/**
 *
 * @author ~~ULUM~~
 */
public class Tugas {
    String judul, nama_pengarang, penerbit, kategori;
    int tahun_Terbit;


    public Tugas(String judul, String nama_pengarang, String penerbit, String kategori, int tahun_Terbit) {
        this.judul = judul;
        this.nama_pengarang = nama_pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tahun_Terbit = tahun_Terbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNama_pengarang() {
        return nama_pengarang;
    }

    public void setNama_pengarang(String nama_pengarang) {
        this.nama_pengarang = nama_pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getTahun_Terbit() {
        return tahun_Terbit;
    }

    public void setTahun_Terbit(int tahun_Terbit) {
        this.tahun_Terbit = tahun_Terbit;
    }

    
   
}
