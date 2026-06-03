package P14;

public class binaryTreeArray04 {
    mahasiswa04[] dataMahasiswa;
    int idxLast;
    int capacity;

    public binaryTreeArray04() {
        this.dataMahasiswa = new mahasiswa04[10];
        
    }
    void populataData(mahasiswa04 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
           if (dataMahasiswa[idxStart] != null) {
            traverseInOrder(2*idxStart+1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2*idxStart+2);
           }
        }
    }
    
}
