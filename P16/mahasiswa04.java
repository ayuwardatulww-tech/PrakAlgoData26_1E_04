package P16;

public class mahasiswa04 {
    String nim;
    String nama;
    String notelp;

    public mahasiswa04() {

    }
    public mahasiswa04 (String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString(){
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
