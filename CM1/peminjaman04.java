package CM1;

public class peminjaman04 {
    mahasiswa04 mhs;
    buku04 Buku;
    int lamaPinjam;
    int batasPinjam;
    int telat;
    int denda;

    peminjaman04 (mahasiswa04 Mhs, buku04 buku, int lamaPinjam){
        this.mhs = Mhs;
        this.Buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }
    void hitungDenda(){
        int batas = 5;
        int tarif = 2000;

        if (lamaPinjam > batas) {
            telat = lamaPinjam - batas;
            denda = telat * tarif;
        }else {
            denda = 0;
        }
    }
    void tampilPinjaman(){
        System.out.println(mhs.nama+" | "+Buku.judul+" | "+"Lama: "+lamaPinjam+" | "+"Terlambat: "+telat+" | "+"Denda: "+denda);
    }
    void inserionSort(peminjaman04 [] pinjam){
        for (int i = 1; i < pinjam.length; i++) {
            peminjaman04 temp = pinjam[i];
            int j = i;

            while (j > 0 && pinjam[j - 1].denda < temp.denda) {
                pinjam[j] = pinjam[j-1];
                j--;
            }
        pinjam[j] = temp;
        }
    }
}
