/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspem2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
     static final String DB_URL = "jdbc:mysql://localhost:3306/sotoayam";
     static final String USER = "root";
     static final String PASS = "";
    private Statement stmt;
    private Connection con;
    String statusKoneksi = "";
    
    public String jalankanKoneksi(){
        try {
            Class.forName(JDBC_DRIVER);
            // buat koneksi ke database
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            // buat objek statement
            stmt = con.createStatement();
            statusKoneksi = "Berhasil Koneksi";
        }catch (Exception e){
            statusKoneksi="Gagal Karena" + e;
        }
        
        return statusKoneksi;
    }

    void setText(String jalankanKoneksi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}