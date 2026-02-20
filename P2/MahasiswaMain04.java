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

        Mahasiswa04 mhs2 = new Mahasiswa04("Annisa nabila","2141720160", 3.25 , "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformais();

        Mahasiswa04 mhs3 = new Mahasiswa04("Ayu Wardatul Widad","254107020171", 3.95,"TI 1E" );
        mhs3.updateIpk(3.98);
        mhs3.tampilkanInformais();
    }
}
