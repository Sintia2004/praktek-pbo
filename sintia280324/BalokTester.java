/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oryza3;

import java.util.Scanner;

/**
 *
 * @author ORYZA CONSEVA
 */
public class BalokTester {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan panjang = ");
        int panjang=in.nextInt();
        System.out.print("Masukkan lebar = ");
        int lebar=in.nextInt();
        System.out.print("Masukkan tinggi = ");
        int tinggi=in.nextInt();
        
        Balok balok1=new Balok(panjang,lebar,tinggi);
        
        int v;
        v = balok1.getVolume(panjang,lebar,tinggi);
        System.out.println("Volume dengan methode 1 = "+v);
        
        int luasalas=balok1.getPanjang()*balok1.getLebar();
        int v2;
        v2=balok1.getVolume(luasalas, tinggi);
           System.out.println("Volume dengan methode 2 = "+v2);
           
        int lp =balok1.luaspermukaan(panjang, lebar, tinggi);
        System.out.println("Luas permukaan balok = "+lp);
        
        
        
        
    }
}
