package P12;

import java.util.Scanner;

public class doubleLinkedList04 {
    node04 head;
    node04 tail;
    int size;

    public doubleLinkedList04() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(mahasiswa04 data) {
        node04 newNode = new node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(mahasiswa04 data) {
        node04 newNode = new node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void inserAfter(String keyNim, mahasiswa04 data){
        node04 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
        } 
        node04 newNode = new node04(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        node04 current = head;
        while (current != null) {
            current.data.tampilkan();
            current = current.next;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (head == tail) {
            System.out.println("Data berhasil dihapus");
            head.data.tampilkan();
            head = tail = null;
        }else {
            System.out.println("Data berhasil dihapus");
            head.data.tampilkan();
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (head == tail) {
            System.out.println("Data berhasil dihapus");
            tail.data.tampilkan();
            head = tail = null;
        } else {
            System.out.println("Data berhasil dihapus");
            tail.data.tampilkan();
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    public mahasiswa04 inputMahasiswa(Scanner ayu) {
        System.out.print("Masukkan NIM: ");
        String nim = ayu.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = ayu.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = ayu.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = ayu.nextDouble();
        ayu.nextLine(); 
        return new mahasiswa04(nim, nama, kelas, ipk);
    }
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        System.out.println("=== Data Terbalik ===");
        node04 current = tail;
        while (current != null) {
            current.data.tampilkan();
            current = current.prev;
        }
    }
    public void add(int index, mahasiswa04 data){
     if (index < 0) {
        System.out.println("Index tidak valid!");
        return;
     }   
     if (index == 0) {
        addFirst(data);
        return;
     }
     node04 current = head;
     int i = 0;
     while (current != null && i < index - 1) {
        current = current.next;
        i++;
     }
     if (current == null) {
        System.out.println("Index melebihi ukuran linked list!");
        return;
     }
     if (current == tail) {
        addLast(data);
        return;
     }
     node04 newNode = new node04(data);
     newNode.next = current.next;
     newNode.prev = current;
     current.next.prev = newNode;
     current.next = newNode;
     size++;
     System.out.println("Data berhasil ditambahkan pada index " + index);
    }
    public void removeAfter(String keyNim) {
        node04 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM "+ keyNim);
            return;
        }
        node04 toDelete = current.next;
        System.out.println("Data berhasil dihapus setelah NIM " + keyNim + ": ");
        toDelete.data.tampilkan();
        if (toDelete == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
    }
    public void remove(int indexx){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (indexx < 0) {
            System.out.println("Index tidak valid!");
            return;
        }
        node04 current = head;
        int i = 0; 
        while (current != null && i < indexx) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index melebihi ukuran linked list!");
            return;
        }
        System.out.println("Data berhasil dihapus pada index " + indexx + ": ");
        current.data.tampilkan();
        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = current.next;
            head.prev = null;
        } else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }else {
            System.out.println("Data pertama: ");
            head.data.tampilkan();
        }
    }
    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }else {
            System.out.println("Data terakhir: ");
            tail.data.tampilkan();
        }
    }
    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        }
        node04 current = head;
        int i = 0; 
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index melebihi ukuran linked list!");
            return;
        }
        System.out.println("Data pada index " + index + ": ");
        current.data.tampilkan();
    }
    public void getSize(){
        System.out.println("Jumlah data: "+ size);
    }
}

