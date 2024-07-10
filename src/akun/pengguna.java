/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akun;

import services.*;
import GUI.FrameUtama;
import java.util.Scanner;
import CRUD.Koneksi;

/**
 *
 * @author gadsa
 */
public class pengguna {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new FrameUtama().setVisible(true);
        
//        koneksi ke db
//        Koneksi crud = new Koneksi();
//            while (true) {
//                //Menu pilihan
//            System.out.println("Menu:");
//            System.out.println("1. Tambah Data");
//            System.out.println("2. Hapus Data");
//            System.out.println("3. Ubah Data");
//            System.out.println("4. Keluar");
//            System.out.print("Pilih opsi: ");
//            int pilihan = scanner.nextInt();
//            scanner.nextLine();
//            
//            switch (pilihan) {
//                case 1: //Masukkan
//                    System.out.print("Masukkan Id: ");
//                    int id = scanner.nextInt();
//                    System.out.print("Masukkan Nama: ");
//                    String nama = scanner.nextLine();
//                    System.out.print("Masukkan Email: ");
//                    String email = scanner.nextLine();
//                    System.out.print("Masukkan Password: ");
//                    String password = scanner.nextLine();
//                    System.out.print("Masukkan Status: ");
//                    String status = scanner.nextLine();
//                    System.out.print("Masukkan Nomor Telepon: ");
//                    String telp = scanner.nextLine();
//                    crud.simpanPengguna(id, nama,email,password,status,telp);
//                    break;
//                case 2: //Hapus
//                    System.out.print("Masukkan ID yang ingin dihapus: ");
//                    int idHapus = scanner.nextInt();
//                    scanner.nextLine();
//                    crud.hapusPengguna(idHapus);
//                    break;
//                case 3: //Ubah
//                    System.out.print("Masukkan ID yang ingin diubah: ");
//                    int idUbah = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.print("Masukkan Nama yang baru: ");
//                    String namaUbah = scanner.nextLine();
//                    System.out.print("Masukkan Email yang baru: ");
//                    String emailUbah = scanner.nextLine();
//                    System.out.print("Masukkan Password yang baru: ");
//                    String passwordUbah = scanner.nextLine();
//                    System.out.print("Masukkan Status yang baru: ");
//                    String statusUbah = scanner.nextLine();
//                    System.out.print("Masukkan nomor Telepon yang baru: ");
//                    String telpUbah = scanner.nextLine();
//                    crud.ubahPengguna(idUbah, namaUbah, emailUbah, passwordUbah, statusUbah, telpUbah);
//                    break;
//                case 4:
//                    System.out.println("Keluar dari program.");
//                    scanner.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
//            }
//        }
    }
}
