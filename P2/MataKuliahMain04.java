package P2;
public class MataKuliahMain04 {
    public static void main(String[] args) {
        
        MataKuliah04 mhs1 = new MataKuliah04();
        mhs1.KodeMK04 = "ASD";
        mhs1.Nama04 = "Ayu";
        mhs1.Sks04 = 10;
        mhs1.JumlahJam04 = 17; 

        MataKuliah04 mhs2 = new MataKuliah04("AWD","Wardatul",15,25);

        System.out.println("=== DATA LAMA ===");
        mhs1.tampilkanInformasi();
        System.out.println();
        mhs2.tampilkanInformasi();
        
        System.out.println();
        System.out.println("=== DATA TERBARU ===");
        System.out.println();
        
        mhs1.UbahSks(12);
        mhs1.tambahJam(2);
        
        mhs2.kurangiJam(4);

        mhs1.tampilkanInformasi();
        System.out.println();
        mhs2.tampilkanInformasi();
        
    }
    
}
