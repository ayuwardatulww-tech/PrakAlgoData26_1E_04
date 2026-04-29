**LAPORAN PRAKTIKUM JOBSHEET 10**

Nama : Ayu Wardatul Widad

Kelas : TI - 1E

NIM : 254107020171



**Praktikum 1**

hasil kode 

class queue

<img width="393" height="697" alt="image" src="https://github.com/user-attachments/assets/91a0f304-23c5-4af3-8c24-3f4ab5b02cc2" />

<img width="781" height="643" alt="image" src="https://github.com/user-attachments/assets/929c1212-db02-4319-a3a3-eb2cbaa858f9" />

<img width="617" height="747" alt="image" src="https://github.com/user-attachments/assets/25a4ab77-66b8-4056-970a-b44859e9d79f" />

class queueMain

<img width="747" height="324" alt="image" src="https://github.com/user-attachments/assets/0e029673-2280-4db9-ba98-5417f9330724" />

<img width="842" height="772" alt="image" src="https://github.com/user-attachments/assets/91fedee1-86d0-4ef7-8db0-057a259ebfe4" />

hasil run 

<img width="380" height="626" alt="image" src="https://github.com/user-attachments/assets/ebc1831a-aada-4e11-b531-f6f601de21cf" />

**Pertanyaan**

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?

Jawab : front = rear = -1 nilai -1 digunakan sebagai penanda bahawa queue masih kosong. Indeks array dimulai dari 0,
jadi -1 adalah nilai yang tidak mungkin ada secara normal
Lalu size=0 karena size menyimpan jumlah elemen dan saat queu baru dibuat memang belum ada elemen, maka
nilainya 0 bukan -1 karena 0 sudah cukup mempresentasikan "kosong" untuk jumlah


2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

Jawab : Implementasi circular queue (antrian melingkar). Ketika rear sudah berada di indeks terakhir
array (max -1) maka rear dikembalikan ke indeks 0, sehingga slot yang sudah dikosongkan oleh dequeue bisa dipakai kembali 

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

Jawab : Sama seperti sebelumnya, ini juga bagian dari circular queue. Ketika elemen terdepan (front) berada
di indeks terakhir array, setelah di dequeue maka front dikembalikan ke indeks 0. Ini memastikan proses
pembacaan elemen mengikuti alur melingkar sesuai dengan cara data dimasukkan


4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?

Jawab : Karena ini adalah circular queue, elemen pertama yang valid tidak selalu berada di indeks 0
Setelah beberapa kali dequeue front bisa berada di indeks mana saja. Kalau dimulai dari i=0 maka data
yang dicetak bisa salah atau tidak valid. Dengan memulai dari i=front, perulangan dimulai tepat dari
elemn terdepan yang masih ada di queue


5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

Jawab : maksudnya adalah cara mengerakkan indeks i secara melingkar. Setelah mencetak elemen di indek i, indeks
dinaikkan 1. Operasi % max memastikan jika indeks sudah mancapai max akan kembali ke 0


6. Tunjukkan potongan kode program yang merupakan queue overflow!

Jawab : <img width="439" height="87" alt="image" src="https://github.com/user-attachments/assets/ec872554-e6f1-4e1d-b7fe-1250e304450c" />
Queue overflow terjadi ketika mencoba memasukkan data (enqueue) ke dalam queue 
yang sudah penuh (IsFull() == true), kondisi ini ditangkap oleh pengecekan isFull() di awal method enqueue


7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!

Jawab : <img width="649" height="108" alt="image" src="https://github.com/user-attachments/assets/27b3112b-26ea-451a-ad54-dc6b67ef0aea" />

<img width="621" height="101" alt="image" src="https://github.com/user-attachments/assets/e535d3a2-17e8-4eb9-97e5-177b89f4d3d3" />



**Praktikum 2**

Hasil kode

Hasil run
