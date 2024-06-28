/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintia170524;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LAB-MM
 */
public class ArrayExceptionExample {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    try{
    System.out.println("masukan ukuran array = ");
    int uk=input.nextInt();
    // deklarasi array
    int [] nilai=new int[uk];
    for(int i=0;i<uk;i++){
        System.out.println("nilai array indeks ke"+i+" = ");
        nilai[i]=input.nextInt();
    }
     System.out.println("indeks array yang akan di tampilkan = ");
     int index=input.nextInt();
     System.out.println("nilai indeks ke "+index+" = "+nilai[index]);
    }catch(InputMismatchException e){
    System.out.println("data input tidak sesui dengan tipe");
     }catch(NegativeArraySizeException e){
    System.out.println("ukuran array tidak boleh negatif");
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("angka yang di masukan array berlebih");
     }finally{
         System.out.println("blok exception berakhir");
   
    }
    }
    
}
