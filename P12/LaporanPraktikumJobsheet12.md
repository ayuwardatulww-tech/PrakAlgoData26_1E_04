**LAPORAN PRAKTIKUM JOBSHEET 12**

NAMA : Ayu Wardatul Widad

NIM : 254107020171

KELAS : TI 1E



**Percobaan 1**

HASIL KODE

class node04

<img width="157" height="139" alt="image" src="https://github.com/user-attachments/assets/5310e859-03e4-4bd4-9b3e-be9999585eb2" />

class mahasiswa04

<img width="323" height="164" alt="image" src="https://github.com/user-attachments/assets/c92a275c-2d5a-4d8e-ba35-c83dba260465" />

class doubleLinkedList04

<img width="218" height="347" alt="image" src="https://github.com/user-attachments/assets/3cf630bc-0d8c-414f-8bfd-a6a5d2a33875" />

<img width="368" height="407" alt="image" src="https://github.com/user-attachments/assets/1a006fda-d2d9-4aee-8521-1809033e51e4" />

<img width="366" height="274" alt="image" src="https://github.com/user-attachments/assets/50366417-7e94-445e-8616-dcab41da6343" />

class doubleLinkedListMain04

<img width="335" height="427" alt="image" src="https://github.com/user-attachments/assets/b4c64fc6-04a9-4947-bb7f-1ced6879e841" />

<img width="299" height="161" alt="image" src="https://github.com/user-attachments/assets/469f2c1c-fe8c-441f-9623-738c25e60c65" />


HASIL RUN

<img width="336" height="255" alt="image" src="https://github.com/user-attachments/assets/d0e1bfb1-3f24-46ce-bdb8-f160246c0357" />

<img width="379" height="528" alt="image" src="https://github.com/user-attachments/assets/76dfac73-cc6e-4fb6-8b2f-c81b6220f381" />


**Pertanyaan**

1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan
Double Linked List!

Jawab : Single linked list hanya memiliki satu pointer next pada setiap node sehingga traversal hanya bisa
dilakukan satu arah dari head ke tail. Double linked list memiliki dua pointer yaitu next dan prev sehingga 
traversal dapat dilakukan dua arah. Konsekuensinya double linked list membutuhkan memori lebih besar
namun manipulasi data seperti hapus dan sisip menjadi lebih mudah karena bisa langsung mengakses node sebelumnya
melalui prev


2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi
masing-masing atribut tersebut pada proses traversal dan manipulasi node!

Jawab : Atribut next berfungsi menunjukkan node berikutnya dan digunakan saat traversal maju dari head ke tail
seperti pada method print() dengan current = current.next. Sedangkan atribut prev berfungsi menunjukkan node
sebelumnya dan digunakan saat traversal mundur maupun manipulasi node seperti pada inserAfter() untuk menyambungkan
node baru dari dua arah sekaligus

3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut
terhadap kondisi awal linked list!

Jawab : Konstruktor doubleLinkedList04() berfungsi menginisialisasi kondisi awal linked list dengan mengatur
heas dan tail menjadi null, yang berarti linked list dimulai dalam kondisi kosong. Kondisi ini menjadi acuan
method isEmpty() untuk menentukan apakah linked list sudah memiliki data atau belum

4. Perhatikan potongan kode berikut:
if (isEmpty()) {
 head = tail = newNode;
}
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?

Jawab : Ketika hanya ada satu node, node tersebut sekaligus menjadi node pertama dan terakhir, sehingga 
head dan tail harus menunjuk ke node yang sama melalui head = tail = newNode. Jika salah satunya dibiarkan 
NULL, operasi yang bergantung pada head maupun tail seperti addLast() dan removeLast() akan gagal

5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika
tidak terdapat data pada linked list!

Jawab : Pada kode saya kode sudah benar
<img width="245" height="112" alt="image" src="https://github.com/user-attachments/assets/688ef37e-a463-4caf-a87c-70d5580053d7" />
method print() pada kode sudah menangani kondisi linked list kosong dengan pengecekan isEMpty() diawal method
jika kosong program mencetak pesan "Linked list masih kosong" lalu mengehntikan eksekusi dengan return. Jika
tidak kosong traversal dilakukan dari head ke tail menggunakan current = current.next dan setiap data
ditampilkan melalui method tampilkan() 

6. Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail
menuju head!

Jawab : 

Hasil modifikasi kode

pada class doubleLinkedlist04 <img width="237" height="122" alt="image" src="https://github.com/user-attachments/assets/0c3b7953-3ddb-4f39-ad2e-9571b649fc80" />

method printReverse() ditambahkan pada class doubleLinkedList04 untuk menampilakn data secara terbalik dari
tail menuju head dengan memanfaatkan pointer prev. Jika linked kosongn program mencetak pesan "Linked List masih kosong"

pada class main04 
<img width="429" height="36" alt="image" src="https://github.com/user-attachments/assets/c5ded0f3-0624-428e-bd45-b6e0526e619c" />
<img width="229" height="70" alt="image" src="https://github.com/user-attachments/assets/abe360e3-0f8c-4ad2-b01b-92cad4e5e158" />

Hasil run modifikasi 

<img width="318" height="55" alt="image" src="https://github.com/user-attachments/assets/7dd83819-e2bc-438d-bbbf-fe8c9b1519e9" />
data awal 

<img width="340" height="264" alt="image" src="https://github.com/user-attachments/assets/b6c5137e-b5a6-41e7-a626-7ca929c63fa3" />
memilih menu 7 untuk menampilkan data terbalik


**Percobaan 2**
