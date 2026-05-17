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

pada class doubleLinkedlist04 

<img width="237" height="122" alt="image" src="https://github.com/user-attachments/assets/0c3b7953-3ddb-4f39-ad2e-9571b649fc80" />

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

Hasil kode

class doubleLinkedList04

<img width="233" height="239" alt="image" src="https://github.com/user-attachments/assets/cf22da63-064c-40d8-a233-dffc6c96aa62" />


hasil run

<img width="176" height="204" alt="image" src="https://github.com/user-attachments/assets/9a74fab3-4aa6-43b9-b949-dcd3bea6a497" />

**Pertanyaan**

1. Perhatikan potongan kode berikut pada method removeFirst():
head = head.next;
head.prev = null;
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!

Jawab : Statment head = head.next berfungsi memindahkan pointer head ke node berikutnya, sehingga node pertama yang sebelumnya menjadi head tidak lagi terhubung ke linkedList. Kemudian statment head.prev = null berfungsi memutuskan pointer prev dari node baru yang kini menjadi head, agar tidak lagi menunjukkan ke node lama yang sudah dihapus. Kedua statment ini bekerja bersama untuk memastikan node pertama terhapus dengan bersih dan struktur linkedList tetap valid

2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data
yang berhasil dihapus!

Jawab : 

Hasil kode modifikasi

<img width="474" height="643" alt="image" src="https://github.com/user-attachments/assets/a5a6d571-938c-41bb-904b-4fe6c638bcd7" />


Hasil run

<img width="376" height="505" alt="image" src="https://github.com/user-attachments/assets/a6f2b498-d77d-4763-aa8e-679c189e0367" />


**TUGAS PRAKTIKUM**

1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks
tertentu!

Jawab : Hasil kode 

<img width="621" height="597" alt="image" src="https://github.com/user-attachments/assets/5b2287fa-15f3-4e6d-992f-5110028e2628" />


2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data
key tertentu!

Jawab : Hasil kode

<img width="298" height="197" alt="image" src="https://github.com/user-attachments/assets/669290ff-ce78-481c-b309-5ae9a5153a7d" />


3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!

Jawab : Hasil kode

<img width="292" height="337" alt="image" src="https://github.com/user-attachments/assets/e06ceab8-ed34-425e-a6e3-cdc396a199a4" />


4. Tambahkan method:
a. getFirst()
b. getLast()
c. getIndex()
untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu.

Jawab : Hasil kode

<img width="296" height="403" alt="image" src="https://github.com/user-attachments/assets/4b174c5e-d58a-4254-812a-ee0082ed8bfb" />


5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.

Jawab : Hasil kode

<img width="346" height="208" alt="image" src="https://github.com/user-attachments/assets/c70d61dd-cf87-4b34-8a32-6c2e30dab05f" />

<img width="532" height="439" alt="image" src="https://github.com/user-attachments/assets/6cc20848-6617-4912-ab93-aa1e3bd15e7c" />

<img width="565" height="676" alt="image" src="https://github.com/user-attachments/assets/fcb7bf99-2194-4356-933b-c3df472a8df6" />

menambhakan method untuk menampilkan size

<img width="424" height="67" alt="image" src="https://github.com/user-attachments/assets/b1fe20db-81fe-41eb-93e0-c654296e6dd8" />


HASIL RUN

Tampilan Menu

Menu yang terbaru ada pada menu 8 - 13

<img width="170" height="140" alt="image" src="https://github.com/user-attachments/assets/27c08116-4142-4cb4-a25d-c58149af384e" />

Tampilan data yang telah di input

<img width="127" height="32" alt="image" src="https://github.com/user-attachments/assets/7ec5cb6d-1dc0-45f8-a38d-b4aaa9ee1652" />

Menu 8 //Menambahkan data pada indeks tertentu

<img width="163" height="75" alt="image" src="https://github.com/user-attachments/assets/51b3f12b-6dd1-4749-bb36-e00a55710dec" />

Hasil data terbaru 

<img width="126" height="52" alt="image" src="https://github.com/user-attachments/assets/da05b10a-7bdc-4bd2-a461-5ba3e8478e1c" />


Menu 11 //Menampilkan data pertama

<img width="137" height="34" alt="image" src="https://github.com/user-attachments/assets/be19fd42-58b2-4010-9a69-fad025603823" />

Menu 12 //Menampilkan data terakhir

<img width="132" height="34" alt="image" src="https://github.com/user-attachments/assets/64d2e226-9162-444c-944a-d5ea455f7173" />

Menu 13 //Menampilkan data pada indeks tertentu

<img width="200" height="62" alt="image" src="https://github.com/user-attachments/assets/9b057c65-dc4b-4de3-8641-6487511819c0" />

Menu 9 //Menghapus data setelah NIM tertentu

<img width="230" height="44" alt="image" src="https://github.com/user-attachments/assets/611761a0-6386-4828-90a7-32271ebd83ba" />

data terbaru 

<img width="125" height="44" alt="image" src="https://github.com/user-attachments/assets/21f2909a-8974-42a9-8abe-785d50b1a5e6" />

Menu 10 //Menghapus data pada indeks tertentu

<img width="217" height="39" alt="image" src="https://github.com/user-attachments/assets/4dce1f20-5baa-4f48-9aae-78723bc23a30" />

hasil data terakhir

<img width="128" height="35" alt="image" src="https://github.com/user-attachments/assets/7d59dba7-66a7-452b-998c-b25437cbf0e4" />

menu 0 //Keluar

<img width="79" height="23" alt="image" src="https://github.com/user-attachments/assets/d8258ab5-fde2-44d9-86de-cbb90ec5564e" />
