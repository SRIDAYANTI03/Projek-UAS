/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sri Dayanti
 */
public class Peminjam {

    private String id;
    private String nama;
    private String telepon;
    private String alamat;

    public Peminjam(String id, String nama,
                     String telepon, String alamat) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getAlamat() {
        return alamat;
    }
}