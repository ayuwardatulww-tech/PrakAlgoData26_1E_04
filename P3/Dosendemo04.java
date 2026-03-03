package P3;
import java.util.Scanner;
public class Dosendemo04 {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia, input;

        System.out.print("Masukkan Jumlah Input : ");
        dummy = ayu.nextLine();
        input = Integer.parseInt(dummy);    
        
        Dosen04 [] arrayOfDosen04 = new Dosen04[input];

        System.out.println("=== DATA DOSEN ===");
        for (int i = 0; i < input; i++) {
            System.out.println("Masukkan data dosen ke-"+(i+1));
            System.out.print("Kode        : ");
            kode = ayu.nextLine();
            System.out.print("Nama        : ");
            nama = ayu.nextLine();
            System.out.print("Jenis Kelamin (true = L / false = P): ");
            dummy = ayu.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia        : ");
            dummy = ayu.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayOfDosen04[i] = new Dosen04(kode, nama, jenisKelamin, usia);
        }
        System.out.println("=== CHECK INFO ===");
        for (int i = 0; i < input; i++) {
            arrayOfDosen04[i].cekInfo();
        }
        DataDosen04 data = new DataDosen04();
        data.dataSemuaDosen(arrayOfDosen04);

        data.jumlahDosenPerJK(arrayOfDosen04);
    }
}
