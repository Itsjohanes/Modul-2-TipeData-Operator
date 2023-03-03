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
public class OperatorIncrementLanjut {
    public static void main(String[] args){
        int count = 15;
        int a,b,c,d;
        a = count++; //15
        b = count; //16
        c = ++count; //17
        d = count; //17
        System.out.println(a + "," + b + "," + c + "," + d);
                
       
        
    }
    
}
