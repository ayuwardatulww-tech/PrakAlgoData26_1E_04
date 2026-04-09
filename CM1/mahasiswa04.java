package CM1;

public class mahasiswa04 {
    String nim;
    String nama;
    String prodi;

    mahasiswa04 (String NIM, String Name, String Prodi){
        nim = NIM;
        nama = Name;
        prodi = Prodi;
    }
    void tampilMahasiswa (){
        System.out.println("NIM: "+nim+" | "+"Nama: "+nama+" | "+"Prodi: "+prodi);
    }
}
