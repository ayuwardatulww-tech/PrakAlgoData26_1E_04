package CM2;

import java.util.Scanner;

public class doubleLinkedListPembeli04 {
    nodePembeli04 head;
    nodePembeli04 tail;
    int size =0;

    public doubleLinkedListPembeli04() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(pembeli04 pembeli) {
        nodePembeli04 newNode = new nodePembeli04(pembeli);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(pembeli04 pembeli) {
        nodePembeli04 newNode = new nodePembeli04(pembeli);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }   
    public pembeli04 removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        pembeli04 pembeli = head.pembeli;
        System.out.println("Pembeli " + pembeli.namaPembeli + " dengan No HP " + pembeli.noHP + " telah dilayani.");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return pembeli;
    }
    public pembeli04 removeLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        pembeli04 pembeli = tail.pembeli;
        System.out.println("Pembeli " + pembeli.namaPembeli + " dengan No HP " + pembeli.noHP + " telah dilayani.");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return pembeli;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        nodePembeli04 current = head;
        while (current != null) {
            current.pembeli.tampilPembeli();
            current = current.next;
        }
    }
    public int getSize() {
        return size;
    }
    public pembeli04 inputPembeli(Scanner ayu){
        System.out.print("Nama pembeli: ");
        String nama = ayu.nextLine();
        System.out.print("Nomor HP pembeli: ");
        String noHP = ayu.nextLine();

        pembeli04 baru = new pembeli04(nama, noHP);
        addLast(baru);
        return baru;
    }
    public pembeli04 removeByNoAntrian(int noAntrian) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        nodePembeli04 current = head;
        while (current != null) {
            if (current.pembeli.noAntrian == noAntrian) {
                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return current.pembeli;
            }
            current = current.next;
        }
        System.out.println("No Antrian " + noAntrian + " tidak ditemukan.");
        return null;
    }
}
