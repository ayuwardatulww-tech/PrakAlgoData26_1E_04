package P1;

import java.util.Scanner;

public class nim {
    public static void main(String[] args) {
        Scanner ayu = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        double nim = ayu.nextDouble();

        int n = (int) (nim % 100);
        System.out.println(n);

        if (n < 10) {
            n+=10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("#");
            }else if (i % 2 == 0) {
                System.out.print(" "+ i);
            }else {
                System.out.print("* ");
            }
        }
    }
    
}
