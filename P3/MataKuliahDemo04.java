package P3;

import java.util.Scanner;

public class MataKuliahDemo04 {
    public static void main(String[] args) {
    Scanner ayu = new Scanner(System.in);
    MataKuliah04[] arrayOfMataKuliah04 = new MataKuliah04[3];
    String kode, nama, dummy;
    int sks, jumlahjam;

    for (int i = 0; i < 3; i++) {
        System.out.println("Masukkan Data Mata Kuliah ke-"+(i+1));
        System.out.print("Kode        : ");
        kode = ayu.nextLine();
        System.out.print("Nama        : ");
        nama = ayu.nextLine();
        System.out.print("Sks         : ");
        dummy = ayu.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam  : ");
        dummy = ayu.nextLine();
        jumlahjam = Integer.parseInt(dummy);
        System.out.println("-----------------------------------");

        arrayOfMataKuliah04[i] = new MataKuliah04(kode, nama, sks, jumlahjam);
    }
    for (int i = 0; i < 3; i++) {
        System.out.println("Data Mata Kuliah ke-"+(i+1));
        System.out.println("Kode          : "+arrayOfMataKuliah04[i].kode04);
        System.out.println("Nama          : "+arrayOfMataKuliah04[i].nama04);
        System.out.println("Sks           : "+ arrayOfMataKuliah04[i].sks04);
        System.out.println("Jumlah Jam    : "+arrayOfMataKuliah04[i].jumlahjam04);

    }
    }
}
