package P14;

public class binaryTreeArrayMain04 {
    public static void main(String[] args) {
    binaryTreeArray04 bta = new binaryTreeArray04();
    mahasiswa04 mhs1 = new mahasiswa04("210001", "Ali", "A", 3.5);
    mahasiswa04 mhs2 = new mahasiswa04("210002", "Candra", "B", 3.2);
    mahasiswa04 mhs3 = new mahasiswa04("210003", "Badar", "A", 3.8);
    mahasiswa04 mhs4 = new mahasiswa04("210004", "Dewi", "C", 3.0);

    mahasiswa04 mhs5 = new mahasiswa04("210005", "Devi", "B", 3.6);
    mahasiswa04 mhs6 = new mahasiswa04("210006", "Ehsan", "A", 3.9);
    mahasiswa04 mhs7 = new mahasiswa04("210007", "Fizi", "C", 3.1);

    mahasiswa04[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
    int idxLast = 6;
    bta.populataData(dataMahasiswa, idxLast);
    System.out.println("In Order Traversal Mahasiswa:");
    bta.traverseInOrder(0);
    }
}
