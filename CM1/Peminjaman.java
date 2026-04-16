package CM1;

public class Peminjaman {
  Mahasiswa mhs;
  Buku buku;
  int lamaPinjam;
  int batasPinjam = 5;
  int terlambat;
  int denda;

  public Peminjaman() {
  }

  public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
    this.mhs = mhs;
    this.buku = buku;
    this.lamaPinjam = lamaPinjam;
  }

  public void hitungDenda() {
    if (lamaPinjam > batasPinjam) {
      terlambat = lamaPinjam - batasPinjam;
      
      // Sesi 1.A
      // Perubahan, menambahkan kalkulasi dan branching harga denda untuk menentukan harga sesuai dengan grade buku
      int hargaDenda = 0;
      if(buku.grade == 'A'){
        hargaDenda = 5000;
      }else if (buku.grade =='B'){
        hargaDenda= 2000;
      }

      denda = terlambat * hargaDenda;
    } else {
      terlambat = 0;
      denda = 0;
    }
  }

  public void tampilPeminjaman() {
    System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " hari | Terlambat: " + terlambat + " hari | Denda: " + denda + " | Grade Buku: " + buku.grade);
  }
}
