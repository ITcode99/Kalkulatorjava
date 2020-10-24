/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author Adi Arput
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Penjumlahan;
        double Pengurangan;
        double Perkalian;
        double Pembagian;
        
        dataKalkulator Kalkulator = new dataKalkulator();
                Penjumlahan = dataKalkulator.getPenjumlahan(20,2);
                Pengurangan = dataKalkulator.getPengurangan(10.2,2);
                Perkalian = dataKalkulator.getPerkalian(20,10);
                Pembagian = dataKalkulator.getPembagian(11,2);
                
                System.out.println("Hasil Penjumlahan adalah "+Penjumlahan);
                System.out.println("Hasil Pengurangan adalah "+Pengurangan);
                System.out.println("Hasil Perkalian adalah "+Perkalian);
                System.out.println("Hasil Pembagian adalah "+Pembagian);
    }
    
}
