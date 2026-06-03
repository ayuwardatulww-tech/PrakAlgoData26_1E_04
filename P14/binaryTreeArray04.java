package P14;

public class binaryTreeArray04 {
    mahasiswa04[] dataMahasiswa;
    int idxLast;
    int idxStart;
    int capacity;

    public binaryTreeArray04() {
        this.dataMahasiswa = new mahasiswa04[15];
        this.idxLast = -1;
        this.idxStart = 0;
        this.capacity = 15;
    }
    void populetaData(mahasiswa04 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    void traverseInOrder(){
        if (idxStart <= idxLast) {
           if (dataMahasiswa[idxStart] != null) {
            traverseInOrder(2*idxStart+1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2*idxStart+2);
           }
        }
    }
    // Tugas 4a: add()
public void add(mahasiswa04 data) {
    if (idxLast < dataMahasiswa.length - 1) {
        int idxInsert = findPositionToInsert(0, data.ipk);
        if (idxInsert > idxLast + 1 || idxInsert >= dataMahasiswa.length) {
            dataMahasiswa[idxLast + 1] = data;
        }else {
            for (int i = idxLast; i >= idxInsert; i--) {
                dataMahasiswa[i + 1] = dataMahasiswa[i];
            }
            dataMahasiswa[idxInsert] = data;
            idxLast++;
        }
    } else {
        System.out.println("Array penuh!");
    }
}

int findPositionToInsert(int idxStart, double ipk) { 
    if (idxStart > idxLast || idxStart >= dataMahasiswa.length) {
        return idxStart + 1;
    }
    if (dataMahasiswa[idxStart] == null) {
        return idxStart;
    }
    if (ipk < dataMahasiswa[idxStart].ipk) {
        int leftChild = 2 * idxStart + 1;
        if (leftChild <= idxLast && leftChild < dataMahasiswa.length && dataMahasiswa[leftChild] != null) {
            return findPositionToInsert(leftChild, ipk);
        } else {
            return idxLast + 1;
        }
    } else {
        int rightChild = 2 * idxStart + 2;
        if (rightChild <= idxLast && rightChild < dataMahasiswa.length && dataMahasiswa[rightChild] != null) {
            return findPositionToInsert(rightChild, ipk);
        } else {
            return idxLast + 1;
        }
    }
}

// Tugas 4b: traversePreOrder()
public void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
        if (dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}

public void traverseInOrder(int idxStart) {
    if (idxStart <= idxLast) {
        if (dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
}
