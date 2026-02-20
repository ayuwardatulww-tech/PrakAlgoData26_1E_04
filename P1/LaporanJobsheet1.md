LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA JOBSHEET 1

Nama : Ayu Wardatul Widad

NIM  : 2541070171

Kelas : TI-1E

2.1 Pemilihan 

1. Pertanyaan

Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan di luar rentang tersebut maka akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya lakukan konversi nilai dengan ketentuan tabel seperti pada jobsheet lalu Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.

• input dari program berupa komponen nilai tugas, kuis, UTS, UAS
• Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan
• Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/ TIDAK LULUS

Jawaban 

Berikut hasil kode yang telah sesuai dengan pertanyaan 

<img width="773" height="885" alt="image" src="https://github.com/user-attachments/assets/bf13f06e-a486-4047-b120-50ccc327f829" />
<img width="766" height="721" alt="image" src="https://github.com/user-attachments/assets/31f5e08a-f8a5-41a6-84d3-92685d0bb90f" />

Dan berikut hasil run 

<img width="314" height="293" alt="image" src="https://github.com/user-attachments/assets/7e7fa4e7-799f-4e71-8b26-6d180e0278b0" />

2.2 Perulangan 

1. Pertanyaan
   
   Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n, dengan n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya
   a. Bilangan kelipatan 3 dicetak dengan simbol #
   b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
   c. Bilangan ganjil dicetak dengan simbol *
   d. Bilangan 10 dan 15 tidak dicetak
*bila n<10 maka tambahkan 10 (n+=10)
Contoh 1: Input NIM: 2541720102 maka n=12
Output: * 2 # 4 * # * 8 # * #
Contoh 2: Input NIM: 2541720120 maka n=20
Output: * 2 # 4 * # * 8 # * # * 14 16 * # * 20

Jawaban

Berikut hasil kode yang telah sesuai dengan pertanyaan

<img width="519" height="794" alt="image" src="https://github.com/user-attachments/assets/b2f92b79-3ef2-450f-82d6-b479790dc5a9" />

Dan berikut hasil run

<img width="256" height="60" alt="image" src="https://github.com/user-attachments/assets/1b991123-3cb1-4ecd-93e8-8356a73fa497" />

2.3 Array 

Pertanyaan

Buatlah program untuk menghitung IP Semester dari mata kuliah yang Anda tempuh semester lalu. Formula untuk menghitung IP semester sebagai yang tertera pada jobsheet lalu nilai setara didapatkan pada tabel yang sesuai dengan jobsheet dan Input dari program berupa nama mata kuliah, bobot SKS, serta nilai huruf dari mata kuliah tersebut

Jawaban

Berikut hasil kode yang telah sesuai dengan pertanyaan

<img width="1155" height="834" alt="image" src="https://github.com/user-attachments/assets/ca9e56bc-c5db-4f8f-9d45-fc879b736bce" />
<img width="569" height="647" alt="image" src="https://github.com/user-attachments/assets/cec9336a-1bdd-4a18-a583-a5fd89d8282f" />
<img width="1035" height="816" alt="image" src="https://github.com/user-attachments/assets/3426c566-4213-4b75-aff5-a7f6f4c685f3" />

Dan berikut hasil run

<img width="677" height="629" alt="image" src="https://github.com/user-attachments/assets/56bc97c8-4d90-45b1-9edb-9e5447384602" />

2.4 Fungsi

RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga-bunga yang dijual selalu dicatat dengan rincian seperti berikut ini:
Baris = Cabang Toko, Kolom = Stock bunga pada hari x
Rincian stock dari cabang per toko dan per bunga sesuai pada tabel di jobsheet
Rincian Harga Aglonema =75.000, Keladi = 50.000, Alocasia =60.000, Mawar =10.000.

1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual.
2. Tampilkan status dari setiap cabang dengan ketentuan sebagai berikut ini :
   
   a. Jika pendapatan cabang > Rp1.500.000, maka cabang tersebut mendapat status “Sangat Baik”
   b. Jika pendapatan ≤ Rp1.500.000, status “Perlu Evaluasi”.
   
Jawaban

Berikut hasil kode yang telah sesuai dengan pertanyaan 

<img width="700" height="891" alt="image" src="https://github.com/user-attachments/assets/a517af63-94c0-40d8-a6aa-e189511178f0" />

Berikut hasil run

<img width="604" height="232" alt="image" src="https://github.com/user-attachments/assets/847b8630-0dba-436d-b455-b06a5c69c93e" />

Tugas 1

Pertanyaan

Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. Ilustrasi tampilan array tersebut adalah sebagai yang tertera di jobsheet
Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan nama kota dari kode plat nomor tersebut.

Jawaban 

Berikut hasil kode 

<img width="553" height="864" alt="image" src="https://github.com/user-attachments/assets/b3d5e245-38e0-4df0-8720-2177b186b425" />

Berikut hasil run 

<img width="241" height="243" alt="image" src="https://github.com/user-attachments/assets/75358fde-16e9-4ddf-a33c-0dfe28d4c65a" />

Tugas 2 

Pertanyaan 

Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa. Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan

• Baris menyatakan jadwal ke-i
• Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, , Jam Kuliah. Contoh :
   jadwal[0][0] = "Pemrograman Dasar"
   jadwal[0][1] = "Lab Komputasi 1"
   jadwal[0][2] = "Senin"
   jadwal[0][3] = "08.00–10.00"
• Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna.
Buatkan fungsi untuk

   a. Menginput data jadwal kuliah ke dalam array 2 dimensi
   b. Menampilkan seluruh jadwal kuliah dalam bentuk tabel
   c. Menampilkan jadwal kuliah berdasarkan hari tertentu
   d. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu
   
Jawaban

Berikut hasil kode 

<img width="521" height="815" alt="image" src="https://github.com/user-attachments/assets/11022491-0f15-4c4a-ab66-0903712e8e7c" />
<img width="641" height="838" alt="image" src="https://github.com/user-attachments/assets/58c31f5d-95fe-457a-8ce8-d7a5c4cb92d1" />

Berikut hasil run

<img width="254" height="343" alt="image" src="https://github.com/user-attachments/assets/2fe0e99c-0844-4aa7-85e2-9133bbcd6ca8" />
<img width="711" height="253" alt="image" src="https://github.com/user-attachments/assets/44238cc7-852f-4a48-a56c-f1c8937fdcc3" />

