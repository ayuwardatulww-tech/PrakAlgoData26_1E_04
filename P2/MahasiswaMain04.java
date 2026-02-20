package P2;

public class MahasiswaMain04 {
    public static void main(String[] args) {
        Mahasiswa04 mhs1 = new Mahasiswa04();
        mhs1.nama04 = "Muhammad Ali Farhan";
        mhs1.nim04 = "2241720171";
        mhs1.kelas04 = "SI 2J";
        mhs1.ipk04 = 3.55;

        mhs1.tampilkanInformais();
        mhs1.UbahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformais();
    }
}
