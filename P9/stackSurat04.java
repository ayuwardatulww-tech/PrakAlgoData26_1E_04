package P9;

public class stackSurat04 {
    surat04 [] stack;
    int top;
    int size;

    
    public stackSurat04(int size){
       this.size = size;
       this.stack = new surat04[this.size];
       this.top = -1;
    }
    public boolean isFull(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(surat04 srt){
        if (!isFull()) {
            stack[++top] = srt;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public surat04 pop(){
        if (!isEmpty()) {
            surat04 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }
    public surat04 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }
    public void cari(String nama){
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("=== Surat ditemukan === ");
                System.out.println("ID Surat       : " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa : " + stack[i].namaMahasiswa);    
                System.out.println("Kelas          : " + stack[i].kelas);
                System.out.println("Jenis Izin     : " + stack[i].jenisIzin);
                System.out.println("Durasi Izin    : " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
    
}
