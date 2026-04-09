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
      denda = terlambat * 2000;
    } else {
      terlambat = 0;
      denda = 0;
    }
  }

  public void tampilPeminjaman() {
    System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " hari | Terlambat: " + terlambat + " hari | Denda: " + denda);
  }
}
