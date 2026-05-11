**LAPORAN PRAKTIKUM JOBSHEET 11**

NAMA : AYU WARDATUL WIDAD

NIM : 254107020171

KELAS : TI 1E


**Percobaan 1**

Hasil kode program

Class SLLMain04
<img width="421" height="221" alt="image" src="https://github.com/user-attachments/assets/249e4c6e-4137-489f-b07e-027a14b2c53c" />

Class mahasiswa04
<img width="331" height="186" alt="image" src="https://github.com/user-attachments/assets/397460a3-5d0d-4d72-9acb-077f2b9f8c9d" />

Class node04
<img width="230" height="118" alt="image" src="https://github.com/user-attachments/assets/5c124008-02d1-4e46-94e9-cd3eb32a39f6" />

Class SingelLinkedList04
<img width="277" height="419" alt="image" src="https://github.com/user-attachments/assets/3c6560c0-1a4d-4be2-b795-4e671303b6f9" />
<img width="294" height="320" alt="image" src="https://github.com/user-attachments/assets/0d3312d2-323f-42df-b383-b56a83557a10" />

Hasil run
<img width="158" height="127" alt="image" src="https://github.com/user-attachments/assets/a9035b2a-76d5-4a27-9261-2e48bbedda6f" />

**Pertanyaan**
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

Jawab : Karena sll.print() dipanggil sebelum data apapun ditambahkan ke linked list. 
Saat object sll baru dibuat, nilai head = null, sehingga method isEmpty() mengembalikan true,
dan program mencetak "Linked List Kosong".

2. Jelaskan kegunaan variable temp secara umum pada setiap method!

Jawab : Variable temp berfungsi sebagai pointer sementara untuk melakukan traversal (penelusuran) 
node-node dalam linked list, tanpa mengubah posisi head aslinya.

3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

Jawab : 

Hasil kode
<img width="331" height="305" alt="image" src="https://github.com/user-attachments/assets/d6185ae0-30ac-4951-96ec-703dc840a4a3" />


Hasil run
<img width="167" height="279" alt="image" src="https://github.com/user-attachments/assets/dc158e47-b4ba-4fc6-adac-e69412b7935c" />


**Percobaan 2**

Hasil kode program

Class SLLMain04
<img width="421" height="113" alt="image" src="https://github.com/user-attachments/assets/880ccf0e-6fad-442c-834d-5bcef8fe6240" />

Class SingleLinkedList04
<img width="376" height="428" alt="image" src="https://github.com/user-attachments/assets/faace2b8-74f0-48d8-8b8b-12fbad769657" />

<img width="395" height="348" alt="image" src="https://github.com/user-attachments/assets/ee1edb27-170a-4539-9d3a-a1ab72bf4cb5" />


Hasil run
<img width="199" height="152" alt="image" src="https://github.com/user-attachments/assets/43c04e8f-1be7-48e1-b49e-6f20645a537f" />


**Pertanyaan**

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

Jawab : Keyword break digunakan untuk menghentikan perulangan (loop) segera setelah node yang dicari ditemukan dan dihapus, agar program tidak terus menelusuri node-node berikutnya yang tidak perlu.

2. Jelaskan kegunaan kode dibawah pada method remove

Jawab : 

- temp.next = temp.next.next
Menghapus node target dengan cara menyambungkan langsung node sebelumnya (temp) ke node sesudah node yang dihapus (temp.next.next), sehingga node target tidak lagi terhubung ke linked list.

- if (temp.next == null) tail = temp
Mengecek apakah node yang dihapus adalah node terakhir. Jika iya, maka tail diperbarui menjadi temp (node sebelumnya), karena node terakhir sudah berubah setelah penghapusan.

**TUGAS**

