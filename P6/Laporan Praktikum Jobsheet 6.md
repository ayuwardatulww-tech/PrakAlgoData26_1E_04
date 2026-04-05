**LAPORAN PRAKTIKUM JOBSHEET 6**
Nama : Ayu Wardatul Widad

Kelas : TI - 1E

NIM : 254107020171

**5.2 PRAKTIKUM 1**

**Hasil code **

Class sorting04

Class sortingMain04


**Hasil run **

<img width="454" height="262" alt="Screenshot 2026-04-02 081537" src="https://github.com/user-attachments/assets/dfe3a84a-29a4-418d-8ec6-f6ae85a71689" />

**Pertanyaan **

1. jelaskan fungsi kode program berikut

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan

4. Pada Insertion sort, apakah tujuan dari perintah

**Jawaban **

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

**5.3 PRAKTIKUM 2**

**Hasil kode **

class mahasiswa04

<img width="628" height="614" alt="image" src="https://github.com/user-attachments/assets/02ff303b-f585-4259-bc5a-8fe027ece1e6" />

class mahasiswaBerprestasi04

<img width="649" height="718" alt="image" src="https://github.com/user-attachments/assets/cbdf3fa2-9ae6-4f7b-a2a8-791a32c7178c" />

class mahasiswaDemo04

<img width="881" height="568" alt="image" src="https://github.com/user-attachments/assets/c0e3892f-16ca-448d-ab58-d12b5cac754b" />

Hasil run 

<img width="369" height="582" alt="image" src="https://github.com/user-attachments/assets/386159bf-5a19-4ade-a08f-c537687daa62" />

<img width="369" height="582" alt="image" src="https://github.com/user-attachments/assets/45385d9f-fbf2-4172-82df-5a88966b6b5d" />

**Pertanyaan** 

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

  a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
  
  b.Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
  
  c.Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

**Jawaban **

1. a. Karena bubble sort butuh maksimal n-1 iterasi, jadi i < length - 1 agar semua data terurut

   b. Karena setiap iterasi, elemen terbesar sudah diakhir jadi j < length - i supaya tidak membandingkan ulang

   c. jika data 50 maka perulangan i sebanyaak 49x dan tahap bubble sort sebanyak 49x

2. Hasil kode modifikasi, modifikasi pada class MahasiswaDemo04
   
   <img width="752" height="779" alt="image" src="https://github.com/user-attachments/assets/550ab2c8-a977-47a1-afae-bb64df38c210" />

   Hasil run modifikasi

   Data input dari keyboard

   <img width="336" height="435" alt="image" src="https://github.com/user-attachments/assets/3de0d80a-1a62-4240-8242-7a09483a3c13" />

   Data sebelum sorting

<img width="310" height="358" alt="image" src="https://github.com/user-attachments/assets/cd2a0097-d3c6-431a-9b41-4b99da855b89" />

   Data setelah sorting

   <img width="522" height="354" alt="image" src="https://github.com/user-attachments/assets/52e66b19-523e-4861-8785-e56723455ffe" />

**5.3 MENGURUTKAN DATA BERDASARKAN SELECTION SORT**

**Hasil kode** 

class mahasiswaBerprestasi 04

<img width="511" height="270" alt="image" src="https://github.com/user-attachments/assets/e7b219ff-533c-4728-8cab-2ddaea66626f" />

class mahasiswaDemo04

<img width="714" height="89" alt="image" src="https://github.com/user-attachments/assets/9e25c92e-bcc6-47c8-933b-d84fc37973d9" />


**Hasil run** 

<img width="319" height="367" alt="image" src="https://github.com/user-attachments/assets/aa92c94a-4084-4912-b0c6-c2a817d32eda" />

<img width="485" height="295" alt="image" src="https://github.com/user-attachments/assets/c6465231-7d6b-4408-a949-929753a3c455" />

**Pertanyaan**

Di dalam method selection sort, terdapat baris program seperti di bawah ini: Untuk apakah proses tersebut, jelaskan!

**Jawaban **

kode ini digunakan untuk menemukan posisi nilai IPK paling kecil yang nanti akan ditukar ke posisi depan pada proses selection sort

**5.4 PRAKTIKUM 3**

**hasil kode** 

class mahasiswaBerprestasi 

<img width="466" height="198" alt="image" src="https://github.com/user-attachments/assets/53d98ff4-9b13-4304-b790-fd43138543f3" />

class mahasiswaDemo04

<img width="694" height="84" alt="image" src="https://github.com/user-attachments/assets/5b4a0930-febe-4cac-a8f8-65163f23be35" />

**hasil run** 

<img width="326" height="360" alt="image" src="https://github.com/user-attachments/assets/f45805ba-0e65-486f-a6e2-2bc215fa912f" />

<img width="492" height="301" alt="image" src="https://github.com/user-attachments/assets/c7803e50-023d-45eb-9321-cac82caa2b8a" />

**Pertanyaan** 

Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.

**Jawaban** 

Hasil modifikasi class mahasiswaBerprestasi 

<img width="460" height="196" alt="image" src="https://github.com/user-attachments/assets/d5691e3a-7df4-4cf2-9f6b-960b719d4b45" />

Hasil run 

<img width="306" height="366" alt="image" src="https://github.com/user-attachments/assets/444efe63-9016-40e0-a8c1-2e582d1ac18a" />

<img width="517" height="297" alt="image" src="https://github.com/user-attachments/assets/c6b055ae-c298-41c1-bb74-b185e1382902" />

**5.5 LATIHAN PRAKTIKUM **

**Hasil kode pemograman** 

class dosen04

<img width="656" height="329" alt="image" src="https://github.com/user-attachments/assets/277f7d02-76cf-4f1d-8da8-4dacf30f4d74" />


class dataDosen04

<img width="475" height="414" alt="image" src="https://github.com/user-attachments/assets/05c1b1f7-6e40-4f1d-b8a1-4d11c4b539f4" />

<img width="451" height="447" alt="image" src="https://github.com/user-attachments/assets/8d7664fe-28f5-463a-bd3a-93a67d023613" />


class dosenDemo04

<img width="532" height="779" alt="image" src="https://github.com/user-attachments/assets/700a1285-aeaf-4063-9e1b-3e0396b3061d" />


**hasil run**

input data dosen 

<img width="390" height="566" alt="image" src="https://github.com/user-attachments/assets/2072c41a-0892-41f2-8dc2-566f93ee3b88" />

sebelum sorting

<img width="301" height="463" alt="image" src="https://github.com/user-attachments/assets/d1ba5a5f-40c2-4b70-a2bd-4bb103e08900" />

hasil sorting ASC

<img width="339" height="454" alt="image" src="https://github.com/user-attachments/assets/5cd3421a-0086-450b-a69d-1cda2bbe2597" />

hasil sorting DSC

<img width="351" height="475" alt="image" src="https://github.com/user-attachments/assets/4a06617b-fc67-4f7e-bec9-1c24cdb83fa5" />
