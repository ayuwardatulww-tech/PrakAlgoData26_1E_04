package CM1;

import java.util.Scanner;

public class demoPeminjaman04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        Scanner ayu04 = new Scanner(System.in);

        mahasiswa04 [] mhs = {
            new mahasiswa04("22001", "Andi", "Teknik Informatika"),
            new mahasiswa04("22002", "Budi", "Teknik Informatika"),
            new mahasiswa04("22003", "Citra", "Sistem Informasi Bisnis")
        };
        buku04 [] Buku = {
            new buku04("B001", "Algoritma", 2020),
            new buku04("B002", "Basis Data", 2019),
            new buku04("B003", "Pemograman", 2021),
            new buku04("B004", "Fisika", 2024)
        };
        peminjaman04 [] pinjam = {
            new peminjaman04(mhs[0], Buku[0], 7),
            new peminjaman04(mhs[1], Buku[1], 3),
            new peminjaman04(mhs[2], Buku[2], 10),
            new peminjaman04(mhs[2], Buku[3], 6),
            new peminjaman04(mhs[0], Buku[1], 4)
        };
        int pilih;
        do {
            System.out.println("\n---SISTEM PEMINJAMAN RUANG BACA JTI---");
            System.out.println("\nMENU");
            System.out.println("1. Tampil Mahasiswa");
            System.out.println("2. Tampil Buku");
            System.out.println("3. Tampil Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = ayu.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nData Mahasiswa: ");
                    for (mahasiswa04 m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("\nData Buku: ");
                    for (buku04 b : Buku) {
                        b.tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("\nData Pinjaman");
                    for (peminjaman04 p : pinjam) {
                        p.tampilPinjaman();
                    }
                    break;
                case 4:
                    pinjam[0].inserionSort(pinjam);
                    System.out.println("\nSetelah diurutkan (Denda terbesar)");
                    for (peminjaman04 p : pinjam) {
                        p.tampilPinjaman();
                    }
                    
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String input = ayu04.nextLine();

                    boolean ketemu = false;
                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].mhs.nim.equals(input)) {
                            pinjam[i].tampilPinjaman();
                            ketemu = true;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
            }
        } while (pilih != 0);
    }
}
