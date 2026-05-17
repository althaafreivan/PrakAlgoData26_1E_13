package P2Jobsheet10.src;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AntrianKRS antrian = new AntrianKRS(10);
    int pilihan;

    do{
      System.out.println("\n=== Menu Antrian KRS Mahasiswa ===");
      System.out.println("1. Tambah Mahasiswa ke Antrian");
      System.out.println("2. Panggil Antrian (Proses KRS)");
      System.out.println("3. Lihat 2 Mahasiswa Terdepan");
      System.out.println("4. Lihat Semua Antrian");
      System.out.println("5. Lihat Mahasiswa Paling Belakang");
      System.out.println("6. Cetak Status dan Kuota");
      System.out.println("7. Kosongkan Antrian");
      System.out.println("0. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = sc.nextInt(); sc.nextLine();

      switch (pilihan) {
        case 1:
          System.out.print("NIM: ");
          String nim = sc.nextLine();
          System.out.print("Nama: ");
          String nama = sc.nextLine();
          System.out.print("Prodi: ");
          String prodi = sc.nextLine();
          System.out.print("Kelas: ");
          String kelas = sc.nextLine();
          Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
          antrian.tambahAntrian(mhs);
          break;
        case 2:
          antrian.layaniKRS();
          break;
        case 3:
          antrian.lihat2Terdepan();
          break;
        case 4:
          antrian.tampilkanSemua();
          break;
        case 5:
          antrian.lihatAkhir();
          break;
        case 6:
          antrian.cetakStatus();
          break;
        case 7:
          antrian.clear();
          break;
        case 0:
          System.out.println("Terima kasih.");
          break;
        default:
          System.out.println("Pilihan tidak valid");
          break;
      }
    } while (pilihan != 0);
    sc.close();
  }
}
