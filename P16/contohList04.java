package P16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class contohList04 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(); // modifikasi
        l.add("Udang Keju");
        l.add("Lumpia Udang");
        l.add("Burger");
        l.add("Cireng");

        // mengganti %d pertama dan terakhir menjadi %s 
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
                l.get(0), l.size(), l.get(l.size() - 1));

        l.add("Jigor"); //modifikasi 
        l.remove(0);
        // ini juga sama mengganti %d pertama dan terakhir menjadi %s
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
                l.get(0), l.size(), l.get(l.size() - 1));

        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shanum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
                names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My Kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
                names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
    }
}
