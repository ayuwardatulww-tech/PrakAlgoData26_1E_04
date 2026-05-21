package CM2;

public class pembeli04 {
    int noAntrian;
    String namaPembeli, noHP;

    static int counter = 0;

    pembeli04(String namaPembeli, String noHP){
        this.noAntrian = ++counter;
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
    }
    public void tampilPembeli(){
        System.out.println("No Antrian: " + noAntrian + " \t Nama Pembeli: " + namaPembeli + " \t No HP: " + noHP);
    }
    
}
