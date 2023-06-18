/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author astri
 */
class DataDonor {
    private List<Donor> daftarDonor;

    public DataDonor() {
        daftarDonor = new ArrayList<>();
    }

    public void tambahDonor(Donor donor) {
        daftarDonor.add(donor);
    }

    public void hapusDonor(Donor donor) {
        daftarDonor.remove(donor);
    }

    public Donor cariDonorByNama(String nama) {
        for (Donor donor : daftarDonor) {
            if (donor.getNama().equalsIgnoreCase(nama)) {
                return donor;
            }
        }
        return null;
    }

    public List<Donor> cariDonorBynama(String nama) {
        List<Donor> hasilPencarian = new ArrayList<>();
        for (Donor donor : daftarDonor) {
            if (donor.getGolonganDarah().equalsIgnoreCase(nama)) {
                hasilPencarian.add(donor);
            }
        }
        return hasilPencarian;
    }
    
    public List<Donor> cariDonorByGolonganDarah(String golonganDarah) {
        List<Donor> hasilPencarian = new ArrayList<>();
        for (Donor donor : daftarDonor) {
            if (donor.getGolonganDarah().equalsIgnoreCase(golonganDarah)) {
                hasilPencarian.add(donor);
            }
        }
        return hasilPencarian;
    }

    
    public List<Donor> getDaftarDonor() {
        return daftarDonor;
    }

    public void urutkanDonorBerdasarkanNama() {
        Collections.sort(daftarDonor, Comparator.comparing(Donor::getNama));
    }

}


