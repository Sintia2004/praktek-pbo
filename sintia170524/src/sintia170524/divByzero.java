/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintia170524;

import java.util.Scanner;
import static sintia170524.pembagianKosong.bagi;

/**
 *
 * @author LAB-MM
 */
public class divByzero {
    public static void main(String[] args){
          Scanner input = new Scanner(System.in);
    try{
        System.out.println("masukan nilai yang akan di bagi = ");
        int nilai1=input.nextInt();
        System.out.println("nilai pembagi = ");
        int nilai2=input.nextInt();
        int result = bagi(nilai1,nilai2);
        System.out.println("hasil = "+result);
    }catch(ArithmeticException e){
        System.out.println("pesan error : "+e);
    }
    }
    
}
