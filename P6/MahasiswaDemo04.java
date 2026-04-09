package P6;

import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        String nim,nama,kelas,dummy;
        double ipk =0;
        int input;
        int jumMHS =5;

        System.out.print("Masukkan data mahasiswa : ");
        dummy = ayu.nextLine();
        jumMHS = Integer.parseInt(dummy);

        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
        Mahasiswa04 [] arrayOfMahasiswa = new Mahasiswa04[jumMHS];

        System.out.println("=== DATA MAHASISWA ===");
        for (int i = 0; i < jumMHS; i++) {
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

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        
        System.out.println("----------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = ayu.nextDouble();

        //melakukan pencarian data sequential
        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        //melakukan pencarian data binary
        System.out.println("--------------------------------------------");
        System.out.println("menggunakan Binary Search");
        System.out.println("--------------------------------------------");
        list.bubbleSort();
        double posisi2 = list.findBinarySearch(cari, 0, jumMHS-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

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
