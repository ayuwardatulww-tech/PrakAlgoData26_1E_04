package P1;

import java.util.Scanner;

public class tugasDua {
    static Scanner ayu = new Scanner(System.in);
    static Scanner uya = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Banyak Jadwal : ");
        int input = ayu.nextInt();
        ayu.nextLine();
        
        String Jadwal [][] = new String[input][4];

        JadwalKuliah(Jadwal);
        TabelJadwal(Jadwal);
        Hari(Jadwal);
        CariMatkul(Jadwal);

    }
    static void JadwalKuliah (String [][] Jadwal){
        for (int i = 0; i < Jadwal.length; i++) {
            System.out.println("Jadwal ke - "+(i+1));
            
            System.out.print("Nama Matkul : ");
            Jadwal [i][0]= ayu.nextLine();

            System.out.print("Ruang : ");
            Jadwal [i][1]= uya.nextLine();

            System.out.print("Hari : ");
            Jadwal [i][2] = ayu.nextLine();
        
            System.out.print("Jam : ");
            Jadwal [i][3] = uya.nextLine();
            System.out.println();
        }
    }
    static void TabelJadwal (String [][] Jadwal){
        System.out.println("---------------------------------");
        System.out.println(" JADWAL KESELURUHAN MATA KULIAH");
        System.out.println("---------------------------------");

        
            System.out.printf("%-20s %-15s %-10s %-15s\n",
                "Mata Kuliah","Ruang","Hari","jam");
    
        System.out.println();
        for (int i = 0; i < Jadwal.length; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
                Jadwal[i][0], Jadwal[i][1],Jadwal[i][2],Jadwal[i][3]
            );
        }
        System.out.println();
    }
    static void Hari(String [][]Jadwal){
        System.out.print("Cari Jadwal Hari : ");
        String hari = ayu.nextLine();

        for (int i = 0; i < Jadwal.length; i++) {
            if (Jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("Jadwal kuliah hari "+hari+
                                    " dengan Mata Kuliah "+Jadwal[i][0]+
                                    " di Ruang "+Jadwal[i][1]+
                                    " dan Jam "+Jadwal[i][3]);
            }
        }
        System.out.println();
    }
    static void CariMatkul (String [][]Jadwal){
        System.out.print("Cari Mata Kuliah : ");
        String Cari = ayu.nextLine();

        for (int i = 0; i < Jadwal.length; i++) {
            if (Jadwal[i][0].equalsIgnoreCase(Cari)) {
                System.out.print("Mata Kuliah : "+Jadwal[i][0]+"|"+
                                    " Ruang : "+Jadwal[i][1]+"|"+
                                    " Hari : "+Jadwal[i][2]+"|"+
                                    " Jam : "+Jadwal[i][3]);
        }
        }
    }
}
