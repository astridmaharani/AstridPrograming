/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gslc;
import java.util.Scanner;
/**
 *
 * @author astri
 */
public class matrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris dan kolom matriks: ");
        int jumlah = input.nextInt();

        // Matriks pertama
        System.out.println("Masukkan elemen-elemen matriks pertama:");
        int[][] matrix1 = inputMatrixElements(jumlah, input);

        // Matriks kedua
        System.out.println("Masukkan elemen-elemen matriks kedua:");
        int[][] matrix2 = inputMatrixElements(jumlah, input);

        // Penjumlahan matriks
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Menampilkan hasil penjumlahan
        System.out.println("==================================");
        System.out.println("Hasil penjumlahan matriks adalah: ");
        displayMatrix(sumMatrix);
    }

    // Method untuk mengisi elemen-elemen matriks
    public static int[][] inputMatrixElements(int jumlah, Scanner input) {
        int[][] matrix = new int[jumlah][jumlah];

        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                System.out.print("Masukkan elemen matriks[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        return matrix;
    }

    // Method untuk menjumlahkan dua matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int jumlah = matrix1.length;

        int[][] sumMatrix = new int[jumlah][jumlah];

        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    // Method untuk menampilkan matriks
    public static void displayMatrix(int[][] matrix) {
        int jumlah = matrix.length;

        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

