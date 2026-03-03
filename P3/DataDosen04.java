package P3;

public class DataDosen04 {
    void dataSemuaDosen (Dosen04[]arraDosen04){
        System.out.println("=== DATA SEMUA DOSEN ===");

        for (Dosen04 dsn : arraDosen04) {
            dsn.cekInfo();
        }
    }
}
