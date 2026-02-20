*LAPORAN PRAKTIKUM JOBSHEET 2*

Nama : Ayu Wardatul Widad

Kelas : TI - 1E

Nim : 254102070171

2.1 Percobaan 1 

Pertanyaan 

1. Sebutkan dua karakteristik class atau object!
   
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
  
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
  
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
   
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?

Jawaban 

1. atribut (data atau variable) dan method (funsi yang dilakukan objek)
   
2. adad 4 yaitu nama, nim dan kelas yang bertipe string, lalu ada ipk yang bertipe double 

3. ada 4 method yaitu
   - tampilkanInformasi ()
   - UbahKelas()
   - updateIPK()
   - nilaiKinerja()

4. Hasil modifikasi
   <img width="566" height="155" alt="image" src="https://github.com/user-attachments/assets/de80e035-b5a0-4145-a0a1-b794fae38732" />

5. 

Berikut hasil kode dan hasil run percobaan 2.1

<img width="432" height="715" alt="image" src="https://github.com/user-attachments/assets/15d81b20-b673-4f04-8ac9-6889459e3a9c" />

2.2 Percobaan 2

Hasil kode dan hasil run percobaan 2

Pertanyaan 

1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
   
2. Bagaimana cara mengakses atribut dan method dari suatu objek?

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

Jawaban 

1. Mahasiswa04 mhs1 = new Mahasiswa04();

2. Menggunakna titik seperti contoh berikut mhs1.nama04 = "Muhammad Ali Farhan";

3. Karena pada pemanggilan kedua di method tampilkanInformasi() terdapat beberapa data yang diubah yaitu : ubahkelas dan updateIPK


2.3 Percobaan 3 

Hasil kode dan hasil run dari class Mahasiswa
<img width="667" height="847" alt="image" src="https://github.com/user-attachments/assets/62f22ef9-34be-4de2-a388-01e570034834" />

<img width="251" height="186" alt="image" src="https://github.com/user-attachments/assets/02a3bdd8-d31e-4415-9fc2-b68e5cc08ece" />

Hasil kode dan hasil run dari class MahasiswaMain 
<img width="1038" height="502" alt="image" src="https://github.com/user-attachments/assets/0b60645f-54a9-4341-b8db-e05f366a5845" />

<img width="246" height="273" alt="image" src="https://github.com/user-attachments/assets/7f95f2ae-096e-47e5-8b6a-d0f024d5f90b" />

Pertanyaan 

1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!

2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!

4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!

5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!

Jawaban 

1. public Mahasiswa04 (String nm, String nim, double ipk, String kls){

2. mengisi deklarasi pada baris sebelumnya

3. akan menghasilkan eror karena konstruktor dihapus

4. method dalam class bisa dipanggil dalam urutan sesuai kebutuhan program namun jika suatu method bergantung pada data terbaru, maka sebaiknya method yang mengubah data yang dipanggil terlebih dahulu 

5. Hasil modifikasi kode dan run
   <img width="1123" height="588" alt="image" src="https://github.com/user-attachments/assets/9e79da6e-8c90-487d-9bcd-4990787eeb5e" />

   <img width="254" height="366" alt="image" src="https://github.com/user-attachments/assets/bac3d748-3cf6-4644-b550-ca261955fbd4" />


2.4 Percobaan 4 

Berikut hasil run dan hasil kode 



