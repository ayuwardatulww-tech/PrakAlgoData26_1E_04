package P9;

public class stackTugasMahasiswa04 {
    MAHASISWA04 [] stack;
    int top;
    int size;
    public stackTugasMahasiswa04(int size){
        this.size = size;
        stack = new MAHASISWA04[size];
        top = -1;
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
    public void push(MAHASISWA04 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi");
        }
    }
    public MAHASISWA04 pop(){
        if (!isEmpty()) {
            MAHASISWA04 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }
    public MAHASISWA04 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public MAHASISWA04 peekBottom(){
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
}
