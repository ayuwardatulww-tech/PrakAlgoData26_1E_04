package P1;

import java.util.Scanner;

public class RoyalGarden {
    static String Toko [];
    static int Stock [][];
    static double harga [];


    public static void main(String[] args) {
        Toko = new String[]{"Royal Garden 1","Royal Garden 2","Royal Garden 3","Royal Garden 4"};
        Stock = new int[][]{{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        harga = new double[]{75000,50000,60000,10000};

        System.out.printf("%-3s %-20s %-10s %-10s %-10s%n",
            " ","Aglonema","Keladi","Alocasia","Mawar");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < Toko.length; i++) {
            System.out.printf("%-3d %-20s %-8d %-8d %-8d %-8d%n",
                (i + 1),
                Toko[i],
                Stock[i][0],
                Stock[i][1],
                Stock[i][2],
                Stock[i][3]);
        }
        perhitungan(0);
        pendapatan();
    }
    static int perhitungan (int cabang){
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += Stock[cabang][i]*harga[i];
        }
        return total;
    }
    static void pendapatan (){
        for (int i = 0; i < Toko.length; i++) {
            int pendapatan = perhitungan(i);
            String status;
            if (pendapatan>1500000) {
                status = "Sangat Baik";
            }else {
                status = "Perlu Evaluasi";
            }
            System.out.println(Toko[i]+" "+pendapatan+" "+status);

        }
    }
}
