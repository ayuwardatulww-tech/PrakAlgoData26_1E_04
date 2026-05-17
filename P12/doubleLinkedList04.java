package P12;

import java.util.Scanner;

public class doubleLinkedList04 {
    node04 head;
    node04 tail;

    public doubleLinkedList04() {
        this.head = null;
        this.tail = null;
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
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
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
}
