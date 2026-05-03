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

System.exit(1) akan langsung menghentikan seluruh program saat dipanggil. Angka 1 menandakan program berhenti karena error




**Praktikum 2**

Hasil kode

class mahasiswa

<img width="643" height="377" alt="image" src="https://github.com/user-attachments/assets/ca0cb5e6-9fa0-4890-924a-c7feaac9d7df" />

class antriLayanan

<img width="757" height="805" alt="image" src="https://github.com/user-attachments/assets/21300a32-6c6f-4b19-bf32-14521c6ec672" />

<img width="692" height="640" alt="image" src="https://github.com/user-attachments/assets/1d21de3e-b58a-482e-8bef-9a0fc45c16bc" />

<img width="612" height="290" alt="image" src="https://github.com/user-attachments/assets/c64b81b9-9c67-4f09-b63b-f6d1a053d6e6" />

class layananAkademikSIAKAD

<img width="773" height="419" alt="image" src="https://github.com/user-attachments/assets/b5388c39-55e6-4f44-8e92-82ecdf62e42a" />

<img width="822" height="785" alt="image" src="https://github.com/user-attachments/assets/7c8a55d9-3ed8-4123-a5c0-7d358e8386d3" />



Hasil run

<img width="348" height="507" alt="image" src="https://github.com/user-attachments/assets/ccb9e329-6f63-4069-b1cf-e21170b9d1b9" />

<img width="373" height="470" alt="image" src="https://github.com/user-attachments/assets/97c5260a-0de3-4acf-bf21-d1767349eea0" />

<img width="387" height="585" alt="image" src="https://github.com/user-attachments/assets/a34b7b3a-6909-4e30-a512-4a9329032f38" />


**Pertanyaan**

Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class
AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan
pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga
method LihatAkhir dapat dipanggil!

Jawab : 
modifikasi pada class antri layanan dengan menambahkan method lihatAkhir()

<img width="575" height="185" alt="image" src="https://github.com/user-attachments/assets/380408fd-5c95-47f8-b2e3-a82541eafffb" />

lalu pada class layananAkademikSIAKAD

penambahan pada tampilan menu 
<img width="542" height="31" alt="image" src="https://github.com/user-attachments/assets/53ee1501-6b58-441b-a38d-1e492f89f809" />

penambahan pada switch case 
<img width="266" height="79" alt="image" src="https://github.com/user-attachments/assets/ce1fab57-eda0-4d59-98d4-18356f0873bd" />


hasil run

<img width="348" height="232" alt="image" src="https://github.com/user-attachments/assets/2b235464-88e9-44f9-a2d9-2e22aa37d866" />

**Tugas**

Hasil kode pemograman yang sesuai dengan soal 

class Mahasiswa saya memanggil class Mahasiswa pada praktikum 2
<img width="694" height="376" alt="image" src="https://github.com/user-attachments/assets/b3ebadc1-b385-42c2-bffd-dcdb3f008f21" />

class layananKRS
<img width="735" height="884" alt="image" src="https://github.com/user-attachments/assets/f61863d2-14b6-413d-839e-603f0e5d9f23" />
<img width="656" height="818" alt="image" src="https://github.com/user-attachments/assets/5d1adb69-3870-4f1c-aae1-88b1e8dd3c72" />
<img width="693" height="561" alt="image" src="https://github.com/user-attachments/assets/4d546d8b-b794-4cd8-95e7-9cfd7a7a9ff3" />

class KRSmain
<img width="644" height="496" alt="image" src="https://github.com/user-attachments/assets/a04d5cdb-a4a4-492a-8b5a-ec38eda6b2eb" />
<img width="611" height="814" alt="image" src="https://github.com/user-attachments/assets/6015fcaf-8239-4b36-8da3-9f6f69515fc9" />


Hasil run

Tampilan Menu 
<img width="346" height="206" alt="image" src="https://github.com/user-attachments/assets/91a75d96-e742-4255-ad63-11f0997e14ba" />

Menu 1

<img width="312" height="117" alt="image" src="https://github.com/user-attachments/assets/cbf47592-8f35-4ed1-ba74-8d809c23ce17" />
<img width="348" height="120" alt="image" src="https://github.com/user-attachments/assets/90435fb0-d05e-4e2a-89dc-125ad4367a70" />
<img width="355" height="123" alt="image" src="https://github.com/user-attachments/assets/47464f8c-22d7-435d-b2b0-fa38e6623ebc" />
<img width="336" height="118" alt="image" src="https://github.com/user-attachments/assets/7e375cf6-138a-48b8-9d69-a01c4be4a7d4" />

Menu 2
<img width="298" height="210" alt="image" src="https://github.com/user-attachments/assets/5992b812-1432-4c00-bee8-df637081f6f1" />

Menu 3
<img width="250" height="99" alt="image" src="https://github.com/user-attachments/assets/10eb4eb1-38f5-4b2d-9558-105693bcde18" />

Menu 4
<img width="262" height="88" alt="image" src="https://github.com/user-attachments/assets/34ecc690-76c0-4c7a-bc2c-af90d360f502" />

Menu 5
<img width="175" height="44" alt="image" src="https://github.com/user-attachments/assets/0804de68-1eb9-4480-a28b-2b5e76e890ff" />

Menu 6
<img width="282" height="105" alt="image" src="https://github.com/user-attachments/assets/0f6abb62-3a00-4145-a1e4-8e785ebdaca8" />

Menu 5 
<img width="203" height="50" alt="image" src="https://github.com/user-attachments/assets/cc4bb65d-8a2e-4107-a0be-ba9566084869" />

Menu 7
<img width="265" height="51" alt="image" src="https://github.com/user-attachments/assets/8a10e0ad-59d9-450b-9a52-d72f769676f0" />

Menu 6
<img width="240" height="100" alt="image" src="https://github.com/user-attachments/assets/5f0def5c-1a31-42cc-9127-02b8415a3539" />

Menu 8
<img width="291" height="49" alt="image" src="https://github.com/user-attachments/assets/b2fc6329-422c-4e45-9aca-a6ddfcde4c3c" />

Menu 9
<img width="241" height="54" alt="image" src="https://github.com/user-attachments/assets/45f16b9c-a9b4-49e9-8ba9-22a9ca239568" />

Menu 0 
<img width="168" height="56" alt="image" src="https://github.com/user-attachments/assets/c7625163-ab20-4059-9c0e-c268df257e18" />
