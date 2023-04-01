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
public class faktorial {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
       
        while (true){
            int faktorial = 1;
            
            System.out.print("Masukan Angka: ");
            int angka = input.nextInt();
            
        if(angka > 0){
            for (int i = 1; i <= angka; i++){
                faktorial *= i;
            }
            System.out.println("Hasil faktorial dari " + angka + " adalah " + faktorial); 
        }else{
            System.out.println("Program Berhenti");
            break;
        }
                
        }
        
    }
}
