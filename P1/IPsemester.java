package P1;

import java.util.Scanner;

public class IPsemester {
    static Scanner ayu = new Scanner(System.in);
    static String Matkul [];
    static int nilaiMhs [];
    static int sks [];
    static String nilaiHUruf04 [];
    static double nilaiSetara04 [];

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("=================================");

        Matkul = new String[]{"Pancasila","Konsep Teknologi Informasi","Critikal Thingking&Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemograman","Praktikum Dasar Pemograman","Keselamatan&Kesehatan Kerja","Fisika"};
        nilaiMhs = new int[Matkul.length];
        nilaiSetara04 = new double[Matkul.length];
        nilaiHUruf04 = new String[Matkul.length];

        sks = new int[] {2,2,2,2,2,2,3,2,2};

        for (int i = 0; i < Matkul.length; i++) {
            System.out.print((i+1)+". "+Matkul[i]+":");
            nilaiMhs[i] = ayu.nextInt();
        }
        konversiNilai04();
        tabel();
    }
    static void konversiNilai04 (){
        for (int j = 0; j < Matkul.length; j++) {
        int nilai04 = nilaiMhs[j];
        if (nilai04>80) {
            nilaiHUruf04[j] = "A";
            nilaiSetara04[j] = 4;
        }else if (nilai04>73) {
            nilaiHUruf04[j] = "B+";
            nilaiSetara04[j] = 3.5;
        }else if (nilai04>65) {
            nilaiHUruf04[j] ="B";
            nilaiSetara04[j] = 3;
        }else if (nilai04>60) {
            nilaiHUruf04[j] ="C+";
            nilaiSetara04[j]=2.5;
        }else if (nilai04>50) {
            nilaiHUruf04[j]="C";
            nilaiSetara04[j]=2;
        }else if (nilai04>39) {
            nilaiHUruf04[j]="D";
            nilaiSetara04[j]=1;
        }else {
            nilaiHUruf04[j]="E";
            nilaiSetara04[j]=0;
        }
    }
}
static void tabel(){
    double totBobot04 = 0;
        int totSKS04 =0;
        int nilaiMin04=0;
        boolean Status04=false;
        String status04;
        System.out.println("===============================================================");
        System.out.println("           HASIL KONVERSI NILAI ");
        System.out.println("===============================================================");
        System.out.println("---------------------------------------------------------------");

        System.out.printf("%-3s %-35s %-5s %-7s %-7s %-7s%n",
            "No","MataKuliah","SKS","Niai","HUruf","Setara"
        );
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < Matkul.length; i++) {
            System.out.printf("%-3d %-35s %-5d %-7d %-7s %-7.2f%n",
                (i + 1),
                Matkul[i],
                sks[i],
                nilaiMhs[i],
                nilaiHUruf04[i],
                nilaiSetara04[i]);
    
            totBobot04 += nilaiSetara04[i]*sks[i];
            totSKS04 += sks[i];
}
double ipSemester04 = totBobot04/totSKS04;
int ip = (int) ipSemester04;
System.out.println("Indeks Prestasi (IP) :"+ip);

}
}
