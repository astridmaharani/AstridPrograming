/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulatorkasir;
import java.util.Scanner;
/**
 *
 * @author astri
 */
public class kakulatorSedeharnaArray {
     public static void main(String[] args) {
        while (true){
        Scanner input = new Scanner (System.in);
        // pilihan Operasi
        System.out.println("============================");
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("Pilihlah salah satu operasi kakulator berikut: ");
        System.out.println("a. Penjumlahan \nb. Pengurangan");
        // input data
        System.out.print("Masukan Operasi (a atau b): ");
        String choice = input.nextLine();
        System.out.print("Masukan Angka Pertama: ");
        int number1 = input.nextInt();
        System.out.print("Masukan Angka Ke-dua: ");
        int number2 = input.nextInt();
        System.out.print("Masukan Angka Ke-tiga: ");
        int number3 = input.nextInt();
        System.out.print("Masukan Angka Ke-empat: ");
        int number4 = input.nextInt();
        // program
        int [] number = {number1, number2, number3, number4};
        
            if (choice.equalsIgnoreCase("a")){
                    int jumlah = number[0] + number[1] + number[2] + number[3]; 
                    System.out.println("Hasil dari: "+number[0]+ " + " +number[1]+ " + "  +number[2]+ " + " + number[3]+ " = "+jumlah); 
            } else if (choice.equalsIgnoreCase("b")){
                    int jumlah = number[0] - number[1] - number[2] - number[3]; 
                    System.out.println("Hasil dari: "+number[0]+ " - " +number[1]+ " - "  +number[2]+ " - " + number[3]+ " = "+jumlah); 
            } else {
                System.out.println("Harap coba lagi! pilihan operasi yang Anda masukan salah"); 
                
            }
                    
            
        }
        
    
            
     }
     
}
