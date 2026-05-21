package CM2;

import java.util.Scanner;

public class mainRoyalDelish04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);

        doubleLinkedListPembeli04 listPembeli = new doubleLinkedListPembeli04();
        doubleLinkedListPesanan04 listPesanan = new doubleLinkedListPesanan04();
        

        listPembeli.addLast(new pembeli04("Ayu", "085801"));
        listPembeli.addLast(new pembeli04("Eki", "085802"));
        listPembeli.addLast(new pembeli04("Yuki", "085803"));

        
        
        int pilihan;

        do {
            System.out.println("=================================");
            System.out.println("Sistem Antrian Royal Delish");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = ayu.nextInt();
            ayu.nextLine(); 

            switch (pilihan) {
                case 1:
                    pembeli04 baru = listPembeli.inputPembeli(ayu);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor antrian " + baru.noAntrian);
                    break;
                case 2:
                    listPembeli.print();
                    break;
                case 3:
                    if (listPembeli.isEmpty()) {
                        System.out.println("Antrian kosong");
                        break;
                    } 
                    listPembeli.print();
                    System.out.print("Masukkan No Antrian yang dipanggil: ");
                    int inputNoAntrian = ayu.nextInt();
                    ayu.nextLine();

                    pembeli04 pembeli = listPembeli.removeByNoAntrian(inputNoAntrian);
                    if (pembeli == null) {
                        System.out.println("No Antrian " + inputNoAntrian + " tidak ditemukan.");
                    } else {
                        System.out.println("Pembeli " + pembeli.namaPembeli + " dengan No Antrian " + inputNoAntrian + " telah dilayani.");
                        pesanan04 pesanan = listPesanan.inputPesanan(ayu, pembeli);
                        System.out.println(pembeli.namaPembeli + " memesan " + pesanan.namaPesanan + " dengan harga " + pesanan.harga);
                    }
                    break;
                case 4:
                    listPesanan.printLaporan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Royal Delish!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan !=0);
    }
}
