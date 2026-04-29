package P10;

public class antriLayanan4 {
    mahasiswa4[] data;
    int front;
    int rear;           
    int size;
    int max;
     
    public antriLayanan4(int max){
        this.max = max;
        this.data = new mahasiswa4[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }
     public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void tambahAntrian(mahasiswa4 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian");
    }
    public mahasiswa4 layaniMahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        mahasiswa4 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public void lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
        
    }
    public void lihatAkhir(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
