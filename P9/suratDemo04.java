package P9;

import java.util.Scanner;

public class suratDemo04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        stackSurat04 stack = new stackSurat04(5);

        int pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Terima surat izin");
            System.out.println("2. Proses surat izin");
            System.out.println("3. Lihat surat izin terakhir");
            System.out.println("4. Cari surat");
            System.out.print("Pilih menu: ");
            pilih = ayu.nextInt();
            ayu.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = ayu.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = ayu.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = ayu.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = ayu.next().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = ayu.nextInt();
                    ayu.nextLine(); 

                    surat04 surat = new surat04(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    surat04 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat izin dari " + proses.namaMahasiswa);
                    }
                    break;
                case 3:
                    surat04 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("=== Surat izin terakhir ===");
                        System.out.println("ID Surat       : " + lihat.idSurat);
                        System.out.println("Nama Mahasiswa : " + lihat.namaMahasiswa);    
                        System.out.println("Kelas          : " + lihat.kelas);
                        System.out.println("Jenis Izin     : " + lihat.jenisIzin);
                        System.out.println("Durasi Izin    : " + lihat.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama: ");
                    String namaCari = ayu.nextLine();
                    stack.cari(namaCari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;

             }
         } while (pilih >= 1 && pilih <=4);
         ayu.close();
    }
}
