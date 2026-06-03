package P14;

public class node04 {
    mahasiswa04 mahasiswa;
    node04 left;
    node04 right;

    public node04() {
    }
    
    public node04(mahasiswa04 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}
