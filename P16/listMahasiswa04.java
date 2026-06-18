package P16;

import java.util.ArrayList;
import java.util.Arrays;
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
    int linierSearch(String nim){
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        listMahasiswa04 lm = new listMahasiswa04();
        mahasiswa04 m = new mahasiswa04("202601", "Noureen", "021xx1");
        mahasiswa04 m1 = new mahasiswa04("202602", "Akhleema", "021xx2");
        mahasiswa04 m2 = new mahasiswa04("202603", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);

        lm.tampil();

        lm.update(lm.linierSearch("202602"), new mahasiswa04("202602", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
