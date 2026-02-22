package P2;

public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dsn1 = new Dosen04();
        dsn1.idDosen04 = "ITS24";
        dsn1.nama04 = "DHAHAR RIYEN";
        dsn1.statusAktif04 = true;
        dsn1.tahunBergabung04 = 2006;
        dsn1.bidangKeahlian04 = "OPERASIONAL";

        Dosen04 dsn2 = new Dosen04 ("ITN26","VALENTEEN",false,2012,"IOT");

        System.out.println("=== Data Awal Dosen ===");
        dsn1.tampilInfromasi();
        dsn2.tampilInfromasi();

        dsn1.ubahKeahlian("SISTEM");
        dsn2.setStatusAktif(true);
        System.out.println();

        System.out.println("=== Data Terbaru Dosen ===");

        dsn1.tampilInfromasi();
        System.out.println("Masa Kerja = "+
        dsn1.hitungMasaKerja(2026) + "tahun" );
        System.out.println();
        dsn2.tampilInfromasi();
        System.out.println("Masa Kerja = "+ 
        dsn2.hitungMasaKerja(2026)+ "tahun");
    }
     
}
