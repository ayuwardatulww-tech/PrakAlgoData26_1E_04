**LAPORAN PRAKTIKUM JOBSHEET 6**

Nama : Ayu Wardatul Widad

Kelas : TI - 1E

NIM : 254102070171

6.2 Praktikum 1

Hasil kode 

Class mahasiswaBerprestasi 

<img width="767" height="624" alt="image" src="https://github.com/user-attachments/assets/403998b1-736a-4e74-95ca-c37641bbb769" />

Class mahasiswa demo

<img width="594" height="285" alt="image" src="https://github.com/user-attachments/assets/11de03f3-605a-426c-83a1-d0e24a7d064c" />

Pertanyaan 

1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class
MahasiswaBerprestasi!

2. Jelaskan fungsi break pada kode program di bawah ini!

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang
dibuat di atas akan menampilkan data ke berapa? Jelaskan.

5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari
kode di atas?

Jawaban 

1. Method tampilPosisi() digunakan untuk menampilkan informasi apakah data ditemukan atau tidak beserta posisi (indeks) data tersebut dalam array

Method tamoilDataSearch() digunakan untuk menampilkan detail lengkap data mahasiswa ditemukan, seperti NIM, nama, kelas dan ipk

 2. Berfungsi untuk menghentikan perulangan ketika data yang dicari sudah ditemukan, sehingga proses pencarian menjadi lebih cepat dan efisien

 3. Variable pos berfungsi sebagai penunjuk posisi (indeks) data hasil pencarian dalam array. Nilai pos digunakan untuk menentukan apakah data ditemukan serta untuk mengakses dan menampilkan data mahasiswa yang sesuai

 4. Jika terdapat lebih dari satu data dengan nilai yang sama, maka yang akan ditampilkan adalah data pertama yang ditemukan (indeks paling kecil), karena setelah data ditemukan perulangan langsung diberhentikan oleh break, sehingga data berikutnya tidak diperiksa

 5. Program akan terus mencari meskipun sudah menemukan data dan nilai posisi akan terus diperbarui jika ditemukan data yang sama

6.3 Praktikum 2

Hasil kode

class mahasiswaBerprestasi 

<img width="504" height="329" alt="image" src="https://github.com/user-attachments/assets/3744d908-e271-4efd-b97a-7c65f8a906cf" />

class mahasiswademo

<img width="592" height="196" alt="image" src="https://github.com/user-attachments/assets/d1eaf1d5-cfd4-42bc-8901-55ac3644562d" />

Hasil run

<img width="460" height="698" alt="image" src="https://github.com/user-attachments/assets/1dde1d99-07a2-4b25-900e-11f57cf991a5" />

Pertanyaan 

1. Tunjukkan pada kode program yang mana proses divide dijalankan!

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

3. Apa fungsi left, right, dan mid?

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array.

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.

Jawaban 

1. Proses divide terdapat pada bagian : mid = (left + right)/2; berfungsi untuk membagi array menjadi dua bagian kiri dan kanan

2. Proses conquer terdapat pada bagian :

if (cari == listMhs[mid].ipk04) {
                return(mid);

   Karena pada bagian ini program mengecek apakah data yang dicari sudah ditemukan

3. left : batas kiri / awal indeks pencarian, right : batas kanan / akhir indeks pencarian dan mid : indeks tengah yang digunakan untuk membandingkan data

4. Program tidak akan berjalan dengan benar jika data tidak urut, karena binary search membutuhkan data yang sudah terurut. Jika tidak hasil pencarian bisa salah atau data tidak ditemukan

5. Jika data diurutkan dari terbesar ke terkecil / descending maka hasil binary search tidak sesuai karena algoritma di atas dibuat untuk data ascending

solusi modifikasi

pada class mahasiswaBerprestasi berikut yg dirubah

<img width="432" height="191" alt="image" src="https://github.com/user-attachments/assets/07f72259-46ac-497e-a410-b5f2cbe86d07" />

dan pada class demo menambahkan bubbleSort

<img width="535" height="56" alt="image" src="https://github.com/user-attachments/assets/83d00a52-900c-4d91-856c-a9a8802fcd54" />

6. Data dianggap tidak ditemuka ketika kondisi <img width="189" height="39" alt="image" src="https://github.com/user-attachments/assets/def8b251-d955-4ddb-ac67-c06c3598c90e" /> terpenuhi, sehingga fungsi mengembalikan nilai -1 ini berarti seluruh data sudah di cek tetapi tidak ada yang sesuai

7. Hasil modifikasi

   <img width="546" height="238" alt="image" src="https://github.com/user-attachments/assets/a7f914d0-0050-4163-807e-59bbe140e29f" />


