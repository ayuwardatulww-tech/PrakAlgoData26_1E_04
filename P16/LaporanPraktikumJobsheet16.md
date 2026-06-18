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
