package CM2;

import java.util.Scanner;

public class doubleLinkedListPesanan04 {
    nodePesanan04 head;
    nodePesanan04 tail;
    int size =0;

    doubleLinkedListPesanan04() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(pesanan04 pesanan) {
        nodePesanan04 newNode = new nodePesanan04(pesanan);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(pesanan04 pesanan) {
        nodePesanan04 newNode = new nodePesanan04(pesanan);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void bubbleSortByNamaPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            nodePesanan04 current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareTo(current.next.pesanan.namaPesanan) > 0) {
                    pesanan04 tempPesanan = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = tempPesanan;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    public void printLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        bubbleSortByNamaPesanan();

        System.out.println("================================================");
        System.out.println("LAPORAN PESANAN SESUAI URUTAN NAMA PESANAN");
        System.out.println("================================================");
        System.out.println("Kode\tNama Pesanan\tHarga\tPembeli");

        int total = 0;
        nodePesanan04 current = head;
        while (current != null) {
            current.pesanan.tampilPesanan();
            total += current.pesanan.harga;;
            current = current.next;
        }
        System.out.println("================================================");
        System.out.println("Total Pendapatan: " + total);
    }
    public pesanan04 inputPesanan(Scanner ayu, pembeli04 pembeli) {
        System.out.print("Kode pesanan: ");
        int kodePesanan = ayu.nextInt();
        ayu.nextLine(); 
        System.out.print("Nama pesanan: ");
        String namaPesanan = ayu.nextLine();
        System.out.print("Harga pesanan: ");
        int harga = ayu.nextInt();
        ayu.nextLine(); 

        pesanan04 newPesanan = new pesanan04(kodePesanan, namaPesanan, harga);
        addLast(newPesanan);
        return newPesanan;
    }
}
