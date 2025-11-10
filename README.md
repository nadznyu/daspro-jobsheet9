**Pertanyaan Percobaan 1**
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
    Apa yang terjadi? Mengapa bisa demikian?
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut
    for (int i = 0; i < 4; i++) {
        System.out.println(bil[i]);
    }
    Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

**Jawaban Percobaan 1**
1. Akan terjadi error karena terdapat 2 bilangan yang seharusnya memakai tipe data double, tetapi dipaksa 
   memakai  tipe data int. Alhasil program tidak dapat dijalankan.
2. Saya menambahkan kode program seperti berikut : 
   int[] bil = {5, 13, -7, 17};
3. Program akan mengeluarkan output seperti di bawah :
    5
    13
    -7
    17
    Statement ini mencetak seluruh elemen dari indeks 0 sampai 3.
4. Setelah mengubah kondisi menjadi i <= 4, output yang keluar tidak mengeluarkan indeks ke 4. Karena i = 0, 
   sehingga kondisi yang terjadi akan mengeluarkan 5 baris, sedangkan indeks yang dimasukkan hanya sampai 4.

