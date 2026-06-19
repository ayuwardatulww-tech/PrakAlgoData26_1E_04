## LAPORAN PRAKTIKUM JOBSHEET 16

Nama : Ayu Wardatul Widad

NIM : 254107020171

Kelas : TI - 1E

**PERCOBAAN 1**

Hasil kode

<img width="375" height="382" alt="image" src="https://github.com/user-attachments/assets/9d29f26a-c776-4438-9fd0-c99474b9d773" />

Hasil run

<img width="249" height="56" alt="image" src="https://github.com/user-attachments/assets/e359dff6-91b0-483e-8115-52ca0b2cf981" />

**PERTANYAAN**
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah
Arraylist?

Jawab : karena arrayList dideklarasikan menggunakan Raw Type (tanpa Generics <>), secara otomatis java
akan menganggap sebagai arrayList<Object>. Karena object adalah induk dari segala jenis data di java maka semua
tipe data bisa masuk ke dalamnya

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe
tertentu!

Jawab : 

Hasil kode modifikasi

<img width="335" height="154" alt="image" src="https://github.com/user-attachments/assets/ccd1d8f3-8e7e-4dcc-abcc-fac38baa3b84" />

hasil run

<img width="265" height="50" alt="image" src="https://github.com/user-attachments/assets/d1e814cd-f5dc-4fba-85b4-99771aab0cda" />

3. Ubah kode pada baris kode 38 menjadi seperti ini

Jawab : <img width="200" height="16" alt="image" src="https://github.com/user-attachments/assets/53808537-fc26-4b44-b89d-de27a178bfc8" />

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya

Jawab : <img width="337" height="45" alt="image" src="https://github.com/user-attachments/assets/ddbf9227-8969-4479-98f3-4eaf95449d86" />

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!

Jawab : hasil penambahan kode

<img width="265" height="71" alt="image" src="https://github.com/user-attachments/assets/441c09e4-d4af-46e9-b1f2-6091d4aa7c7f" />

penjelasan singkat : perubahan utama terjadi pada penggunaan fungsi names.push("Mei-mei") pada objek LinkedList
- mekanisme push() : fungsi ini menerapkan konsep Stack(LIFO) yang berarti elemen baru akan dimasukkan diposisi
                      paling awal (indeks 0) atau bertindak sebagai head
- dampak nya : Mei-mei menyebabkan elemen My kid mundur pada indeks 1 dan total elemen di dalam berubah menjadi 6


**PERCOBAAN 2**

hasil kode program

<img width="293" height="398" alt="image" src="https://github.com/user-attachments/assets/c68b5950-8caf-4bcf-8e96-b6b9cb14b3a6" />

hasil run

<img width="178" height="59" alt="image" src="https://github.com/user-attachments/assets/a7142fa0-2cf5-435d-8234-7cabbeb4d804" />

**PERTANYAAN**

1. Apakah perbedaan fungsi push() dan add() pada objek fruits?

Jawab : 
- push() = untuk memasukkan elemen ke posisi paling atas/terakhir sesuai prinsip LIFO, fungsi ini mengembalikan nilai elemen yang dimasukkan
- add() = fungsi warisan dari interface, secara fungsional sama sama menaruh elemen diposisi terakhir, namun fungsi ini mengembalikan nilai boolean sebagai indikator suksesnya operasi

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?

Jawab : yang terjadi adalah tiga perulangan dibawahnya tidak akan menampilkan atau mengecek buah apa pun ke layar alias kosong karena objek fruits telah dikuras habis menggunakan fungsi fruits.pop() didalam perulangan while (!fruits,empty()), jika baris tersebut dihapus, stack tersebut tetap dalam kondisi kosong saat perulangan berikutnya berjalan

3. Jelaskan fungsi dari baris 46-49?

Jawab : untuk menampilkan seluruh elemen yang tersisa di dalam stack secara berurutan menggunakan objek iterator. Loop ini akan terus berjalan maju memeriksa elemen selanjutnya selama metode it.hasNext() bernilai true

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi?
Mengapa bisa demikian?

Jawab : 
<img width="268" height="224" alt="image" src="https://github.com/user-attachments/assets/47f5a28b-710f-47c0-af6a-792e0d523654" />

program mengalami compile error karena list tidak memiliki metode bawaan .push(), .empty(), dan .pop()

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!

Jawab : 
<img width="227" height="53" alt="image" src="https://github.com/user-attachments/assets/917bf47b-c8be-4d61-a8a8-21613d339433" />

"duren" dimasukkan paling terakhir (menjadi elemen teratas di dalam stack) dengan menaruh perintah set teoat setelahnya, posisi "durem" akan langsung tergantikan oleh "Strawberry" sebelum data tersebut mulai dicetak oleh perulangan dibawahnya

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

Jawab : 

hasil kode penambahan 3 item

<img width="254" height="80" alt="image" src="https://github.com/user-attachments/assets/6c1f4cd1-0fa0-475b-abd6-e7f6d4bcd767" />

hasil run

<img width="205" height="78" alt="image" src="https://github.com/user-attachments/assets/3639d354-9e46-4869-a390-24a26d726c58" />


**PERCOBAAN 3**

hasil kode program

<img width="409" height="406" alt="image" src="https://github.com/user-attachments/assets/2262cd69-f47e-40b2-8724-ba5bff733d46" />

hasil run

<img width="211" height="66" alt="image" src="https://github.com/user-attachments/assets/87b7af6b-0456-4f7e-b0a2-1df794b2af32" />

**PERTANYAAN**

1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa?
Dan kelebihannya apa?

Jawab : konsep yang digunakan Varargs (Variable Argument) yang ditandai dengan sintaks tiga titik (...), ini otomatis diperlakukan sebagai sebuah array. Kelebihannya yakni membuat pembuat argumen menjadi sangat fleksibel, bisa memasukkan banyak objek sekaligus secara dinamis tanpa perlu membuat array manual atau memanggil fungsi tambah() berulang ulang

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!

jawab : <img width="359" height="47" alt="image" src="https://github.com/user-attachments/assets/1f26bc8e-a5d8-4fd0-a9c1-4a4989cdff18" />

hasil run
<img width="167" height="56" alt="image" src="https://github.com/user-attachments/assets/22d17fea-e019-4a50-a13f-e44a97d73ff7" />

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

jawab : <img width="194" height="55" alt="image" src="https://github.com/user-attachments/assets/75c88eb7-7c84-4051-a34e-0bf112cd4ced" />

hasil run

<img width="170" height="73" alt="image" src="https://github.com/user-attachments/assets/942327c9-6bc3-4707-8808-91a2dddf1b11" />

## **TUGAS PRAKTIKUM**

**hasil kode program**

class nilai04

<img width="319" height="140" alt="image" src="https://github.com/user-attachments/assets/3c15fe32-7c33-4848-a507-ede4e9d2a361" />

class mataKuliah04

<img width="286" height="131" alt="image" src="https://github.com/user-attachments/assets/ea861ac2-a644-4c0c-91cf-eff65a96299b" />

class mainSistemNilai

<img width="419" height="281" alt="image" src="https://github.com/user-attachments/assets/fc55bccb-a3bd-49f7-b096-2eee84c04a06" />

<img width="568" height="370" alt="image" src="https://github.com/user-attachments/assets/b775995a-bc54-4fb4-aa44-23e178208a91" />

<img width="545" height="232" alt="image" src="https://github.com/user-attachments/assets/506273ce-e601-4560-bb36-defaeccbda56" />

<img width="334" height="379" alt="image" src="https://github.com/user-attachments/assets/e3d8bcf5-670b-4615-b230-8422b4759944" />


**hasil run** 

menu 

<img width="230" height="94" alt="image" src="https://github.com/user-attachments/assets/c83ef435-57f8-455c-92cb-c3634defdfbc" />

daftar mahasiswa

<img width="150" height="58" alt="image" src="https://github.com/user-attachments/assets/74145ac0-855b-4191-acfb-b0ad695626f5" />

daftar mata kuliah 

<img width="160" height="41" alt="image" src="https://github.com/user-attachments/assets/e5369ae0-9d8c-45f2-98a4-cb592b462ab2" />


pilih 1 --> input nilai 

<img width="169" height="140" alt="image" src="https://github.com/user-attachments/assets/fa945830-bf6b-4f55-89d5-bd4cc93c9134" />
<img width="185" height="140" alt="image" src="https://github.com/user-attachments/assets/3a93e0fa-fdc4-4f5f-8b6d-7186917c520c" />
<img width="158" height="142" alt="image" src="https://github.com/user-attachments/assets/18313efc-f2c3-4a63-ba4e-a28d962bfc5c" />
<img width="167" height="139" alt="image" src="https://github.com/user-attachments/assets/8d32ee93-8a9f-4050-99ba-8ac7ad2ecc1b" />

pilih 2 --> menampilkan nilai 

<img width="259" height="63" alt="image" src="https://github.com/user-attachments/assets/fb599bf3-4bb5-46be-b369-5bb2ab3c3ee2" />

pilih 3 --> mencari nilai mahasiswa

<img width="274" height="44" alt="image" src="https://github.com/user-attachments/assets/3cee5237-1491-44c6-abb4-685d343f55f8" />

pilih 4 --> mengurutkan data/nilai menggunakan ascending

<img width="267" height="59" alt="image" src="https://github.com/user-attachments/assets/2ee88f70-b532-497b-946b-4d05007b6c48" />

pilih 5 --> menghapus antrian mahasiswa menggunakan metode queue

<img width="215" height="24" alt="image" src="https://github.com/user-attachments/assets/7a196381-992a-4e58-9cdd-e0249b10bc9e" />
