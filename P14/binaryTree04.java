package P14;

public class binaryTree04 {
    node04 root;

    public binaryTree04() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(mahasiswa04 mahasiswa){
        node04 newNode = new node04(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            node04 current = root;
            node04 parent;

            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find (double ipk){
        boolean result = false;
        node04 current = root;
        while (current != null){
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            }else {
                current = current.left;
            }
        }
        return result;
    }
    
    void traversePreOrder (node04 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traverseInOrder (node04 node){
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
            
        }
    }
    void traversePostOrder (node04 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }
    node04 getSuccessor(node04 del){
        node04 succesor = del.right;
        node04 successorParent = del;
        while (succesor.left != null){
            successorParent = succesor;
            succesor = succesor.left;
        }
        if (succesor != del.right) {
            successorParent.left = succesor.right;
            succesor.right = del.right;
        }
        return succesor;
    }
    void delete(double ipk){
        if(isEmpty()){
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        node04 parent = root;
        node04 current = root;
        boolean isLeftChild = false;
        while (current != null){
            if (current.mahasiswa.ipk == ipk){
                break;
            }else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }else {
            //jika tidak ada anak (leaf), maka node dihapus
            if(current.left == null && current.right == null){
                if (current == root) {
                root = null;
            }else{
                if (isLeftChild) {
                    parent.left = null;
                }else {
                    parent.right = null;
                }
            }
        }else if(current.left == null){ //jika hanya punya 1 anak (kanan)
            if (current == root){
                root = current.right;
            }else {
                if(isLeftChild){
                    parent.left = current.right;
                }else{
                    parent.right = current.right;
                }
            }
        }else if(current.right == null){ //jika hanya punya 1 anak (kiri)
            if (current == root){
                root = current.left;
            }else {
                if(isLeftChild){
                    parent.left = current.left;
                }else{
                    parent.right = current.left;
                }
            }
        }else {
            node04 successor = getSuccessor(current);
            System.out.println("Jika 2 anak, current = ");
            successor.mahasiswa.tampilInformasi();
            if (current == root) {
                root = successor;
            }else {
                if (isLeftChild) {
                    parent.left = successor;
                }else{
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
    }
    // Tugas 1: addRekursif()
public void addRekursif(mahasiswa04 mahasiswa) {
    if (isEmpty()) {
        root = new node04(mahasiswa);
    } else {
        addRekursifHelper(root, mahasiswa);
    }
}

void addRekursifHelper(node04 node, mahasiswa04 mahasiswa) {
    if (mahasiswa.ipk < node.mahasiswa.ipk) {
        if (node.left == null) {
            node.left = new node04(mahasiswa);
        } else {
            addRekursifHelper(node.left, mahasiswa);
        }
    } else {
        if (node.right == null) {
            node.right = new node04(mahasiswa);
        } else {
            addRekursifHelper(node.right, mahasiswa);
        }
    }
}

// Tugas 2a: cariMinIPK()
public void cariMinIPK() {
    if (isEmpty()) {
        System.out.println("Tree kosong!");
        return;
    }
    cariMinIPKHelper(root);
}

void cariMinIPKHelper(node04 node) {
    if (node.left == null) {
        System.out.println("IPK Minimum: ");
        node.mahasiswa.tampilInformasi();
    } else {
        cariMinIPKHelper(node.left);
    }
}

// Tugas 2b: cariMaxIPK()
public void cariMaxIPK() {
    if (isEmpty()) {
        System.out.println("Tree kosong!");
        return;
    }
    cariMaxIPKHelper(root);
}

void cariMaxIPKHelper(node04 node) {
    if (node.right == null) {
        System.out.println("IPK Maximum: ");
        node.mahasiswa.tampilInformasi();
    } else {
        cariMaxIPKHelper(node.right);
    }
}

// Tugas 3: tampilMahasiswaIPKdiAtas()
public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    if (isEmpty()) {
        System.out.println("Tree kosong!");
        return;
    }
    System.out.println("Data mahasiswa dengan IPK > " + ipkBatas + ":");
    tampilMahasiswaIPKdiAtasHelper(root, ipkBatas);
}

void tampilMahasiswaIPKdiAtasHelper(node04 node, double ipkBatas) {
    if (node == null) return;
    
    tampilMahasiswaIPKdiAtasHelper(node.left, ipkBatas);
    if (node.mahasiswa.ipk > ipkBatas) {
        node.mahasiswa.tampilInformasi();
    }
    tampilMahasiswaIPKdiAtasHelper(node.right, ipkBatas);
}
    
}