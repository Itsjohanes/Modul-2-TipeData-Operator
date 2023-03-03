/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tipedataoperator;

/**
 *
 * @author acer
 */
public class Konversi {
    public static void main(String[] args){
        
        //Bagian 1 Tindakan Pencegahan dengan Konversi
        //Kemungkinan masalah
        int num1 = 555555;
        int num2 = 666666;
        long num3= num1 * num2;
        
        //Solusi
        int num4 = 555555;
        long num5 = 666666;
        long num6 = num4 * num5;
        
        //kemungkinan masalah
        int num7 = 7;
        int num8 = 2;
        double num9 = num7/num8; //hasilnya jadi 3
        
        //Solusi
        int num10 = 7;
        int num11 = 2;
        double num12 = 7/2;
        
    }
}
