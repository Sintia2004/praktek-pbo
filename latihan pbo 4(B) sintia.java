/*

nama : sintia
no nim : 2301091029
soal 4 do while
*/
import java.util.Scanner;

public class latihan4pboB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();
        
        int hasil = 1;
        int i = 1;
        
        do {
            hasil *= nilai;
            i++;
        } while (i <= pangkat);
        
        System.out.println("Hasil " + nilai + " pangkat " + pangkat + " adalah: " + hasil);
    }
}
