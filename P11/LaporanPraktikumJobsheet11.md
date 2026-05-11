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

Hasil kode program

Class Mahasiswa04
<img width="314" height="183" alt="image" src="https://github.com/user-attachments/assets/2e606f98-32fc-409d-96a7-de42beea18d6" />

Class nodeTugas04
<img width="251" height="117" alt="image" src="https://github.com/user-attachments/assets/0afe0231-1423-47ae-a116-f482ea92b8c1" />

Class QueueLinkedList04
<img width="443" height="361" alt="image" src="https://github.com/user-attachments/assets/2bdfeb6e-5aaa-4695-a2df-e256c1025bc2" />
<img width="446" height="401" alt="image" src="https://github.com/user-attachments/assets/8d7f5371-9c3e-42bd-8a43-d5b8393ff236" />
<img width="319" height="101" alt="image" src="https://github.com/user-attachments/assets/0825d647-d702-4ea7-944e-776d6299c1d4" />

Class Main04
<img width="346" height="415" alt="image" src="https://github.com/user-attachments/assets/6e34c07d-abde-4b6d-83f6-0f6c47baf153" />
<img width="381" height="319" alt="image" src="https://github.com/user-attachments/assets/113b4263-fceb-4dd1-927b-70f565db0870" />


Hasill run

=== MENU ANTRIAN MAHASISWA ===
<img width="161" height="103" alt="image" src="https://github.com/user-attachments/assets/f2978ecc-cfeb-4414-bfda-c2752191b7cf" />

Pilih = 1 //menambahkan mahasiswa
<img width="239" height="59" alt="image" src="https://github.com/user-attachments/assets/3ca086cf-f7b5-450e-a1cd-72c80ff6e59a" />
<img width="237" height="58" alt="image" src="https://github.com/user-attachments/assets/76c1466e-fafe-4945-8598-ff8c2ec2d3d4" />
<img width="240" height="56" alt="image" src="https://github.com/user-attachments/assets/9a7b43d7-5aa7-445e-8872-158677521b4d" />

Pilih = 3 //tampilkan semua mahasiswa
<img width="157" height="86" alt="image" src="https://github.com/user-attachments/assets/6d3f9cbc-9083-4fec-b09f-2f80c76d13a0" />

Pilih = 4 //menampilkan antrian terdepan
<img width="157" height="32" alt="image" src="https://github.com/user-attachments/assets/adda50ba-41ee-42df-bfb7-df6175d5eacf" />

Pilih = 5 //menampilkan antrian paling belakang
<img width="161" height="32" alt="image" src="https://github.com/user-attachments/assets/84cb3204-1950-4bdc-a600-e6d22ea3277f" />

Pilih = 6 //jumlah antrian
<img width="119" height="23" alt="image" src="https://github.com/user-attachments/assets/ab702144-c9db-4ec5-904e-5f7b11fc8cae" />

Pilih = 7 //cek antrian kosong
<img width="125" height="23" alt="image" src="https://github.com/user-attachments/assets/d933992c-3e27-4b29-8477-e1152c38c3a8" />
antrian tidak kosong

Pilih = 2 //panggil mahasiswa dari antrian
<img width="239" height="24" alt="image" src="https://github.com/user-attachments/assets/faf1f399-5cf1-4022-b24e-41df4a9db608" />

Pilih = 8 //cek antrian penuh
<img width="124" height="25" alt="image" src="https://github.com/user-attachments/assets/0704149c-dab7-4002-9619-38b6661127ff" />
antrian tidak penuh

Pilih = 9 //bersihkan antrian
<img width="124" height="32" alt="image" src="https://github.com/user-attachments/assets/2af1173f-2bb1-428d-978c-2755ffe7c14c" />

Pilih = 3 //tampilkan semua mahasiswa --> cek ulang apakah antrian sudah bersih
<img width="77" height="24" alt="image" src="https://github.com/user-attachments/assets/a10174ce-2102-4fed-b4a5-8892335d7943" />

Pilih = 7 //cek antrian lagi
<img width="122" height="28" alt="image" src="https://github.com/user-attachments/assets/d7768bcc-51ac-4a9c-a835-8ae2e01380dd" />
antrian kosong

Pilih = 0 //keluar
<img width="65" height="23" alt="image" src="https://github.com/user-attachments/assets/e8c416c2-5402-48ea-8ec3-8d0b9c349859" />
