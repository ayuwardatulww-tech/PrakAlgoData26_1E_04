package P6;

public class dataDosen04 {
    dosen04 [] dataDosen = new dosen04[10];
    int idx;

     void tambah (dosen04 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil (){
        if (idx == 0) {
            System.out.println("Data kosong!");
        }else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }
    //ASC termuda ke tertua menggunakan bubble sort
    void sortingASC (){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    dosen04 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    //DSC tertua ke termuda menggunakan selestion sort
    void sortingDSC (){
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            dosen04 temp = dataDosen[i];
            dataDosen[i] = dataDosen[max];
            dataDosen[max] = temp;
        }
    }
}
