/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rekrutmentenaga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author astri
 */
class Kandidat {
    private String nama;
    private String jenisKelamin;
    private String alamat;
    private int usia;

    public Kandidat(String nama, String jenisKelamin, String alamat, int usia) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.usia = usia;
    }
    public String getNama() {
        return nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getUsia() {
        return usia;
    }
}

public class RekrutmenTenaga2 {
    private static ArrayList<Kandidat> dataKandidat = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=== PROGRAM REKRUTMEN TENAGA ===");
            System.out.println("1. Masukkan Kandidat Baru");
            System.out.println("2. Lihat Data Kandidat");
            System.out.println("3. Hapus Kandidat");
            System.out.println("4. KELUAR");
            System.out.print("Masukan pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();
            //kondisi pilihan
            switch (pilihan) {
                case 1:
                    tambahKandidat();
                    System.out.println("============================================================");
                    break;
                case 2:
                    System.out.println("_________________________________________");
                    lihatDataKandidat();
                    System.out.println("============================================================");
                    break;
                case 3:
                    System.out.println("_________________________________________");
                    hapusKandidat();
                    System.out.println("============================================================");
                    break;
                case 4:
                    System.out.println("============================================================");
                    System.out.println("Terima kasih telah menggunakan program Rekrutmen Tenaga ini.");
                    System.out.println("============================================================");
                    break;
                default:
                    System.out.println("Pilihan yang Anda masukkan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 4);

        input.close();
    }

    private static void tambahKandidat() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MASUKKAN KANDIDAT BARU ===");
        System.out.print("Nama Kandidat (minimal 2 kata, 5-20 karakter, tanpa spasi di awal atau akhir): ");
        String nama = input.nextLine();
        System.out.print("Jenis Kelamin Kandidat (laki-laki/perempuan): ");
        String jenisKelamin = input.nextLine();
        System.out.print("Alamat kandidat (diakhiri dengan kata 'street'): ");
        String alamat = input.nextLine();
        System.out.print("Usia Kandidat (17-30 tahun): ");
        int usia = input.nextInt();
        input.nextLine(); 
               
        // Validasi nama
        String[] kata = nama.split(" ");
        if (kata.length < 2 || kata[0].isEmpty() || kata[1].isEmpty() || kata[0].length() > 20 || kata[1].length() > 20
                || kata[0].charAt(0) == ' ' || kata[0].charAt(kata[0].length() - 1) == ' '
                || kata[1].charAt(0) == ' ' || kata[1].charAt(kata[1].length() - 1) == ' ') {
            System.out.println("_________________________________________");
            System.out.println("Nama kandidat tidak valid.");
            return;
        }
        // Validasi jenis kelamin
        if (!jenisKelamin.equalsIgnoreCase("laki-laki") && !jenisKelamin.equalsIgnoreCase("perempuan")) {
            System.out.println("_________________________________________");
            System.out.println("Jenis kelamin kandidat tidak valid.");
            return;
        }
        // Validasi alamat
        if (!alamat.toLowerCase().endsWith("street")) {
            System.out.println("_________________________________________");
            System.out.println("Alamat kandidat harus diakhiri dengan 'street'.");
            return;
        }
        // Validasi usia
        if (usia < 17 || usia > 30) {
            System.out.println("_________________________________________");
            System.out.println("Usia kandidat tidak memenuhi persyaratan.");
            return;
        }
        Kandidat kandidat = new Kandidat(nama, jenisKelamin, alamat, usia);
        dataKandidat.add(kandidat);

        // Menghasilkan inisial
        String[] inisial = { String.valueOf(kata[0].charAt(0)), String.valueOf(kata[1].charAt(0)) };
        System.out.println("_________________________________________");
        System.out.println("Kandidat baru telah berhasil ditambahkan!");
        System.out.println("Inisial Kandidat: " + inisial[0] + inisial[1]);
    }

    private static void lihatDataKandidat() {
        System.out.println("=== DATA KANDIDAT ===");
        if (dataKandidat.isEmpty()) {
            System.out.println("No Data!");
        } else {
            // Mengurutkan data kandidat berdasarkan nama (asc)
            Collections.sort(dataKandidat, Comparator.comparing(Kandidat::getNama));

            for (int i = 0; i < dataKandidat.size(); i++) {
                Kandidat kandidat = dataKandidat.get(i);
                System.out.println("Kandidat " + (i + 1) + ":");
                System.out.println("Nama: " + kandidat.getNama());
                System.out.println("Jenis Kelamin: " + kandidat.getJenisKelamin());
                System.out.println("Alamat: " + kandidat.getAlamat());
                System.out.println("Usia: " + kandidat.getUsia());
                System.out.println();
            }
        }
    }
    private static void hapusKandidat() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== HAPUS KANDIDAT ===");
        if (dataKandidat.isEmpty()) {
            System.out.println("No Data!");
            return;
        }
        // Mengurutkan data kandidat berdasarkan nama (asc)
        Collections.sort(dataKandidat, Comparator.comparing(Kandidat::getNama));
        for (int i = 0; i < dataKandidat.size(); i++) {
            Kandidat kandidat = dataKandidat.get(i);
            System.out.println((i + 1) + ". Nama: " + kandidat.getNama());
        }
        System.out.print("Masukkan nomor kandidat yang ingin dihapus (0 untuk batalkan): ");
        int nomorKandidat = input.nextInt();
        input.nextLine(); // consume newline character
        if (nomorKandidat == 0) {
            System.out.println("_________________________________________");
            System.out.println("Penghapusan data dibatalkan.");
        } else if (nomorKandidat < 1 || nomorKandidat > dataKandidat.size()) {
            System.out.println("_________________________________________");
            System.out.println("Nomor kandidat yang Anda masukkan tidak valid.");
        } else {
            dataKandidat.remove(nomorKandidat - 1);
            System.out.println("_________________________________________");
            System.out.println("Kandidat berhasil dihapus.");
        }
    }
}
