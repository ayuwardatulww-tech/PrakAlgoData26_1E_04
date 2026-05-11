package P11.Tugas04;

public class QueueLinked04 {
    nodeTugas04 front;
    nodeTugas04 rear;
    int size = 0;
    int max = 0;

    public QueueLinked04(int max) {
        this.max = max;
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }
    public boolean isFull() {
        return size == max;
    }
    public void enqueue(Mahasiswa04 data) {
        if (isFull()) {
            System.out.println("Antrin penuh!");
            return;
        }
        nodeTugas04 newNode = new nodeTugas04(data, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa dengan nama " + data.nama + " berhasil ditambahkan ke antrian.");
    }
    public Mahasiswa04 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa04 data = front.data;
        front = front.next;
        size--;
        System.out.println("Mahasiswa dengan nama " + data.nama + " berhasil dipanggil dari antrian.");
        return data;
    }
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa di depan antrian:");
            front.data.tampilkanData();
        }
    }
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa di belakang antrian:");
            rear.data.tampilkanData();
        }
    }
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } 
        nodeTugas04 tmp = front;

        System.out.println("\n=== DAFTAR ANTRIAN MAHASISWA ===");
        while (tmp != null) {
            tmp.data.tampilkanData();
            System.out.println("---------------------------------");
            tmp = tmp.next;
        }
    }
    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }
    public void clear(){
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

}
