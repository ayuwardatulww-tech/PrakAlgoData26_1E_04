package P2;

public class Dosen04 {
    String idDosen04;
    String nama04;
    boolean statusAktif04;
    int tahunBergabung04;
    String bidangKeahlian04;

void tampilInfromasi (){
    System.out.println("Id Dosen    : "+idDosen04);
    System.out.println("Nama        : "+nama04);
    if (statusAktif04) {
        System.out.println("status      : Aktif");
    }else {
        System.out.println("Status      : Tidak Aktif");
    }
    System.out.println("Tahun gabung  : "+tahunBergabung04);
    
    System.out.println("Bidang       : "+bidangKeahlian04);
    System.out.println();

}
void setStatusAktif (boolean status04){
    statusAktif04 = status04;   
}
int hitungMasaKerja (int tahunSkrg04){
    return tahunSkrg04 -= tahunBergabung04;
}
void ubahKeahlian (String keahlianBaru04){
    bidangKeahlian04 = keahlianBaru04;
}
public Dosen04(){};
public Dosen04(String id, String name,boolean status, int tahun, String bidang ){
this.idDosen04 = id;
this.nama04 = name;
this.statusAktif04 = status;
this.tahunBergabung04 = tahun;
this.bidangKeahlian04 = bidang;
}
}
