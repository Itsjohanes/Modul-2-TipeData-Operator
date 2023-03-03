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
public class TipeDataTekstual {
    public static void main(String[] args){
        //Satu-satunya tipe data tekstual primitif adalah char
        //Penulisan char pakai kutip 1
        char x = 'b'; 
        char y = "c"; 
        //String dapat dibentuk dari beberapa char
        System.out.println('a' + 'b' + 'c');
        //Char hanya dapat ditaruh oleh 1 karakter
        char yyy = "aay"; //tentu tidak bisa
        //Untuk menampung lebih dari 1 karakter perlu pakai String
        String zzz = "lol";
        //String adalah objek lihat saja ketika mendeklarasikan char char memiliki warna yang berbeda dengan String
        //Mengabungkan String bisa pakai + 
        String greet1 = "Hello";
        String greet2 = "World";
        String message = greet1 + " " + greet2;
        
        
        
    }
}
