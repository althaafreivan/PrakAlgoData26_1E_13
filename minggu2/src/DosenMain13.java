package minggu2.src;

public class DosenMain13 {
  public static void main(String[] args) {
    Dosen13 dsn1 = new Dosen13();
    dsn1.idDosen = "DSN01";
    dsn1.nama = "Dr. Andi Wijaya";
    dsn1.statusAktif = true;
    dsn1.tahunBergabung = 2015;
    dsn1.bidangKeahlian = "Kecerdasan Buatan";

    dsn1.tampilInformasi();
    dsn1.setStatusAktif(false);
    System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
    dsn1.ubahKeahlian("Data Science");
    dsn1.tampilInformasi();

    System.out.println("---------------------------------");

    Dosen13 dsn2 = new Dosen13("DSN02", "Siti Aminah, M.T.", true, 2020, "Jaringan Komputer");
    dsn2.tampilInformasi();
    System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
  }
}
