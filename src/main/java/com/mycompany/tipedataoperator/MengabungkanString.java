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
public class MengabungkanString {
    public static void main(String[] args){
        //Mencampurkan String dengan Angka
        String total1  = "Total $" + 3;
        System.out.println(total1); // output Total $3
        
        //Mencampurkan String angka tetapi harus hati2
        String total2 = "Total $" + 3 + 2 + 1;
        System.out.println(total2); // Output total $321
        
        //Mencampurkan String berikutnya
        String total3 = "Total $" + (3+2+1);
        System.out.println(total3);// Total $6
        
        //coba
        System.out.println("Total $" + 3 + 2+ 1); // Total $321
        
        
    }
}
