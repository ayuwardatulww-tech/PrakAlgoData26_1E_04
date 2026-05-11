package P11;

import java.util.Scanner;

public class SLLMain04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        singleLinkedList04 sll = new singleLinkedList04();

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jml = ayu.nextInt();
        ayu.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan Nama : ");
            String nama = ayu.nextLine();
            System.out.print("Masukkan NIM  : ");
            String nim = ayu.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = ayu.nextLine();
            System.out.print("Masukkan IPK  : ");
            double ipk = ayu.nextDouble();
            ayu.nextLine();

            mahasiswa04 mhs = new mahasiswa04(nama, nim, kelas, ipk);
            sll.addLast(mhs);

            System.out.println("\nIsi Linked List setelah penambahan: ");
            sll.print();
        }
    }
}
