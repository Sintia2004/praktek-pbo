/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintia170524;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author LAB-MM
 */
public class pembagianKosong {
    //method
    public  static int bagi(int a, int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("tidak boleh pembagian 0");
                    return a/b;
    }
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
      }catch(InputMismatchException e){
        System.out.println("nilai yang akan di inputkan salah");
        }catch(Exception e){
        System.out.println("pengecualian lain "+e.getMessage());
        }finally{
         System.out.println("program exception berakhir");
   
    }
    }
}
