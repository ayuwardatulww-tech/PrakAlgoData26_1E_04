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
            System.out.println("8. Tambah Data pada indeks Tertentu");
            System.out.println("9. Hapus Data setelah NIM Tertentu");
            System.out.println("10. Hapus Data pada indeks Tertentu");
            System.out.println("11. Tampilkan Data pertama");
            System.out.println("12. Tampilkan Data terakhir");
            System.out.println("13. Tampilkan Data pada indeks Tertentu");
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
                case 8:
                    System.out.print("Masukkan indeks: ");
                    int index = ayu.nextInt();
                    ayu.nextLine();
                    mahasiswa04 mhsIndeks = list.inputMahasiswa(ayu);
                    list.add(index, mhsIndeks);
                    break;
                case 9:
                    System.out.print("Masukkan NIM yang data setelahnya ingin dihapus: ");
                    String nimHapus = ayu.nextLine();
                    list.removeAfter(nimHapus);
                    break;
                case 10:
                    System.out.print("Masukkan indeks yang data setelahnya ingin dihapus: ");
                    int indexHapus = ayu.nextInt();
                    ayu.nextLine();
                    list.remove(indexHapus);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast(); 
                    break;
                case 13:
                    list.getSize();
                    System.out.print("Masukkan indeks yang datanya ingin ditampilkan: ");
                    int indexTampil = ayu.nextInt();
                    ayu.nextLine();
                    list.getIndex(indexTampil);
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
