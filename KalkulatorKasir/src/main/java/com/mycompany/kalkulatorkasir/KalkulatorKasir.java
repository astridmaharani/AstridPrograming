/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulatorkasir;
import java.util.Scanner;
/**
 *
 * @author astri
 */
public class KalkulatorKasir {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ES Companies Portal - Cashier App");
        System.out.println("=================================");
        System.out.print("Input item's name: ");
        String name = input.nextLine();
        System.out.print("Input item's price [use decimal numbers]: ");
        double harga;
        harga = input.nextDouble();
        System.out.print("Input item's quantity [1..20]: ");
        int quantity = input.nextInt();
        System.out.print("Input item's discount [0..50]: ");
        int discount = input.nextInt();
        System.out.println();
        
        //invoice
        System.out.println("ES Companies Portal - Invoice");
        System.out.println("=================================");
        System.out.println("Item's name: "+name);
        System.out.println("Item's price: "+harga);
        System.out.println("Item's quantity: "+quantity);
        System.out.println("Item's discount: "+discount);
        System.out.println();
        double totalharga = harga*quantity*(100-discount)/100;
        System.out.println("You have to pay: " +totalharga);
        System.out.println("---------------------------");
        
        //memasukan jumlah uang
        System.out.print("Input your money [use decimal numbers]: ");
        double money;
        money = input.nextDouble();
        System.out.println();
        
        //kembalian
        System.out.println("Thanks for purchasing!");
        double change = money-totalharga;
        System.out.println("Your change: " +change);
        
    }
}
