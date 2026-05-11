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
    public void getData(int index){
        node04 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilkanData();
    }
    public int indexOf(String key){
        node04 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)  ) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        }else {
            return index;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail = null;
        }else {
            node04 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else {
            node04 tmp = head;
            while (tmp.next != null) {
                if ((tmp.data.nama.equalsIgnoreCase(key)) && (tmp == head)) {
                    this.removeFirst();
                    break;
                }else if (tmp.next.data.nama.equalsIgnoreCase(key)) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }
    public void removeAt(int index) {
       if (index == 0) {
            removeFirst();
        } else {
            node04 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}
