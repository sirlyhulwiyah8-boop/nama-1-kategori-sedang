/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihansoaluklnomor3;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class LatihansoalUKLnomor3 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG FAKTORIAL");
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        long faktorial = 1;

        if (n < 0) {
            System.out.println("Maaf, bilangan harus positif!");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i; // faktorial = faktorial * i
            }
            System.out.println("Hasil faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}