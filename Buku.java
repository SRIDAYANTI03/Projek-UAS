/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sri Dayanti
 */
public class Buku {
    
    private String idBuku;
    private String judul;
    private String kategori;
    private int stok;
    private String status;

    public Buku(String idBuku, String judul,
                String kategori, int stok,
                String status) {

        this.idBuku = idBuku;
        this.judul = judul;
        this.kategori = kategori;
        this.stok = stok;
        this.status = status;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public String getStatus() {
        return status;
    }
}