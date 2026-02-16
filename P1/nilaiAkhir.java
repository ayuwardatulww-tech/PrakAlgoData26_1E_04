package P1;

import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = ayu.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        double nilaiKuis = ayu.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double nilaiUTS = ayu.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = ayu.nextDouble();

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100){
                System.out.println("Nilai Tidak Valid");
            }else{
                double nilaiakhir = (nilaiTugas * 0.2) +
                                     (nilaiKuis * 0.2) +
                                     (nilaiUTS * 0.3) +
                                     (nilaiUAS * 0.4);
                int nilai = (int) nilaiakhir;
                System.out.println("Nilai Akhir : "+nilaiakhir);

                String nilaiHuruf;

                if (nilaiakhir >= 80) {
                    nilaiHuruf = "A";
                }else if (nilaiakhir >= 73) {
                    nilaiHuruf = "B+";
                }else if (nilaiakhir >= 65) {
                    nilaiHuruf = "B+";
                }else if (nilaiakhir >= 60) {
                    nilaiHuruf = "C+";
                }else if (nilaiakhir >= 50) {
                    nilaiHuruf = "C";
                }else if (nilaiakhir >= 39) {
                    nilaiHuruf = "D";
                }else {
                    nilaiHuruf = "E";
                }
                System.out.println("Nilai Huruf : "+  nilaiHuruf);
                System.out.println("--------------------------------");
                System.out.println("--------------------------------");
                
                if (nilaiakhir >=60) {
                    System.out.println("LULUS");
                }else {
                    System.out.println("TIDAK LULUS");
                }
            } 
        }
}
