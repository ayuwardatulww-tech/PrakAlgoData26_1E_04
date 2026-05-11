package P11;

public class SLLMain04 {
    public static void main(String[] args) {
        singleLinkedList04 sll = new singleLinkedList04();

        mahasiswa04 mhs1 = new mahasiswa04("Eki", "21212203", "4D", 3.6);
        mahasiswa04 mhs2 = new mahasiswa04("Warda", "22212202", "3C", 3.5);
        mahasiswa04 mhs3 = new mahasiswa04("Issom", "23212201", "2B", 3.8);
        mahasiswa04 mhs4 = new mahasiswa04("Ayu", "24212200", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Eki", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
