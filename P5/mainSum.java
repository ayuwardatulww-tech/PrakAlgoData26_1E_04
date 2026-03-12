package P5;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = ayu.nextInt();

        sum04 sm = new sum04(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(1+i)+": ");
            sm.keuntungan[i] = ayu.nextDouble();
        }
        System.out.println("Total keuntungan menggunaka BruteForce :"+sm.totalBF());
        System.out.println("Total keuntungan menggunaka Divide and Conquer :"+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }   
}
