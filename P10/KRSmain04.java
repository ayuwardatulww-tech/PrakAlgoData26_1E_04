package P10;

import java.util.Scanner;

public class KRSmain04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        layananKRS04 layanan = new layananKRS04(10);
        int pilihan;

        do {
            System.out.println("\n=== MENU LAYANAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian KRS");
            System.out.println("2. Tampilkan semua Mahasiswa");
            System.out.println("3. Tampilkan 2 Terdepan");
            System.out.println("4. Tampilkan Terakhir");
            System.out.println("5. Jumlah Antrian KRS");
            System.out.println("6. Layani 2 Mahasiswa");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Jumlah Belum Proses");
            System.out.println("9. Kosongkan Antrian KRS");
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
                    layanan.tambahAntrian(mhs);
                    break;
                case 2:
                    layanan.tampilkanSemua();
                    break;
                case 3:
                    layanan.lihatTerdepan();
                    break;
                case 4:
                    layanan.lihatAkhir();
                    break;
                case 5:
                    layanan.getJumlahAntrian();
                    break;
                case 6:
                    layanan.layani2mahasiswa();
                    break;
                case 7:
                    layanan.jumlahSudahProses();
                    break;
                case 8:
                    layanan.jumlahBelumProses();
                    break;
                case 9:
                    layanan.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan !=0);
        System.out.println("Program selesai.");
    }
}
