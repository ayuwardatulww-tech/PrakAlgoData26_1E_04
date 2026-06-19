package P16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class mainSistemNilai04 {
    Scanner ayu = new Scanner(System.in);
    List<mahasiswa04> mahasiswis = new ArrayList<>();
    List<mataKuliah04> matkul = new ArrayList<>();
    List<nilai04> nelai = new ArrayList<>();

    Queue<mahasiswa04> antreanHapusMhs = new LinkedList<>();

    public void inisialisasi(){
        mahasiswis.add(new mahasiswa04("202601", "Olivia Rodrigo", "08001"));
        mahasiswis.add(new mahasiswa04("202602", "Ariana Grande", "08002"));
        mahasiswis.add(new mahasiswa04("202603", "Justin Bieber", "08003"));
        mahasiswis.add(new mahasiswa04("202604", "Bruno Mars", "080804"));
        mahasiswis.add(new mahasiswa04("202605", "Sienna Spiro", "080805"));

        matkul.add(new mataKuliah04("001", "Drop deep", 3));
        matkul.add(new mataKuliah04("002", "The reason", 6));
        matkul.add(new mataKuliah04("003", "Risk it all", 2));
    }

    public void inputNilai(Scanner ayu){
        System.out.print("Masukkan Nilai: ");
        double newNilai = ayu.nextDouble();
        ayu.nextLine();

        System.out.println("===DAFTAR MAHASISWA===");
        for (mahasiswa04 m : mahasiswis) {
            System.out.printf("NIM: %S | Nama: %s\n", m.nim, m.nama);
        }
        System.out.print("Pilih mahasiswa by NIM: ");
        String ChooseNIM = ayu.nextLine();
        mahasiswa04 mhsTerpilih = mahasiswis.stream().filter(m -> m.nim.equals(ChooseNIM)).findFirst().orElse(null);

        System.out.println("***DAFTAR MATA KULIAH***");
        for (mataKuliah04 mk : matkul) {
            System.out.printf("Kode: %s | MK: %s | SKS: %d\n", mk.kode, mk.namaMk, mk.sks);
        }
        System.out.print("Pilih MK by KODE: ");
        String ChooseKODE = ayu.nextLine();
        mataKuliah04 mkTerpilih = matkul.stream().filter(mk -> mk.kode.equals(ChooseKODE)).findFirst().orElse(null);

        if (mhsTerpilih != null && mkTerpilih != null) {
            nelai.add(new nilai04(mhsTerpilih, mkTerpilih, newNilai));

            antreanHapusMhs.add(mhsTerpilih);
            System.out.println("Data Nilai Berhasil Dimasukkan!");
        }else {
            System.out.println("Gagal! NIM atau Kode Mata Kuliah tidak valid!");
        }
    }

    public void tampilNilai(){
        System.out.println("Nim"+"\t\t"+"Nama"+"\t\t"+"Mata Kuliah"+"\t"+"SKS"+"\t"+"Nilai");
        for (nilai04 n  : nelai) {
            System.out.println(n.mhs.nim +"\t"+ n.mhs.nama +"\t\t"+ n.mk.namaMk +"\t"+ n.mk.sks +"\t"+ n.nilai );
        } 
    }
    public void cariNilai(Scanner ayu){
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nimCari = ayu.nextLine();
         System.out.println("Nim"+"\t\t"+"Nama"+"\t\t"+"Mata Kuliah"+"\t"+"SKS"+"\t"+"Nilai");
        for (nilai04 n : nelai) {
            if (n.mhs.nim.equals(nimCari)) {
                System.out.println(n.mhs.nim +"\t"+ n.mhs.nama +"\t\t"+ n.mk.namaMk +"\t"+ n.mk.sks +"\t"+ n.nilai );
            }
        }
    }
    public void ururNilai(){
        nelai.sort((n1, n2) -> Double.compare(n1.nilai, n2.nilai));
        tampilNilai();
    }
    public void antreanHapusMhs(){
        if (!antreanHapusMhs.isEmpty()) {
            mahasiswa04 dihapus = antreanHapusMhs.poll();
            nelai.removeIf(n -> n.mhs.nim.equals(dihapus.nim));
            System.out.println("Mahasiswa bernama "+ dihapus.nama+" telah dikeluarkan");
        }else {
            System.out.println("Antrian Queue kosong!");
        }
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        mainSistemNilai04 Snilai = new mainSistemNilai04();
        Snilai.inisialisasi();
         int pilih;

        do {
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Antrian Mahasiswa (Queue)");
            System.out.println("6. Keluar");
            System.out.println("************************************************");
            System.out.print("Pilih: ");
            pilih = ay.nextInt();
            ay.nextLine();

            switch (pilih) {
                case 1:
                    Snilai.inputNilai(ay);
                    break;
                case 2:
                    Snilai.tampilNilai();
                    break;
                case 3:
                    Snilai.cariNilai(ay);
                    break;
                case 4:
                    Snilai.ururNilai();
                    break;
                case 5:
                    Snilai.antreanHapusMhs();
                    break;
                case 6:
                    System.out.println("Keluar program. Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 6);
    }

}
