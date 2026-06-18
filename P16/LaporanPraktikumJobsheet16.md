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
