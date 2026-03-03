package P3;

public class DataDosen04 {
    void dataSemuaDosen (Dosen04[]arrayOfDosen04){
        System.out.println("=== DATA SEMUA DOSEN ===");

        for (Dosen04 dsn : arrayOfDosen04) {
            dsn.cekInfo();
        }
    }
    void jumlahDosenPerJK (Dosen04 [] arrayOfDosen04){
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen04 dsn : arrayOfDosen04) {
            if (dsn.jenisKelamin04 == true) {
                jmlPria++;
            }else {
                jmlWanita++;
            }
        }
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Jumlah Laki - laki  : "+jmlPria);
        System.out.println("Jumlah Perempuan    :"+jmlWanita);
        System.out.println();
    }
    void rataUsiaPerJK (Dosen04 [] arrayOfDosen04){
        int totUsiaPria = 0;
        int totUsiaWanita =0;
        int jmlPria=0;
        int jmlWanita=0;

        for (Dosen04 dsn : arrayOfDosen04) {
            if (dsn.jenisKelamin04) {
                totUsiaPria += dsn.usia04;
                jmlPria++;
            }else {
                totUsiaWanita += dsn.usia04;
                jmlWanita++;
            }
        }
        double rataPria=0;
        double rataWanita=0;

        if (jmlPria !=0) {
            rataWanita = (double) totUsiaWanita / jmlWanita;
        }
        if (jmlWanita !=0) {
            rataPria = (double) totUsiaPria / jmlPria;
        }
        System.out.println("=== RATA RATA USIA DOSEN ===");
        System.out.println("Rata - Rata Usia Laki - Laki    : "+rataPria);
        System.out.println("Rata - Rata Usia Perempuan      : "+rataWanita);
        System.out.println();
    }
    void UsiaTertua (Dosen04 [] arrayOfDosen04){
        Dosen04 tertua = arrayOfDosen04[0];

        for (Dosen04 dsn : arrayOfDosen04) {
            if (dsn.usia04 > tertua.usia04) {
                tertua = dsn;
            }
        }
        System.out.println("=== DOSEN TERTUA ===");
        tertua.cekInfo();
    }
}
