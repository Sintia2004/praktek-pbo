/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oryza3;

/**
 *
 * @author ORYZA CONSEVA
 */
public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    public Balok(){
        
    }
    
    public Balok(int panjang,int lebar,int tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public void setPanjang(int panjang){
        this.panjang=panjang;
    }
    
     public int getLebar(){
        return lebar;
    }
    
    public void setLebar(int lebar){
        this.lebar=lebar;
    }
    
     public int getTinggi(){
        return tinggi;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    
    public int getVolume(int p,int l, int t){
        return p*l*t;
    }
    
    public int getVolume(int luas,int tinggi){
        return luas*tinggi;
    }
            
    public int luaspermukaan(int p,int l,int t){
        return 2*((p+l)+(p*t)+(l*t));
    }
}
