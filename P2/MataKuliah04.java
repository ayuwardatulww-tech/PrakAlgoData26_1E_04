package P2;
public class MataKuliah04 {
    String KodeMK04;
    String Nama04;
    int Sks04;
    int JumlahJam04;

void tampilkanInformasi(){
    System.out.println("Kode Mata Kuliah : " + KodeMK04);
    System.out.println("Nama Mahasiswa   : "+ Nama04);
    System.out.println("Sks mata kuliah  : "+ Sks04);
    System.out.println("Jumlah Jam       : "+ JumlahJam04);
}
void UbahSks (int sksBaru){
    Sks04 = sksBaru;
 }
void tambahJam (int jam){
    JumlahJam04 += jam;
 }
void kurangiJam (int jam){
    JumlahJam04 -= jam;
 }
public MataKuliah04(){}
public MataKuliah04 (String kodemk, String nama, int sks, int jmljam){
    KodeMK04 = kodemk;
    Nama04 = nama;
    Sks04 = sks;
    JumlahJam04 = jmljam;
 }
}
