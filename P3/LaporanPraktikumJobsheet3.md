LAPORAN PRAKTIKUM JOBSHEET 3

Nama  : Ayu Wardatul Widad

Kelas  : TI - 1E

NIM    : 254102070171

3.2 PERCOBAAN 1 
  Hasil kode dan run pemograman 
 <img width="288" height="196" alt="Screenshot 2026-02-26 081925" src="https://github.com/user-attachments/assets/febfb2f9-0272-4f1a-91d9-5dda70f7d975" />

  <img width="677" height="820" alt="Screenshot 2026-02-26 081908" src="https://github.com/user-attachments/assets/8596dafc-a845-419f-8ab8-4984d6016f33" />
  <img width="457" height="332" alt="Screenshot 2026-02-26 081849" src="https://github.com/user-attachments/assets/d02eb2a6-2cc1-4796-ac09-c5104af8008b" />

PERTANYAAN 
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
   
2. Apa yang dilakukan oleh kode program berikut?
   <img width="621" height="44" alt="image" src="https://github.com/user-attachments/assets/fa9bd284-9500-4779-8987-da253fa9a620" />

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
   <img width="618" height="39" alt="image" src="https://github.com/user-attachments/assets/dd3c6097-e4a1-436e-a964-22a075a86aa9" />

4. Apa yang dilakukan oleh kode program berikut?
   <img width="544" height="109" alt="image" src="https://github.com/user-attachments/assets/7d632655-fd1a-45c6-9cac-ba49915241fa" />

6. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
  
JAWABAN 

1. Class array of object tidak harus memiliki method yang penting kelas tersebut dapat dibuat objectnya, method hanya opsional untuk mempermudah pengolahan data

2. Kode tersebut membuat array yang dapat menyimpan 3 objek mahasiswa, namun objek mahasiswa belum dibuat sehingga setiap elem array masih bernilai null

3. Jika tidak java otomatis membuat konstuktor default (tanpa parameter)

4. Kode tersebut melakukan dua hal yaitu membuat objek mahasiswa pada indeks ke 0 array dan mengisi nilai atribut objek tersebut

5. Karena masing - masing memiliku fungsi yang berbeda. Class Mahasiswa04 menyimpan atribut mahasiswa, sementara Class MahasiswaDemo04 untuk menjalankan dan menguji objek

3.3 PERCOBAAN 2

Berikut hasil kode dan run pemograman 

<img width="739" height="709" alt="Screenshot 2026-02-26 084956" src="https://github.com/user-attachments/assets/6343ed1b-b4ca-4773-a3b7-b8e7c1ea3b55" />

<img width="410" height="641" alt="image" src="https://github.com/user-attachments/assets/d10b9f07-2933-49b3-8765-f9fe0bafc52c" />

PERTANYAAN

1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.

2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?

<img width="615" height="128" alt="image" src="https://github.com/user-attachments/assets/591de886-828c-4710-8704-4401e119bca3" />

JAWABAN 

1. hasil modifikasi

perubahan pada class Mahasiswa04
<img width="436" height="287" alt="image" src="https://github.com/user-attachments/assets/44ccbc7a-e372-4bb2-9be7-37dab57ee3ec" />

dipanggil melalui class MahasiswaDemo04
<img width="356" height="53" alt="image" src="https://github.com/user-attachments/assets/f4b2cbdd-3ff0-4576-8453-273787b7b9a0" />

<img width="405" height="545" alt="image" src="https://github.com/user-attachments/assets/aeb24331-acc0-4fba-84dc-7f514cabcf6d" />

2. Error tejadi karena elemen array belum diinisialisasi sebagai objek Mahasiswa, sehingga masih bernilai null dan tidak dapat diakes atributnya

3.4 PERCOBAAN 3

Berikut hasil kode dan run pemograman

<img width="668" height="318" alt="image" src="https://github.com/user-attachments/assets/f8f2625b-c607-4348-a693-f6088f4912fa" />

<img width="708" height="759" alt="image" src="https://github.com/user-attachments/assets/e613d809-d834-439c-8ca7-e64b0bd3b7cd" />

<img width="347" height="600" alt="Screenshot 2026-02-26 091715" src="https://github.com/user-attachments/assets/e72874f0-9d10-4727-8c21-72d66898246a" />

PERTANYAAN 

1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya

2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah

3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar

4.Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner

JAWABAN 

1. Ya, suatu clas dapat memiliki lebih dari satu construktor, namun setiap construktor harus memiliki parameter yang berbeda beda

<img width="679" height="316" alt="Screenshot 2026-02-26 102708" src="https://github.com/user-attachments/assets/5ac9c0dd-88b3-4fe8-ac46-54cea10d9a4b" />

2. Berikut hasil kode dan run modifikasi

Kode pada class Mahasiswa

<img width="630" height="115" alt="image" src="https://github.com/user-attachments/assets/26b602e3-303f-48d4-b035-7c66927cafcc" />

kode memangil method tambahData pada class MahasiswaDemo04 

<img width="637" height="65" alt="image" src="https://github.com/user-attachments/assets/4404e448-95d8-4b77-8da9-7adcb2bb1348" />

hasil run

<img width="297" height="592" alt="image" src="https://github.com/user-attachments/assets/cf6569f1-a6ab-4ae4-936d-08ca176ab651" />


3. Berikut hasil modifikasi

Kode pada class MataKuliah
<img width="446" height="157" alt="image" src="https://github.com/user-attachments/assets/32fc211b-8b89-4c90-a6db-674d4211594d" />

Kode untuk memanggil method cetakInfo pada class mataKuliahDemo
<img width="382" height="60" alt="image" src="https://github.com/user-attachments/assets/1cddd301-8f6a-42de-bf80-21076df40cea" />

<img width="357" height="602" alt="Screenshot 2026-02-26 104106" src="https://github.com/user-attachments/assets/b426f87f-ccce-4e1b-a6ec-3cdcba3aaa3b" />

4. Hasil modifikasi

Penambahan kode pada class MatakuliahDemo

<img width="573" height="116" alt="image" src="https://github.com/user-attachments/assets/5691a1b3-76aa-4934-b78a-3c28918b0b95" />

<img width="304" height="402" alt="image" src="https://github.com/user-attachments/assets/528e16f7-33d1-460c-b77b-a9ea9edb6a6f" />

TUGAS 
1. 
