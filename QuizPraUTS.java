/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;
import java.util.Scanner;
/**
 *
 * @author astri
 */
public class QuizPraUTS {
    public static void main(String[] args) { 
    Scanner scn = new Scanner (System.in); 
    System.out.print("Pilihlah salah satu pemograman berikut: ( a atau b ) :\na. 2D\nb. 3D\njawab :"); 
    String pilihan = scn.nextLine(); 

    String x = pilihan;  
    
    if(x.equalsIgnoreCase("a")){ 
        System.out.print("\nPemrograman luas permukaan 2D\npilih(ketik a / b / c ) :\na. segitiga\nb. persegi panjang\nc. Lingkaran\njawab : "); 
        String dua = scn.nextLine(); 

        if (dua.equals("a")){
            System.out.print("\nMasukan nilai berikut : \nalas : "); 
            int aSegitiga = scn.nextInt(); 
            System.out.print("tinggi : "); 
            int tSegitiga= scn.nextInt();   
            int lpSegitiga = (aSegitiga * tSegitiga)/2; 
            System.out.println("Luas permukaan segitiga = " +lpSegitiga); 

        }  

        else if (dua.equals("b")){ 
            System.out.print("\nMasukan nilai berikut : \npanjang : "); 
            int pPersegi = scn.nextInt(); 
            System.out.print("lebar : "); 
            int lPersegi = scn.nextInt(); 
            int lpPersegi = (pPersegi * lPersegi); 
            System.out.println("Luas permukaan persegi = " +lpPersegi); 

        } 

        else if (dua.equals("c")){ 
            System.out.print("\nMasukan nilai berikut : \nradius : "); 
            double radiusLingkaran = scn.nextDouble(); 
            double lpLingkaran = (radiusLingkaran * radiusLingkaran * (3.14)); 
            System.out.println("Luas permukaan lingkaran = " +lpLingkaran); 

        }} 

     else {System.out.print("\nSelamat datang di pemrograman luas permukaan 3D\npilih(ketik a / b / c ) :\na. tabung\nb. limas segiempat\nc. bola\njawab : ");} 

     String tiga = scn.nextLine(); 

        if (tiga.equals("a")){System.out.print("Masukan nilai berikut : \nradius alas : "); 
            double radiusTabung = scn.nextDouble(); 
            System.out.print("tinggi tabung :"); 
            double tTabung = scn.nextDouble();   
            double lpTabung = (radiusTabung * radiusTabung *(3.14)*2) + (radiusTabung *2 * (3.14)* tTabung); 
            System.out.println("Luas permukaan segitiga = " +lpTabung); 

        } 

        else if (tiga.equals("b")){System.out.print("\nMasukan nilai berikut : \nSisi Alas : "); 
            double sLingkaran = scn.nextDouble(); 
            System.out.print("tinggi sisi segitiga :"); 
            double tLingkaran = scn.nextDouble();   
            double lpLingkaran = ( sLingkaran * sLingkaran ) +( tLingkaran * sLingkaran * 2) ; 
            System.out.println("Luas permukaan segitiga = " +lpLingkaran); 

        } else if (tiga.equals("c")){System.out.print("\nMasukan nilai berikut : \nRadius Bola: "); 
            double radiusB = scn.nextDouble(); 
            double lpBola = ( radiusB * radiusB * (3.14) * 4); 
            System.out.println("Luas permukaan segitiga = " +lpBola); 

         

    } 

    } 

} 

