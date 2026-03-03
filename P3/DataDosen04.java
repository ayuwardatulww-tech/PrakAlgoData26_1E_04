package P3;

public class DataDosen04 {
    void dataSemuaDosen (Dosen04[]arraDosen04){
        System.out.println("=== DATA SEMUA DOSEN ===");

        for (Dosen04 dsn : arraDosen04) {
            dsn.cekInfo();
        }
    }
    void jumlahDosenPerJK (Dosen04 [] arrDosen04){
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen04 dsn : arrDosen04) {
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
}
