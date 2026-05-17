package P12;

import java.util.Scanner;

public class doubleLinkedListMain04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        doubleLinkedList04 list = new doubleLinkedList04();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan data ditengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7. Tampilkan Data Terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = ayu.nextInt();
            ayu.nextLine();

            switch (pilihan) {
                case 1:
                    mahasiswa04 mhsAwal = list.inputMahasiswa(ayu);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    mahasiswa04 mhsAkhir = list.inputMahasiswa(ayu);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = ayu.nextLine();
                    System.out.println("Masukkan data baru : ");
                    mahasiswa04 dataBaru = list.inputMahasiswa(ayu);
                    list.inserAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilihan != 0);
    }
}
