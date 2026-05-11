package P11.Tugas04;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    public Mahasiswa04(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilkanData(){
        System.out.println(nama+" \t "+nim+" \t "+kelas+" \t "+ipk);
    }
}

