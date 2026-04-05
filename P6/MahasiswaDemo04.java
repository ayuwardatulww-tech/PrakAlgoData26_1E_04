package P6;

import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        String nim,nama,kelas,dummy;
        double ipk =0;
        int input;

        System.out.print("Masukkan data mahasiswa : ");
        dummy = ayu.nextLine();
        input = Integer.parseInt(dummy);

        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
        Mahasiswa04 [] arrayOfMahasiswa = new Mahasiswa04[input];

        System.out.println("=== DATA MAHASISWA ===");
        for (int i = 0; i < input; i++) {
            System.out.println("Masukkan data Mahasiswa ke-"+(i+1));
            System.out.print("NIM        : ");
            nim = ayu.nextLine();
            System.out.print("Nama       : ");
            nama = ayu.nextLine();
            System.out.print("Kelas      : ");
            kelas = ayu.nextLine();
            System.out.print("IPK        : ");
            dummy = ayu.nextLine();
            ipk = Double.parseDouble(dummy);
            System.out.println("---------------------------------");

            arrayOfMahasiswa[i] = new Mahasiswa04(nim, nama, kelas, ipk);
        }
       list.listMhs = arrayOfMahasiswa;
       
        System.out.println("Data mahasiswa sebelum sorting :");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    }
}

 // Mahasiswa04 m1 = new Mahasiswa04("123", "Zidan", "2A", 3.2);
        // Mahasiswa04 m2 = new Mahasiswa04("124", "Ayu", "2A", 3.5);
        // Mahasiswa04 m3 = new Mahasiswa04("125", "Sofi", "2A", 3.1);
        // Mahasiswa04 m4 = new Mahasiswa04("126", "Sita", "2A", 3.9);
        // Mahasiswa04 m5 = new Mahasiswa04("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
