package P2;
public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah04 mhs1 = new MataKuliah04();
        mhs1.KodeMK04 = "ASD";
        mhs1.Nama04 = "Ayu";
        mhs1.Sks04 = 10;
        mhs1.JumlahJam04 = 17;

        mhs1.tampilkanInformasi();
        mhs1.UbahSks(12);
        mhs1.tambahJam(2);
        mhs1.kurangiJam(3);

        MataKuliah04 mhs2 = new MataKuliah04("AWD","Wardatul",15,25);
        mhs2.kurangiJam(4);
        mhs2.tampilkanInformasi();
    }

}
