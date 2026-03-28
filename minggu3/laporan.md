# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 3

<h4>Nama : Mohammad Daanii Althaaf Reivan Fadhlillah<h4>
<h4>NIM : 254107020123<h4>
<h4>Kelas : TI-1E<h4>

## 3.2.2 Verifikasi Hasil Percobaan
![3.2.2.png](./3.2.2.png)

## 3.2.3 Pertanyaan
1. Berdasarkan uji coba, class yang dibuat array of object itu ga harus selalu punya atribut sama method sekaligus, tapi biasanya emang dipake buat nyimpen data (atribut) dan ngolah data itu (method). Jadi tergantung kebutuhaan aja sih.
2. Kode `Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];` itu buat instansiasi array yang tipenya objek Mahasiswa dengan kapasitas 3 elemen. Tapi ini baru arraynya aja, objek di dalemnya belom diinstansiasi.
3. Class Mahasiswa ga ada konstruktor yang kita buat manual, tapi Java otomatis kasih **default constructor** (konstruktor kosong). Makanya kita tetep bisa manggil `new Mahasiswa()`.
4. Kode itu buat instansiasi objek Mahasiswa di indeks ke-0 dari array, terus diisi atribut-atributnya kayak nim, nama, kelas, sama ipk.
5. Dipisahin biar lebih rapi aja dan mengikuti prinsip OOP, dimana class Mahasiswa itu sebagai **blueprint** (model data), sedangkan MahasiswaDemo itu buat **driver** atau tempat running programnya.

## 3.3.2 Verifikasi Hasil Percobaan
![3.3.2.png](./3.3.2.png)

## 3.3.3 Pertanyaan
1. Udah ditambahin method `cetakInfo()` di class Mahasiswa biar pas nampilin data ga usah nulis `System.out.println` berkali-kali di main.
2. Itu error gara-gara objek di dalem arraynya belom diinstansiasi pake `new Mahasiswa()`. Arraynya udah ada tempatnya, tapi isinya masih `null`, jadi pas mau ngisi atribut bakalan kena `NullPointerException`.

## 3.4.2 Verifikasi Hasil Percobaan
![3.4.2.png](./3.4.2.png)

## 3.4.3 Pertanyaan
1. Bisa banget, itu namanya **Constructor Overloading**. Kita bisa buat konstruktor lebih dari satu asal parameternya beda (jumlah atau tipenya).
2. Method `tambahData()` bisa dipake buat masukin data ke objek Matakuliah lewat parameter biar lebih dinamis pas dipanggil di class Demo.
3. Method `cetakInfo()` dipake biar kode di `main` lebih simpel, tinggal panggil satu method aja buat nampilin semua atribut objek Matakuliah.
4. Udah dimodifikasi pake `Scanner` biar panjang arraynya bisa ditentuin sama user pas program jalan.

## 3.5 Tugas (Dosen)
![3.5.png](./3.5.png)
- Buat class `Dosen` sama `DataDosen` buat ngolah datanya.
- Di `DataDosen` ada method buat nampilin semua dosen, ngitung jumlah per jenis kelamin, rata-rata usia, sama nyari dosen paling tua & paling muda.
- Semuanya dipanggil di `DosenDemo` pake perulangan biar efisien.
