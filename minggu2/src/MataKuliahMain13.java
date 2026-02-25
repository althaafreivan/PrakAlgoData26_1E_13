package minggu2.src;

public class MataKuliahMain13 {
  public static void main(String[] args) {
    MataKuliah13 mk1 = new MataKuliah13();
    mk1.kodeMK = "ALGD_13";
    mk1.nama = "Algoritma dan Struktur Data";
    mk1.sks = 3;
    mk1.jumlahJam = 6;

    mk1.tampilInformasi();
    mk1.ubahSKS(4);
    mk1.tambahJam(2);
    mk1.kurangiJam(3);
    mk1.tampilInformasi();

    System.out.println("---------------------------------");

    MataKuliah13 mk2 = new MataKuliah13("PBO_13", "Pemrograman Berorientasi Objek", 3, 6);
    mk2.tampilInformasi();
    mk2.kurangiJam(10);
    mk2.tampilInformasi();
  }
}
