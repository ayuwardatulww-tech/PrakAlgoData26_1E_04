package P14;

public class mahasiswa04 {
    String nim, nama, kelas;
    double ipk;

    public mahasiswa04() {
    }

    public mahasiswa04(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi(){
        System.out.println("NIM: " + nim + "\t" +"Nama: " + nama + "\t" + "Kelas: "+ kelas + "\t" + "IPK: "+ipk);
    }
}
