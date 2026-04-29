package P10;
public class mahasiswa4 {
    String nim;
    String nama;
    String prodi;
    String kelas;
    
    public mahasiswa4(String nama, String nim, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilkanData(){
        System.out.println(nim+" - "+nama+" - "+prodi+" - "+kelas);
    }
}
