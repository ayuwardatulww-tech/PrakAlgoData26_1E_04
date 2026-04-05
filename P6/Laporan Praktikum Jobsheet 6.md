LAPORAN PRAKTIKUM JOBSHEET 6

Nama : Ayu Wardatul Widad

Kelas : TI - 1E

NIM : 254107020171

5.2 Praktikum 1

Hasil code 

Class sorting04

Class sortingMain04


Hasil run 

<img width="454" height="262" alt="Screenshot 2026-04-02 081537" src="https://github.com/user-attachments/assets/dfe3a84a-29a4-418d-8ec6-f6ae85a71689" />

Pertanyaan 

1. jelaskan fungsi kode program berikut

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan

4. Pada Insertion sort, apakah tujuan dari perintah

Jawaban 

1. Kode tersebut membandingkan dua elemen bersebelahan ( data[j-1] dan data[j] ). Jika urutannya salah / nilai sebelumnya lebih besar maka dilakukan swap menggunakan variable sementara / temp

2. Berikut kode pada selection sort yang mencari nilai min

int min = i;
            for (int j = i+1; j < jumData; j++) {
                if (data[j]<data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
            
3. Perulangan akan terus berjalan selama J>=0 indeks masih valid dan data[j] > temp nilai saat ini lebih besar dari nilai yang akan disisipkan, maksudnya selama elemen disebelah kiri lebih besar dari temp maka elemen tersebut akan terus digeser ke kanan

4. Menggeser nilai ke kanan satu posisi. Nilai indeks j disalin ke indeks j+1

5.3 Praktikum 2

Hasil kode 

class mahasiswa04

<img width="628" height="614" alt="image" src="https://github.com/user-attachments/assets/02ff303b-f585-4259-bc5a-8fe027ece1e6" />

class mahasiswaBerprestasi04

<img width="649" height="718" alt="image" src="https://github.com/user-attachments/assets/cbdf3fa2-9ae6-4f7b-a2a8-791a32c7178c" />

class mahasiswaDemo04

<img width="881" height="568" alt="image" src="https://github.com/user-attachments/assets/c0e3892f-16ca-448d-ab58-d12b5cac754b" />

Hasil run 

<img width="369" height="582" alt="image" src="https://github.com/user-attachments/assets/386159bf-5a19-4ade-a08f-c537687daa62" />

<img width="369" height="582" alt="image" src="https://github.com/user-attachments/assets/45385d9f-fbf2-4172-82df-5a88966b6b5d" />

Pertanyaan 

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

  a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
  
  b.Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
  
  c.Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

Jawaban 

1. 
