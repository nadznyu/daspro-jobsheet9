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

**Pertanyaan Percobaan 2**
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        nilaiAkhir[i] = sc.nextInt();
    }
    Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ? 
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program 
   hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
    for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-"+i+" lulus!");
        }
    }
    Jalankan program dan jelaskan alur program!
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, 
   yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut: (ilustrasi ada di soal jobsheet 9)

**Jawaban Percobaan 2**
1. Tidak terjadi perubahan.
2. Kondisi akan mengeluarkan output i kurang dari banyaknya baris dari nilai akhir. Seperti 
   pada langkah percobaan, nilai akhir bernilai 10, maka baris yang akan di print mulai dari baris 0,1,2,3,4,5,6,7,8,9.
3. Di awal, program akan meminta kita untuk memasukkan nilai Mahasiswa sampai dengan mahasiswa 
   ke 9, lalu program akan membaca nilai yang sudah dimasukkan, kemudian program hanya membaca dan mengeluarkan output "lulus!" untuk nilai mahasiswa yang lebih dari 70.
4. Modifikasi berada di github.