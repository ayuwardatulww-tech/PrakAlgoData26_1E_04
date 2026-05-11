package P11;

public class singleLinkedList04 {
    node04 head;
    node04 tail;

    boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            node04 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilkanData();
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(mahasiswa04 input) {
       node04 ndInput = new node04(input, null);
       if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
       }else {
            ndInput.next = head;
            head = ndInput;
       }
    }
    public void addLast(mahasiswa04 input) {
        node04 ndInput = new node04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, mahasiswa04 input) {
        node04 ndInput = new node04(input, null);
        node04 tmp = head;
        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }
    public void insertAt(int index, mahasiswa04 input){
        if (index < 0) {
            System.out.println("Indeks Salah");
        }else if (index == 0) {
            addFirst(input);
        }else {
            node04 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new node04(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }
}
