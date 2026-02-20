package P2;

public class Mahasiswa04 {
 String nama04;
 String nim04;
 String kelas04;
 double ipk04;

 void tampilkanInformais (){
    System.out.println("Nama : "+ nama04);
    System.out.println("Nim : "+nim04);
    System.out.println("IPK : "+ipk04);
    System.out.println("Kelas : "+kelas04);
 }
 void UbahKelas (String kelasbaru) {
   kelas04 = kelasbaru;
 }
 void updateIpk (double ipkBaru){
   ipk04 = ipkBaru;
 }
 String nilaiKinerja (){
   if (ipk04 >= 3.5) {
      return "Kinerja sangat baik";
   } else if (ipk04 >= 3.0) {
      return "Kinerja baik";
   }else if (ipk04 >= 2.0) {
      return "Kinerja cukup";
   }else {
      return "Kinerja kurang";
   }
 }
 public Mahasiswa04 (){}
public Mahasiswa04 (String nm, String nim, double ipk, String kls){
   nama04 = nm;
   nim04 = nim;
   ipk04 = ipk;
   kelas04 = kls;
 }
 
}