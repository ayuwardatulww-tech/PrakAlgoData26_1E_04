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
    bta.populetaData(dataMahasiswa, idxLast);
    System.out.println("In Order Traversal Mahasiswa:");
    bta.traverseInOrder(0);

     // Tugas 4: BinaryTreeArray
        System.out.println("\n\n========== BinaryTreeArray ==========");
        
        mahasiswa04[] dataMhs = new mahasiswa04[10];
        dataMhs[0] = new mahasiswa04("244160220", "Dewi", "B", 3.54);
        dataMhs[1] = new mahasiswa04("244160185", "Candra", "C", 3.21);
        dataMhs[2] = new mahasiswa04("244160121", "Ali", "A", 3.57);
        dataMhs[3] = new mahasiswa04("244160220", "Dewi", "B", 3.35);
        dataMhs[4] = new mahasiswa04("244160131", "Devi", "A", 3.48);
        dataMhs[5] = new mahasiswa04("244160205", "Ehsan", "D", 3.61);
        dataMhs[6] = new mahasiswa04("244160170", "Fizi", "B", 3.86);
        
        bta.populetaData(dataMhs, 6);
        
        System.out.println("\nData sebelum add (InOrder):");
        bta.traverseInOrder(0);
        
        System.out.println("\nMenambahkan data baru dengan IPK 3.75:");
        bta.add(new mahasiswa04("244160131", "Rara", "A", 3.75));
        
        System.out.println("\nData setelah add (InOrder):");
        bta.traverseInOrder(0);
        
        System.out.println("\nTraversal PreOrder:");
        bta.traversePreOrder(0);
    }
}
