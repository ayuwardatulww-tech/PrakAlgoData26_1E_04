package P3;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Mahasiswa04[] arrayOfMahasiswa04 = new Mahasiswa04[3];
        arrayOfMahasiswa04[0] = new Mahasiswa04();
        arrayOfMahasiswa04[0].nim04 ="244107060033";
        arrayOfMahasiswa04[0].nama04 = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa04[0].kelas04 = "SIB-1E";
        arrayOfMahasiswa04[0].ipk = (float) 3.75;

        arrayOfMahasiswa04[1] = new Mahasiswa04();
        arrayOfMahasiswa04[1].nim04 = "2341720172";
        arrayOfMahasiswa04[1].nama04 = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa04[1].kelas04 = "TI-2A";
        arrayOfMahasiswa04[1].ipk = (float) 3.36;
    
        arrayOfMahasiswa04[2] = new Mahasiswa04();
        arrayOfMahasiswa04[2].nim04 = "244107023006";
        arrayOfMahasiswa04[2].nama04 = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa04[2].kelas04 = "TI-2E";
        arrayOfMahasiswa04[2].ipk = (float) 3.80;

        System.out.println("NIM     :  "+ arrayOfMahasiswa04[0].nim04);
        System.out.println("Nama    : "+arrayOfMahasiswa04[0].nama04);
        System.out.println("Kelass  : "+arrayOfMahasiswa04[0].kelas04);
        System.out.println("IPK     : "+ arrayOfMahasiswa04[0].ipk);
        System.out.println("-----------------------------------------------");
        System.out.println("NIM     :  "+ arrayOfMahasiswa04[1].nim04);
        System.out.println("Nama    : "+arrayOfMahasiswa04[1].nama04);
        System.out.println("Kelass  : "+arrayOfMahasiswa04[1].kelas04);
        System.out.println("IPK     : "+ arrayOfMahasiswa04[1].ipk);
        System.out.println("-----------------------------------------------");
        System.out.println("NIM     :  "+ arrayOfMahasiswa04[2].nim04);
        System.out.println("Nama    : "+arrayOfMahasiswa04[2].nama04);
        System.out.println("Kelass  : "+arrayOfMahasiswa04[2].kelas04);
        System.out.println("IPK     : "+ arrayOfMahasiswa04[2].ipk);
        System.out.println("-----------------------------------------------");
    }
}
