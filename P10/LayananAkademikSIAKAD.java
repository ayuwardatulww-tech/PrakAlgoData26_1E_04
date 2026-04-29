package P10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        antriLayanan4 antrian = new antriLayanan4(5);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN AKADEMIK ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = ayu.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = ayu.next();
                    System.out.print("Nama: ");
                    String nama = ayu.next();
                    System.out.print("Prodi: ");
                    String prodi = ayu.next();
                    System.out.print("Kelas: ");
                    String kelas = ayu.next();
                    mahasiswa4 mhs = new mahasiswa4(nama, nim, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    mahasiswa4 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani Mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan !=0);
    }
}
