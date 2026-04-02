package P6;

public class Mahasiswa04 {
    String nim04;
    String nama04;
    String kelas04;
    double ipk04;

    Mahasiswa04(){

    }
    Mahasiswa04(String nm, String name, String kls, double ip){
        nim04 = nm;
        nama04 = name;
        kelas04 = kls;
        ipk04 = ip;
    }
    void tampilInformasi (){
        System.out.println("Nama    : "+nama04);
        System.out.println("NIM     : "+nim04);
        System.out.println("Kelas   : "+kelas04);
        System.out.println("IPK     : "+ipk04);

    }
}
