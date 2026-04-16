package CM1;

public class Buku {
  String kodeBuku;
  String judul;

  // Sesi 1.A
  // Menambahkan grade pada buku.
  char grade;
  int tahunTerbit;

  public Buku() {
  }

  public Buku(String kodeBuku, String judul, int tahunTerbit, char grade) {
    this.kodeBuku = kodeBuku;
    this.judul = judul;
    this.tahunTerbit = tahunTerbit;
    this.grade = grade; 
  }

  public void tampilBuku() {
    System.out.println("Kode: " + kodeBuku + " | " + "Judul: " + judul + " | " + "Tahun: " + tahunTerbit);
  }
}
