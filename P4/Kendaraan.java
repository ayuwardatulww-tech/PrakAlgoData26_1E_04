package P4;

public class Kendaraan {
    //No.absen 04
    String nomorPlat04;
    double jarakTemouh04;
    double bahanBakar04;

    public Kendaraan (String nomorPlat04, double jarakTemouh04, double bahanBakar04){
        this.nomorPlat04 = nomorPlat04;
        this.jarakTemouh04 = jarakTemouh04;
        this.bahanBakar04 = bahanBakar04;
    }
    //membuat objek printdata untuk menampilkan ulang data yang telah di input
    void printData (){
        System.out.println("Nomor Plat      : "+nomorPlat04);
        System.out.println("Jarak Tempuh    : "+jarakTemouh04);
        System.out.println("Bahan Bakar     : "+bahanBakar04);
        System.out.println("----------------------------");
    }
    //membuat efisiensiBBM untuk menghitung jarak tempuh yang dibagi dengan bahan bakar
    double efisiensiBBM () {
    return jarakTemouh04/bahanBakar04;
    }
    //membuat presentase untuk menghitung presentase jumlah kendaraan dengan nilai efisiensi lebih dari 10
    void Presentasse (){
        int totPresetase=0;
        //untuk menyimpan nilai presentase

        if (efisiensiBBM()>10) {
            totPresetase++;
        }
        System.out.println("Presentase Kendaraan    : "+(Double)efisiensiBBM());
        //menggunakan int agar hasil dari presentasi tidak terlalu banyak angka
}

}
