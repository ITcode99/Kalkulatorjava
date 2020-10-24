/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Adi Arput
 */
public class dataKalkulator {
    public static double getPenjumlahan(double nilai1, double nilai2){
        double hasil = nilai1 + nilai2;
        return hasil;
    }
    
    public static double getPengurangan(double nilai1, double nilai2){
        double hasil = nilai1 - nilai2;
        return hasil;
    }
    
    public static double getPerkalian(double nilai1, double nilai2){
        double hasil = nilai1 * nilai2;
        return hasil;
    }
    
    public static double getPembagian(double nilai1, double nilai2){
        double hasil = nilai1 / nilai2;
        return hasil;
    }

    static double getPenjumlahan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
