/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sri Dayanti
 */
import java.util.ArrayList;

public class DataBuku {
    public static ArrayList<Buku> getData() {

        ArrayList<Buku> list = new ArrayList<>();

        list.add(new Buku("F01","Laskar Pelangi","Fiksi",5,"Tersedia"));
        list.add(new Buku("F02","Bumi","Fiksi",3,"Tersedia"));
        list.add(new Buku("NF01","Matematika","Non-Fiksi",4,"Tersedia"));
        list.add(new Buku("NF02","Fisika","Non-Fiksi",2,"Tersedia"));

        return list;
    } 
}
