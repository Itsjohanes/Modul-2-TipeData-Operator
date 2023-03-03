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
public class OperatorIncrement {
    public static void main(String[] args){
        //Preincrement ditambahkan dulu baru cetak!
        int id = 6;
        int newId = ++id;
        System.out.printf("%d , %d\n",id,newId);
        //post increment cetak dulu baru ditambahkan
        int idKedua = 6;
        int newIdKedua = idKedua++;
        System.out.printf("%d , %d",idKedua,newIdKedua);
    }
}
