package CM2;

public class pesanan04 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    pesanan04(int kodePesanan, String namaPesanan, int harga){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
    public void tampilPesanan(){
        System.out.println(kodePesanan + " \t " + namaPesanan + " \t " + harga);
    }
    
}
