/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gslc;
import java.util.Scanner;
/**
 *
 * @author astri
 */
public class DataPasien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan Data Baru");
            System.out.println("2. Lihat Data Pasien");
            System.out.println("3. KELUAR");
            System.out.print("Masukkan pilihan Anda (1-3): ");
            
            int pilihan = scanner.nextInt();
            
            if (pilihan == 1) {
                inputDataBaru();
            } else if (pilihan == 2) {
                lihatDataPasien();
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program...");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Silakan masukkan angka dari 1 hingga 3.");
            }
        }
        
        scanner.close();
    }
    
    public static void inputDataBaru() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Data Baru");
        System.out.print("Masukkan nama (3-20 karakter): ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan usia (10-100): ");
        int usia = scanner.nextInt();
        scanner.nextLine(); // Membersihkan karakter newline dari input sebelumnya
        System.out.print("Masukkan alamat (5-30 karakter): ");
        String alamat = scanner.nextLine();
        
        if (nama.length() < 3 || nama.length() > 20) {
            System.out.println("Panjang nama tidak valid!");
        } else if (usia < 10 || usia > 100) {
            System.out.println("Usia tidak valid!");
        } else if (alamat.length() < 5 || alamat.length() > 30) {
            System.out.println("Panjang alamat tidak valid!");
        } else {
            System.out.println("Data telah berhasil dimasukkan!");
        }
        
        scanner.close();
    }
    
    public static void lihatDataPasien() {
        System.out.println("tidak ada data");
       
        // gatau caranya udah coba berapa kali tetep gagal:(
        
        
    }
 

class Pasien {
    private int id;
    private String nama;
    private int usia;
    private String alamat;

    public Pasien(int id, String nama, int usia, String alamat) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }
}
}