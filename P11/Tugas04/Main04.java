package P11.Tugas04;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        QueueLinked04 antrian = new QueueLinked04(10);

        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa dari Antrian");
            System.out.println("3. Tampilkan Semua Mahasiswa");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terbelakang");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Bersihkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = ayu.nextInt();
            ayu.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = ayu.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = ayu.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = ayu.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipk = ayu.nextDouble();
                    ayu.nextLine(); 
                    Mahasiswa04 mhs = new Mahasiswa04(nama, nim, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    antrian.peekFront();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    System.out.println("Apakah antrian kosong? " + antrian.isEmpty());
                    break;
                case 8:
                    System.out.println("Apakah antrian penuh? " + antrian.isFull());
                    break;
                case 9:
                    antrian.clear();    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}
