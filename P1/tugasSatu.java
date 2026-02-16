package P1;
import java.util.Scanner;

public class tugasSatu {
    public static void main(String[] args) {
    Scanner ayu = new Scanner(System.in);
    char KODE [] = new char[] {'A','B','D','E','F','G','H','L','N','T'};
    char KOTA [][] = new char[][] {
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}
    };
    

    for (int i = 0; i < KODE.length; i++) {
        

        System.out.printf("%c  ",KODE[i]);
        for (int j = 0; j < KOTA[i].length; j++) {
            System.out.print(KOTA[i][j]+" ");
        }
        System.out.println();
    }
        System.out.print("Pilih Kode Plat : ");
        char pilihKOde= ayu.next().charAt(0);
    
    int index = -1;
    for (int i = 0; i < KODE.length; i++) {
        if (pilihKOde == KODE[i]) {
            index = i;
            break;
        }
    }
    if (index !=-1) {
        System.out.println("Kota : ");
        for (int i = 0; i < KOTA[index].length; i++) {
            System.out.print(KOTA[index][i]);
        }
    }else {
        System.out.println("Kode tidak ditemukan!");
    }
    }
    }
