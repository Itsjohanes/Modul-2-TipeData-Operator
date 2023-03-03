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
public class TipeArray {
    public static void main(String[] args){
        //Array of String
        String[] cars = {"volvo", "BMW", "Ford"};
        //Array of int
        int[] angka = {1,2,3};
        //Accessing Array
        System.out.println(cars[0]); //volvo
        System.out.println(angka[0]); //1
        //Panjang Array
        System.out.println(angka.length);
        
        //loop dalam array
        for(String i : cars){
            System.out.println(i);
        }
        //Multi dimensional Array
        int[][] numbers = {{1,2,3,4},{5,6,7}};
    }
    
}
