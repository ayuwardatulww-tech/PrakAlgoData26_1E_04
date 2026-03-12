package P4;

import java.util.Scanner;

public class KendaraanMain {
    //No.absen 04
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        String nomorPlat,dummy;
        double jarakTempuh;
        double bahanBakar04;
        
        System.out.print("Masukkan Jumlah Input kendaraan : ");
        dummy = ayu.nextLine();
        //kegunaan dummy untuk menyimpan nilai int melalui string atau hanya untuk tempat sementara
        int input = Integer.parseInt(dummy);   

        //membuat array untuk menyimpan data yang telah di input
        Kendaraan [] arrayOfKendaraan = new Kendaraan[input];

        for (int i = 0; i < input; i++) {
            System.out.println("Kendaraan ke-"+(1+i));
            System.out.print("Nomor Plat      : ");
            nomorPlat = ayu.nextLine();
            System.out.print("Jarak tempuh    : ");
            dummy = ayu.nextLine();
            jarakTempuh = Double.parseDouble(dummy);
            System.out.print("Bahan Bakar     : ");
            dummy = ayu.nextLine();
            bahanBakar04 = Double.parseDouble(dummy);
            System.out.println("---------------------");

            //untuk menyimpan data yang telah di input
            arrayOfKendaraan[i] = new Kendaraan(nomorPlat, jarakTempuh, bahanBakar04);
        }
        //untuk menampilkan kembali data
        System.out.println("=== PRINT DATA ===");
        for (int i = 0; i < input; i++) {
            arrayOfKendaraan[i].printData();
        }
        // membuat objek baru untuk menyimpan data
        Kendaraan efisiensi = arrayOfKendaraan[0];

        for (int i = 0; i < arrayOfKendaraan.length; i++) {
            if (arrayOfKendaraan[i].efisiensiBBM()>efisiensi.efisiensiBBM()) {
                efisiensi = arrayOfKendaraan[i];       
            }
        }
        System.out.println("==== KENDARAAN YANG PALING EFISIEN ===");
        efisiensi.printData();

        System.out.println("=== PRESENTASE KENDARAAN ===");
        efisiensi.Presentasse();
    }
}
