/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintia1804;

/**
 *
 * @author Lenovo
 */
public class StudentRecordExample {
     public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("Ali");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setmathGrade(70);
        student1.setenglishGrade(80);
        student1.setscienceGrade(70);
        ////
        System.out.println("Nama               :"+student1.getName());
        System.out.println("Alamat             :"+student1.getAddress());
        System.out.println("Umur               :"+student1.getAge());
        System.out.println("Matematika         :"+student1.getmathGrade());
        System.out.println("B. Inggris         :"+student1.getenglishGrade());
        System.out.println("Ilmu Pengetahuan   :"+student1.getscienceGrade());
        System.out.println("Rata-rata          :"+student1.getaverage());
        
        StudentRecord annaRecord = new StudentRecord("Anna");
        StudentRecord aliRecord = new StudentRecord("Ali","Padang");
        StudentRecord deniRecord = new StudentRecord(80,70,60);
        
        System.out.println("Anna Record");
        annaRecord.print(annaRecord.getName());
        System.out.println();
        System.out.println("Ali Record");
        aliRecord.print(aliRecord.getName());
        System.out.println();
        System.out.println("Deni Record");
        deniRecord.print(deniRecord.getmathGrade(), deniRecord.getenglishGrade(),
                deniRecord.getscienceGrade());
        
        System.out.println("Jumlah Siswa       :"+StudentRecord.getStudentCount());
        
        
       
    }
    
}
