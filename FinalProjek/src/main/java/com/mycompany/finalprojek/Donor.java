/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;

/**
 *
 * @author astri
 */

// Kelas Donor untuk merepresentasikan data donor darah
class Donor {
    private String nama;
    private String golonganDarah;

    public Donor(String nama, String golonganDarah) {
        this.nama = nama;
        this.golonganDarah = golonganDarah;
    }

    public String getNama() {
        return nama;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }
}


