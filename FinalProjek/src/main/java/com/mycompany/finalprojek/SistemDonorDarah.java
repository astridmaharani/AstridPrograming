/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author astri
 */
    // Kelas utama sebagai entry point program

public class SistemDonorDarah {
    private static DataDonor dataDonor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataDonor = new DataDonor();

        // Menampilkan menu
        System.out.println("Selamat datang di Sistem Donor Darah");
        System.out.println("==============================================");

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Pendaftaran Donor");
            System.out.println("2. Tampilkan Daftar Donor");
            System.out.println("3. Cari Donor berdasarkan Nama");
            System.out.println("4. Cari Donor berdasarkan Golongan Darah");
            System.out.println("5. Tampilkan Jadwal Donor");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine(); // Membersihkan \n setelah input sebelumnya
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Golongan Darah: ");
                    String golonganDarah = scanner.nextLine();
                    System.out.print("Masukkan Umur: ");
                    int umur = scanner.nextInt();
                    
                    if (umur < 17){
                        System.out.println("Anda belum memenuhi persyaratan minimal umur.")
                        break;
                    }

                    Donor donor = new Donor(nama, golonganDarah);
                    dataDonor.tambahDonor(donor);
                    System.out.println("Pendaftaran berhasil! Terima kasih, " + donor.getNama() + ".");
                    break;
                case 2:
                    dataDonor.urutkanDonorBerdasarkanNama();
                    tampilkanDaftarDonor();
                    break;
                case 3:
                    scanner.nextLine(); // Membersihkan \n setelah input sebelumnya
                    System.out.print("Masukkan Nama: ");
                    String Pendonor = scanner.nextLine();
                    cariDonorBynama(Pendonor);
                    break;
                case 4:
                    scanner.nextLine(); // Membersihkan \n setelah input sebelumnya
                    System.out.print("Masukkan Golongan Darah: ");
                    String golDarah = scanner.nextLine();
                    cariDonorByGolonganDarah(golDarah);
                    break;
                case 5:
                    JadwalDonor jadwalDonor = new JadwalDonor("21 Juni 2023");
                    jadwalDonor.tampilkanJadwal();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan Sistem Pendaftaran Donor Darah.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 6);

        scanner.close();
    }

    private static void tampilkanDaftarDonor() {
        List<Donor> daftarDonor = dataDonor.getDaftarDonor();
        if (daftarDonor.isEmpty()) {
            System.out.println("Belum ada donor terdaftar.");
        } else {
            System.out.println("Daftar Donor:");
            for (Donor donor :             daftarDonor) {
                System.out.println("Nama: " + donor.getNama() + ", Golongan Darah: " + donor.getGolonganDarah() + ", Umur: " + donor.getUmur());
            }
        }
    }

    private static void cariDonorBynama(String nama) {
        List<Donor> hasilPencarian = dataDonor.cariDonorBynama(nama);
        if (hasilPencarian.isEmpty()) {
            System.out.println("Tidak ditemukan pendonor dengan nama " + nama + ".");
        } else {
            System.out.println("Pendonor dengan nama " + nama + ":");
            for (Donor donor : hasilPencarian) {
                System.out.println("Nama: " + donor.getNama() + ", Golongan Darah: " + donor.getGolonganDarah() ", Umur: " + donor.getUmur());
            }
        }
    }
    
    private static void cariDonorByGolonganDarah(String golonganDarah) {
        List<Donor> hasilPencarian = dataDonor.cariDonorByGolonganDarah(golonganDarah);
        if (hasilPencarian.isEmpty()) {
            System.out.println("Tidak ditemukan pendonor dengan golongan darah " + golonganDarah + ".");
        } else {
            System.out.println("Pendonor dengan golongan darah " + golonganDarah + ":");
            for (Donor donor : hasilPencarian) {
                System.out.println("Nama: " + donor.getNama() + ", Golongan Darah: " + donor.getGolonganDarah() ", Umur: " + donor.getUmur());
            }
        }
    }
}



