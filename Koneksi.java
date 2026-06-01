/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sri Dayanti
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
 Connection con;

    public Connection getKoneksi() {

        try {

            Class.forName(
                    "com.mysql.cj.jdbc.Driver"
            );

            String url =
                    "jdbc:mysql://localhost:3306/perpustakaan";

            String user = "root";
            String pass = "";

            con = DriverManager.getConnection(
                    url,
                    user,
                    pass
            );

            System.out.println(
                    "Koneksi Berhasil"
            );

        } catch (Exception e) {

            System.out.println(
                    "Koneksi Gagal : "
                    + e.getMessage()
            );
        }

        return con;
    }   
}
