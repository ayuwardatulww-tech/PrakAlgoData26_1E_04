package CM1;

public class buku04 {
    String kodebuku;
    String judul;
    int tahunTerbit;

    buku04 (String Codebook, String Judul, int thTerbit){
        kodebuku = Codebook;
        judul = Judul;
        tahunTerbit = thTerbit;
    }
    void tampilBuku (){
        System.out.println("Kode: "+kodebuku+" | "+"Judul: "+judul+" | "+"Tahun: "+tahunTerbit);
    }
}
