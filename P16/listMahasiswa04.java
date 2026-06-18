package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import P11.Tugas04.Mahasiswa04;

public class listMahasiswa04 {
    List<mahasiswa04> mahasiswas = new ArrayList<>();

    public void tambah(mahasiswa04... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    public void update(int index, mahasiswa04 mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    int binarySearch(String nim){
        mahasiswas.sort((a, b)-> a.nim.compareTo(b.nim));
        mahasiswa04 key = new mahasiswa04(nim, "", "");
        return java.util.Collections.binarySearch(mahasiswas, key, Comparator.comparing(m -> m.nim));
    }
    public void urutAscending(){
        mahasiswas.sort((a, b) -> a.nim.compareTo(b.nim));
    }
    public void urutDescending(){ 
        mahasiswas.sort((a, b) -> b.nim.compareTo(a.nim));
    }
    public static void main(String[] args) {
        listMahasiswa04 lm = new listMahasiswa04();
        mahasiswa04 m = new mahasiswa04("202601", "Noureen", "021xx1");
        mahasiswa04 m1 = new mahasiswa04("202602", "Akhleema", "021xx2");
        mahasiswa04 m2 = new mahasiswa04("202603", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);

        lm.tampil();

        lm.update(lm.binarySearch("202602"), new mahasiswa04("202602", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\nTampilkan dalam bentuk Ascending: ");
        lm.urutAscending();
        lm.tampil();

        System.out.println("\nTampilakn dalam bentuk Descending: ");
        lm.urutDescending();
        lm.tampil();
    }
}
