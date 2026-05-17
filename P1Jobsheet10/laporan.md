## 2.1.2 Verifikasi Hasil Percobaan
[!2.1.2.png]

## 2.1.3 Pertanyaan

1. Dalam queue, indeks 0 berarti yang paling dahulu dieksekusi, dan nilai diatas 0 adalah indeks antreannya. Jadi menggunakan -1 yang menandakan bahwa antrean tidak valid atau bisa diartikan sedang kosong.
2. Untuk circular queue checking, jadi kalau ada indeks di awal yang kosong maka dia akan menempati indeks yang kosong tersebut sebagai rear. Hal ini dilakukan agar indeks awal pada array queue bisa digunakan kembali.
3. Memiliki mekanisme yang sama dengan soal sebelumnya, tetapi ini akan memindahkan front.
4. Karena i belum pasti bernilai 0, dan dalam kondisi tertentu bisa saja rear lebih kecil daripada front.
5. Misal jika {rear = 0, front = 4, max =4} maka {i = 4}. Dalam siklus looping ini, i akan terus +1 sampai modulus mencapai rear, yaitu 0.
6. ![2.1.3.6.png]
7. ![2.1.3.71.png] ![2.1.3.72.png]