## **LAPORAN PRAKTIKUM JOBSHEET 14**

Nama : Ayu Wardatul Widad

NIM : 254107020171

Kelas : TI 1E

## Percobaan 1

**Hasil kode**

class node04

<img width="428" height="330" alt="Screenshot 2026-06-03 091351" src="https://github.com/user-attachments/assets/f7b526a7-d71e-48cf-be14-a754aac4c939" />

Class mahasiswa04

<img width="708" height="287" alt="Screenshot 2026-06-03 091426" src="https://github.com/user-attachments/assets/0c29267f-846f-4a06-86a6-0be363da4499" />

Class binarytree04

<img width="371" height="882" alt="Screenshot 2026-06-03 091506" src="https://github.com/user-attachments/assets/892f3e8f-134d-4f48-9b73-54dd0b3d0998" />


<img width="347" height="491" alt="Screenshot 2026-06-03 091531" src="https://github.com/user-attachments/assets/356c4a07-b4c4-4cc9-b5dc-bc24d31c423a" />

<img width="499" height="805" alt="Screenshot 2026-06-03 091550" src="https://github.com/user-attachments/assets/f39cbd46-a64b-4193-8f5b-ab70f09dedce" />

<img width="402" height="257" alt="Screenshot 2026-06-03 091603" src="https://github.com/user-attachments/assets/cc491a28-cad0-4320-b7f6-c12a30d9bc10" />


Class binaryTreeMain04

<img width="606" height="579" alt="Screenshot 2026-06-03 091646" src="https://github.com/user-attachments/assets/354933b5-70e6-476c-a1f1-11d9d80fde18" />


**Hasil run**

<img width="356" height="767" alt="Screenshot 2026-06-03 090643" src="https://github.com/user-attachments/assets/652941af-9cfa-4a52-a49c-a0156b157ecd" />


## Pertanyaan 

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding
binary tree biasa?

Jawab : Karena data sudah terurut berdasarkan nilai IPK. Pencarian bisa langsung ke kanan/kiri, tidak perlu cek semua node. KOmpleksitas O(log n) vs O(n) di tree biasa

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?

Jawab : Untuk menunjuk ke child node sebelahnya. Left = child dengan IPK lebih kecil, right = child dengan IPK lebih besar

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

Jawab : - Sebagai akses awal/poniter ke node paling atas(root) dari tree
        - null (kosong) karena belum ada node yang ditambahkan

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

Jawab :  Node baru langsung jadi root. Kondisi if(isEmpty()) di method add() akan set node baru sebagai root

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?

Jawab :  Baris itu untuk navigasi traversak
        - Jika IPK mahasisa < IPK current --> ke left child
        - Jika IPK mahasiswa > IPK current --> ke right child
        - Jika current null --> tempat untuk insert node baru ditemukan

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua
anak. Bagaimana method getSuccessor() membantu dalam proses ini?

Jawab : - Cari successor (node terkecil di right subtree)
        - Copy data successor ke node yang dihapus
        - Hapus successor
        - Method getSuccessor() mencari node tersebut dengan traversal ke kanan sekali terus ke kiri sampai null

## Percobaan 2

**Hasil kode**

class binaryTreeArray04

<img width="455" height="453" alt="image" src="https://github.com/user-attachments/assets/0cb88ace-661e-460a-9403-4297531aebb7" />

Class binaryTreeArrayMain04

<img width="696" height="388" alt="image" src="https://github.com/user-attachments/assets/51961d49-a7cb-4694-888d-88d9e6ad605c" />

**Hasil run**

<img width="413" height="133" alt="image" src="https://github.com/user-attachments/assets/b9baa08c-5527-4a36-b4e7-68995af19cec" />

## Pertanyaan

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?

Jawab : - data[] = array untuk menyimpan data mahasiswa
        - idxLast = index terakhir yang sudah terisi, buat tahu batas array yang dipakai

2. Apakah kegunaan dari method populateData()?

Jawab : Mengisi data mahasiswa dari array ke dalam struktur tree

3. Apakah kegunaan dari method traverseInOrder()?

Jawab : Menampilkan data tree secara in-orser (left --> root --> right) dari yang terkecil ke terbesar IPK

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi
left child dan right child masing-masing?

Jawab : - left child = 2 x 2 + 1 = 5
        - right child = 2 x 2 + 2 = 6

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

Jawab : Menunjukkan bahwa data terakhir yang valid ada di index 6. Array index 7,8,9 dianggap kosong

6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan
rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?

Jawab : itu rumus untuk tree yang disimpan di array (complete binary tree)
        - node di index i punya left child di 2i + 1 dan right child di 2i + 2
        - cara ini efisien soalnya tidak perlu pointer, langsung hitung indeksnya

## TUGAS

**Hasil perubahan class dari penambahan pada tugas**

class binaryTree04

<img width="477" height="709" alt="image" src="https://github.com/user-attachments/assets/651688eb-8a99-49fd-bc77-f75efaf40ffb" />

<img width="591" height="662" alt="image" src="https://github.com/user-attachments/assets/4e492645-e50d-4f9d-90ba-6788f6423548" />


class binaryTreeArray04

<img width="500" height="452" alt="image" src="https://github.com/user-attachments/assets/308abf42-ea20-4aa1-b178-0042ed87010b" />

<img width="813" height="700" alt="image" src="https://github.com/user-attachments/assets/97f724f1-b97c-43a2-9234-b013111cbbb3" />

<img width="446" height="370" alt="image" src="https://github.com/user-attachments/assets/7bed0d2c-122c-4e84-ae65-db8ff08334bd" />


class binaryTreeMain04

<img width="779" height="416" alt="image" src="https://github.com/user-attachments/assets/8e4c6e43-c26a-4fb7-89c6-e5ff27f76bc5" />


Class binaryTreeArrayMain04

<img width="717" height="462" alt="image" src="https://github.com/user-attachments/assets/3ddfa136-5b05-4195-a5cf-03f480946cc8" />


**Hasil run**

class binaryTreeMain04

<img width="515" height="427" alt="image" src="https://github.com/user-attachments/assets/75c26332-3fcb-4147-a7b4-36d45e039f6b" />

class binaryTreeArrayMain04

<img width="486" height="586" alt="image" src="https://github.com/user-attachments/assets/2ac55667-6b47-4e17-87cb-53ef26164cd6" />
