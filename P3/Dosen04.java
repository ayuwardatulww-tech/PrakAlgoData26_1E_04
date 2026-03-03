package P3;
public class Dosen04 {
    String kode04;
    String nama04;
    boolean jenisKelamin04;
    int usia04;

    public Dosen04 (String kode04, String nama04, boolean jenisKelamin04, int usia04){
        this.kode04 = kode04;
        this.nama04 = nama04;
        this.jenisKelamin04 = jenisKelamin04;
        this.usia04 = usia04;
    }
    public void cekInfo (){
        System.out.println("Kode            : "+kode04);
        System.out.println("Nama            : "+nama04);
        System.out.println("Jenis Kelamin   : "+ (jenisKelamin04 ? "Laki - laki" : "Perempuan"));
        System.out.println("Usia            : "+ usia04);
        System.out.println("----------------------------------");
    }
}
