package P6;

import java.util.Scanner;

public class dosenDemo04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        dataDosen04 list = new dataDosen04();

        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia, input;
        
        System.out.print("Masukkan Jumlah Input : ");
        dummy = ayu.nextLine();
        input = Integer.parseInt(dummy);  

         System.out.println("=== DATA DOSEN ===");
        for (int i = 0; i < input; i++) {
            System.out.println("Masukkan data dosen ke-"+(i+1));
            System.out.print("Kode        : ");
            kode = ayu.nextLine();
            System.out.print("Nama        : ");
            nama = ayu.nextLine();
            System.out.print("Jenis Kelamin (true = L / false = P): ");
            dummy = ayu.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia        : ");
            dummy = ayu.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            dosen04 d = new dosen04(kode, nama, jenisKelamin, usia);
            list.tambah(d);
        }
        
        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("=== Data berhasil diurukan ASC ===");
        list.sortingASC();
        list.tampil();

        System.out.println("=== Data berhasil diurutkan DSC ===");
        list.sortingDSC();
        list.tampil();
    }
}