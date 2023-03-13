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
public class KalkulatorKasir2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Keyboard,Mouse,Monitor,choice,result= 0;
        System.out.println("ES Companies Portal - Cashier App 2");
        System.out.println("=================================");
        System.out.println("1. Keyboard - $49.99 ");
        System.out.println("2. Mouse - $19.99 ");
        System.out.println("3. Monitor - $99.99 ");
        System.out.println("4. Exit ");
        //memilih produk dan jumlah
        System.out.print("Choose a product: ");
        choice = input.nextInt();
        if((choice)==4){
            System.out.println("Thanks for using this aplication :D"); 
        }else{
            System.out.print("Input quantity[1..20]: ");
        int jumlah = input.nextInt();
        //kemungkinan ketersediaan stok
        if(jumlah>20){
            System.out.println();
            System.out.println("Out of Stock!");
            System.out.println("Thanks for using this aplication :D");
        }else {
            switch (choice){
                case 1 :
                    System.out.println();
                    System.out.println("Purchase Information");
                    System.out.println("--------------------");
                    System.out.println("Item's name: Keyboard");
                    System.out.println("Price: $49.99");
                    System.out.println("Quantity: "+jumlah);
                    double totalharga1 = 49.99 * jumlah;
                    System.out.println(); 
                    System.out.println("Total: "+totalharga1);
                    //memasukan jumlah uang
                    System.out.println();
                    System.out.print("Input your money [min "+totalharga1+"]: ");
                    double money1;
                    money1 = input.nextDouble();
                    if (money1<totalharga1){
                        System.out.println("Not enough money!");
                        System.out.println();
                        System.out.println("Thanks for using this aplication :D");break;
                    }else{ //kembalian                       
                        System.out.println("Thanks for purchasing!");
                        double change1 = money1-totalharga1;
                        System.out.println("Your change: " +change1);
                        System.out.println();
                        System.out.println("Thanks for using this aplication :D");break;
                    }
                case 2 :
                    System.out.println();
                    System.out.println("Purchase Information");
                    System.out.println("--------------------");
                    System.out.println("Item's name: Mouse");
                    System.out.println("Price: $19.99");
                    System.out.println("Quantity: "+jumlah);
                    double totalharga2 = 19.99 * jumlah;
                    System.out.println(); 
                    System.out.println("Total: "+totalharga2);
                    //memasukan jumlah uang
                    System.out.println();
                    System.out.print("Input your money [min "+totalharga2+"]: ");
                    double money2;
                    money2 = input.nextDouble();
                    if (money2<totalharga2){
                        System.out.println("Not enough money!");
                        System.out.println();
                        System.out.println("Thanks for using this aplication :D");break;
                    }else{ //kembalian                       
                        System.out.println("Thanks for purchasing!");
                        double change2 = money2-totalharga2;
                        System.out.println("Your change: " +change2);
                        System.out.println();
                        System.out.println("Thanks for using this aplication :D");break;
                    }
                case 3 :
                    System.out.println();
                    System.out.println("Purchase Information");
                    System.out.println("--------------------");
                    System.out.println("Item's name: Monitor");
                    System.out.println("Price: $99.99");
                    System.out.println("Quantity: "+jumlah);
                    double totalharga3 = 99.99 * jumlah;
                    System.out.println(); 
                    System.out.println("Total: "+totalharga3);
                    //memasukan jumlah uang
                    System.out.println();
                    System.out.print("Input your money [min "+totalharga3+"]: ");
                    double money3;
                    money3 = input.nextDouble();
                    if (money3<totalharga3){
                        System.out.println("Not enough money!");
                        System.out.println();
                        System.out.println("Thanks for using this aplication :D");break;
                    }else{ //kembalian                       
                        System.out.println("Thanks for purchasing!");
                        double change1 = money3-totalharga3;
                        System.out.println("Your change: " +change1);
                        System.out.println();
                        System.out.println("Thanks for using this aplication :D");break;
                    }
            }
            
        }
            
        }
        
                
   }   
}