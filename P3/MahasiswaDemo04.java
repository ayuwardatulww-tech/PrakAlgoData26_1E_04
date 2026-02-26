package P3;

import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        Mahasiswa04[] arrayOfMahasiswa04 = new Mahasiswa04[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa04[i] = new Mahasiswa04();

            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa04[i].nim04 = ayu.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa04[i].nama04 = ayu.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa04[i].kelas04 = ayu.nextLine();
            System.out.print("IPK     :");
            dummy = ayu.nextLine();
            arrayOfMahasiswa04[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------------------");    
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("NIM     : "+arrayOfMahasiswa04[i].nim04);
            System.out.println("Nama    : "+arrayOfMahasiswa04[i].nama04);
            System.out.println("Kelas   : "+arrayOfMahasiswa04[i].kelas04);
            System.out.println("IPK     : "+arrayOfMahasiswa04[i].ipk);
            System.out.println("-----------------------------------------------");
        }
    }
}
