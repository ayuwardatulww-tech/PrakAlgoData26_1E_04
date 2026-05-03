package P10;

public class layananKRS04 {
    mahasiswa4[] data;
    int front;
    int rear;           
    int size;
    int max;
    int jmlProses;

    public layananKRS04(int n){
        this.max = n;
        this.data = new mahasiswa4[max];
        this.size = 0;
        this.front = rear = -1;
        this.jmlProses = 0;
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
        if (IsEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian");
    }
    public void layani2mahasiswa(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
        }else if (jmlProses >= 30) {
            System.out.println("Kuota DPA sudah penuh");
        }else {
            System.out.println("Memproses 2 mahasiswa: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < 2; i++) {
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                jmlProses++;
            }
        }
    }
    public void lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
        }else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
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
    public void getJumlahAntrian() {
        System.out.println("Jumlah antrian: "+size);
    }
    public void jumlahSudahProses(){
        System.out.println("Jumlah sudah proses KRS: " + jmlProses);
    }
    public void jumlahBelumProses(){
        System.out.println("Jumlah belum proses KRS: "+ (30 - jmlProses));
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
