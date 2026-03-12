LAPORAN PRAKTIKUM JOBSHEET 5

Nama    : Ayu Wardatul Widad

Kelas    : TI - 1E

NIM      : 254107020171


*5.2 PERCOBAAN*

Hasil Kode 

Class faktorial 

<img width="496" height="457" alt="image" src="https://github.com/user-attachments/assets/6845888c-9383-414a-b1ef-fce40fdec12a" />

Class MainFaktorial

<img width="488" height="383" alt="image" src="https://github.com/user-attachments/assets/6eb7f474-72c9-40ed-91f6-252165ce2694" />

Hasil run 

<img width="456" height="70" alt="image" src="https://github.com/user-attachments/assets/8c36d920-3860-4a0d-af58-d32981fe28cf" />

PERTANYAAN 

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!

2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan
for? Buktikan!

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!

JAWABAN 

1. if berfungsi sebagai kondisi berhenti, sedangkan else berfungsi untuk melanjutkan proses rekursi hingga mencapai kondisi berhenti

2. Ya, memungkinkan, perulangan pada method faktorialBF() juga dapat menggunakan while
   Berikut contoh implementasi menggunakan while
   
   <img width="295" height="234" alt="image" src="https://github.com/user-attachments/assets/dd626031-e1f8-4000-a4ee-39f19844a24f" />

3. fakto *=i digunakan pada perulangan (iterasi) untu mengalihkan nilai faktorial secara bertahap dari 1 sampai n. Sedangkan int fakto = n * faktorialDC(n-1) digunakan pada rekusi yaitu fungsi memanggil dirinya sendiri dengan nilai yang lebih kecil sampai mencapai kondisi berhenti

4. method faktorialBF() menghitung faktorial menggunakan perulangan (loop) dari 1 sampai n. Sedangkan method faktorialDC() menghitung faktorial menggunakan rekusi, yaitu fungsi memanggil dirinya sendiri sampai mencapai kondisi dasar


*5.3 PERCOBAAN*

hasil kode 

class pangkat

<img width="539" height="551" alt="image" src="https://github.com/user-attachments/assets/f4e32777-930a-4ecd-86d3-a2c2187e0ff5" />

class mainPangkat

<img width="706" height="577" alt="image" src="https://github.com/user-attachments/assets/ea38b048-d029-4df4-9556-0c62099a4696" />

hasil run 

<img width="355" height="268" alt="image" src="https://github.com/user-attachments/assets/2cdbbd42-d3ff-468e-8ecb-8e5b49cbc6c9" />

PERTANYAAN

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?

4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

JAWABAN 

1. pangkatBF() = menghitung pangkat menggunakan perulangan (loop), nilai basis dikalikan berulang kali sebanyak nilai pangkat. pangkatDC() = menghitung pangkat menggunakan rekursi, fungsi memanggil dirinya sendiri dengan memecah masalah menjadi bagian yang terkecil

2. Ya, tahap compline sudah ada dalam kode

<img width="432" height="107" alt="image" src="https://github.com/user-attachments/assets/3826eed3-fffb-44e3-8de2-e3d2607a429c" />

3. Method tersebut tetap relevan menggunakan parameter karena nilai basis dan pangkat dapat dikirim langsung saat method dipanggil, namun method tersebut juga bisa dibuat tanpa parameter karena nilai sudah disimpan dalam atribut nilai dan pangkat pada class

Berikut hasil apabila kode tanpa parameter 

<img width="349" height="127" alt="image" src="https://github.com/user-attachments/assets/cc0257c8-23e1-41fc-ac4f-e6d695cad20a" />

4. pangkatBF () menghitung pangkat dengan cara mengalihkan nilai secara berulang menggunakan perulangan. pangkatDC () menghitung pangkat menggunakan rekursi dengan membagi masalah menjadi bagian yang lebih kecil lalu menggabungkan hasilnya kembali     


*5.4 PERCOBAAN*

hasil kode 

class sum

<img width="446" height="500" alt="image" src="https://github.com/user-attachments/assets/f67986ad-abff-495c-a9a4-4f3ded7397b3" />

classs mainSum 

<img width="984" height="412" alt="image" src="https://github.com/user-attachments/assets/00450b6d-3592-41f8-9408-3ec95475b044" />

hasil kode 

<img width="551" height="159" alt="image" src="https://github.com/user-attachments/assets/56f5985d-9c7f-4a40-9fed-229537729de1" />

PERTANYAAN 

1. Kenapa dibutuhkan variable mid pada method TotalDC()?

2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?

3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?

4. Apakah base case dari totalDC()?

5. Tarik Kesimpulan tentang cara kerja totalDC()

JAWABAN 

1. variable mid dgunakan untuk membagi array menjadi dua bagian, dengan adanya mid data dapat dipisahkan menjadi bagian kiri dan bagian kanan sehingga proses penjumlahan bisa dilakukan menggunakan metode Divide anf Conquer

2. statment tersebut digunakan untuk menghitung total keuntungan pada dua bagian array 
   lsum untuk menghitung jumlah pada bagian kiri
   rsum untuk menghitung jumlah pada bagian kanan

3. untuk menggabungkan hasil dari bagian kiri dan kanan sehingga diperoleh total keuntungan seluruh data

4. base case pada method ini adalah

  <img width="187" height="60" alt="image" src="https://github.com/user-attachments/assets/e1f5e551-92fb-46d8-b9cb-83581e8e7f14" />

5. method totalDC() bekerja dengan membagi data menjadi dua bagian, kemudian menghitung jumlah masing - masing begian secara rekursif, setelah itu hasil dari kedua bagian tersebut digabungkan kembali dengan penjumlahan untuk mendapatkan total keuntungan seluruh data


*LATIHAN PRAKTIKUM*


