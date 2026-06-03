/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sri Dayanti
 */
//koneksi rak buku admin + peminjaman

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksii {

    private static Connection koneksi;

    public static Connection getKoneksi() {
        try {
            if (koneksi == null || koneksi.isClosed()) {

                String url = "jdbc:mysql://localhost:3306/db_perpustakaan";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(
                        new com.mysql.cj.jdbc.Driver()
                );

                koneksi = DriverManager.getConnection(
                        url, user, password
                );
            }

        } catch (SQLException e) {
            System.out.println("Koneksi Gagal : " + e.getMessage());
        }

        return koneksi;
    }
}