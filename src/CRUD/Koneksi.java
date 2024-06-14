/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author gadsa
 */
public class Koneksi {
    private String databasename = "2210010200_gadsa_khalimatus_sadiah";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databasename;
    public static Connection koneksidb;
    
    public Koneksi(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidb = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                
    }
            public void simpanPengguna(int tempId, String tempName, String tempEmail, String tempPassword, String tempStatus, String tempTelpon) {
            
                try {
                    
                    String sql = "insert into user (id, name, email, password, status, no_telp) values (?,?,?,?,?,?)";
                    PreparedStatement perintah = koneksidb.prepareStatement(sql);
                    perintah.setInt(1, tempId);
                    perintah.setString(2, tempName);
                    perintah.setString(3, tempEmail);
                    perintah.setString(4, tempPassword);
                    perintah.setString(5, tempStatus);
                    perintah.setString(6, tempTelpon);
                    perintah.executeUpdate();
                    System.out.println("Data berhasil disimpan");
                    
                } catch (Exception e) {
                    
                    System.out.println(e.getMessage());
                    
                }
                
        }
            
                public void ubahPengguna(int tempId, String tempName, String tempEmail, String tempPassword, String tempStatus, String tempTelpon) {
            
                try {
                    
                    String sql = "update user set name = ?, email = ?, password = ?, status = ?, no_telp = ? where id = ?";
                    PreparedStatement perintah = koneksidb.prepareStatement(sql);
                    perintah.setString(1, tempName);
                    perintah.setString(2, tempEmail);
                    perintah.setString(3, tempPassword);
                    perintah.setString(4, tempStatus);
                    perintah.setString(5, tempTelpon);
                    perintah.setInt(6, tempId);
                    perintah.executeUpdate();
                    System.out.println("Data berhasil diubah");
                    
                } catch (Exception e) {
                    
                    System.out.println(e.getMessage());
                    
                }
                
        }
                
                public void hapusPengguna(int tempId) {
            
                try {
                    
                    String sql = "delete from user where id = ?";
                    PreparedStatement perintah = koneksidb.prepareStatement(sql);
                    perintah.setInt(1, tempId);
                    perintah.executeUpdate();
                    System.out.println("Data berhasil dihapus");
                    
                } catch (Exception e) {
                    
                    System.out.println(e.getMessage());
                    
                }
                
        }
                
                public void simpanBelajar(int tempId, String tempName, String tempTelpon) {
            
                try {
                    
                    String sql = "insert into belajar (id, name,  telpon) values (?,?,?)";
                    PreparedStatement perintah = koneksidb.prepareStatement(sql);
                    perintah.setInt(1, tempId);
                    perintah.setString(2, tempName);
                    perintah.setString(3, tempTelpon);
                    perintah.executeUpdate();
                    System.out.println("Data berhasil disimpan");
                    
                } catch (Exception e) {
                    
                    System.out.println(e.getMessage());
                    
                }
                
        }
                public void ubahPengguna(int tempNpm, String tempNama, String tempTelpon) {
            
                try {
                    
                    String sql = "update user set nama = ?, telpon = ? where id = ?";
                    PreparedStatement perintah = koneksidb.prepareStatement(sql);
                    perintah.setInt(1, tempNpm);
                    perintah.setString(2, tempNama);
                    perintah.setString(3, tempTelpon);
                    perintah.executeUpdate();
                    System.out.println("Data berhasil disimpan");
                    
                } catch (Exception e) {
                    
                    System.out.println(e.getMessage());
                    
                }
                
        }
                
                public void hapusBelajar(int tempNpm) {
            
                try {
                    
                    String sql = "delete from user where id = ?";
                    PreparedStatement perintah = koneksidb.prepareStatement(sql);
                    perintah.setInt(1, tempNpm);
                    perintah.executeUpdate();
                    System.out.println("Data berhasil dihapus");
                    
                } catch (Exception e) {
                    
                    System.out.println(e.getMessage());
                    
                }
                
        }
}
