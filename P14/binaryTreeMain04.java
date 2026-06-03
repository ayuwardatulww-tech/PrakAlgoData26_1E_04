package P14;

public class binaryTreeMain04 {
    public static void main(String[] args) {
        binaryTree04 bst = new binaryTree04();

        bst.add(new mahasiswa04("244160121", "Ali", "A", 3.57));
        bst.add(new mahasiswa04("244160221", "Badar", "B", 3.85));
        bst.add(new mahasiswa04("244160185", "Candra", "C", 3.21));
        bst.add(new mahasiswa04("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        String hasilcari = bst.find(3.54)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilcari);

        System.out.print("Cari mahasiswa dengan IPK 3.22: ");
        hasilcari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilcari);

        bst.add(new mahasiswa04("244160131", "Devi", "A", 3.72));
        bst.add(new mahasiswa04("244160205", "Ehsan", "D", 3.37));
        bst.add(new mahasiswa04("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa");
        System.out.println("\nOrder Traversal: ");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPre Order Traversal: ");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPost Order Traversal: ");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa");
        bst.traverseInOrder(bst.root);

         // Tugas 1: addRekursif
        System.out.println("\n\n========== addRekursif ==========");
        binaryTree04 bstRekursif = new binaryTree04();
        System.out.println("Menambahkan data dengan addRekursif:");
        bstRekursif.addRekursif(new mahasiswa04("244160121", "Ali", "A", 3.57));
        bstRekursif.addRekursif(new mahasiswa04("244160185", "Candra", "C", 3.21));
        bstRekursif.addRekursif(new mahasiswa04("244160220", "Dewi", "B", 3.54));
        bstRekursif.addRekursif(new mahasiswa04("244160131", "Devi", "A", 3.72));
        
        System.out.println("\nHasil InOrder (terurut IPK kecil ke besar):");
        bstRekursif.traverseInOrder(bstRekursif.root);

        // Tugas 2a: cariMinIPK
        System.out.println("\n\n========== IPK Minimum ==========");
        bstRekursif.cariMinIPK();

        // Tugas 2b: cariMaxIPK
        System.out.println("\n========== IPK Maximum ==========");
        bstRekursif.cariMaxIPK();

        // Tugas 3: tampilMahasiswaIPKdiAtas
        System.out.println("\n========== Mahasiswa dengan IPK di Atas 3.50 ==========");
        bstRekursif.tampilMahasiswaIPKdiAtas(3.50);

       
    }   

}
