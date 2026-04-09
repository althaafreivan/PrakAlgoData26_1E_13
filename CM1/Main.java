package CM1;

import java.util.Scanner;

public class Main {
  static Mahasiswa mhs[] = new Mahasiswa[3];
  static Buku buku[] = new Buku[4];
  static Peminjaman peminjaman[] = new Peminjaman[5];
  static Scanner scanner = new Scanner(System.in);

  // Main method
  public static void main(String[] args) {
    isiData();
    mainMenu();
  }

  // Method untuk menampilkan menu utama
  public static void mainMenu() {
    while (true) {
    
    System.out.println("===  SISTEM PEMINJAMAN RUANG BACA JTI ===");
    System.out.println("1. Tampilkan Mahasiswa");
    System.out.println("2. Tampilkan Buku");
    System.out.println("3. Tampilkan Peminjaman");
    System.out.println("4. Urutkan Berdasarkan Denda");
    System.out.println("5. Cari Berdasarkan NIM");
    System.out.println("6. Keluar");

    System.out.print("Pilih: ");
    int pilihan = scanner.nextInt();
    switch (pilihan) {
      case 1:
        tampilMahasiswa();
        break;
      case 2:
        tampilBuku();
        break;
      case 3:
        tampilPeminjaman();
        break;
      case 4:
        urutkanDenda();
        break;
      case 5:
        cariNIM();
        break;
      case 6:
        System.out.println("Terima kasih!");
        System.exit(0);
      default:
        System.out.println("Pilihan tidak valid!");
    }
  }
  }

  // Method untuk menampilkan daftar mahasiswa
  public static void tampilMahasiswa() {
    System.out.println("Daftar Mahasiswa:");
    for (Mahasiswa m : mhs) {
      m.tampilMahasiswa();
    }
  }

  // Method untuk menampilkan daftar buku
  public static void tampilBuku() {
    System.out.println("Daftar Buku:");
    for (Buku b : buku) {
      b.tampilBuku();
    }
  }

  // Method untuk menampilkan daftar peminjaman
  public static void tampilPeminjaman() {
    System.out.println("Daftar Peminjaman:");
    for (Peminjaman p : peminjaman) {
      p.hitungDenda();
      p.tampilPeminjaman();
    }
  }

  // Method untuk mengurutkan peminjaman berdasarkan denda terbesar
  public static void urutkanDenda() {
    System.out.println("Daftar Peminjaman Urut Berdasarkan Denda Terbesar");
    for (int i = 0; i < peminjaman.length - 1; i++) {
      for (int j = 1; j < peminjaman.length - i; j++) {
        if (peminjaman[j - 1].denda < peminjaman[j].denda) {
          Peminjaman temp = peminjaman[j];
          peminjaman[j] = peminjaman[j - 1];
          peminjaman[j - 1] = temp;
        }
      }
    }
    tampilPeminjaman();
  }
  
  // Method untuk mencari peminjaman berdasarkan NIM mahasiswa
  public static void cariNIM() {
    System.out.print("Masukkan NIM: ");
    String nim = scanner.next();
    boolean found = false;
    for (Peminjaman p : peminjaman) {
      if (p.mhs.nim.equals(nim)) {
        p.hitungDenda();
        p.tampilPeminjaman();
        System.out.println();
        found = true;
      }
    }
    if (!found) {
      System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }
  }

  public static void isiData() {
    mhs[0] = new Mahasiswa("22001", "Andi", "Teknik Informatika");
    mhs[1] = new Mahasiswa("22002", "Budi", "Teknik Informatika");
    mhs[2] = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

    buku[0] = new Buku("B001", "Algoritma", 2020);
    buku[1] = new Buku("B002", "Basis Data", 2019);
    buku[2] = new Buku("B003", "Pemrograman", 2021);
    buku[3] = new Buku("B004", "Fisika", 2024);

    peminjaman[0] = new Peminjaman(mhs[0], buku[0], 7);
    peminjaman[1] = new Peminjaman(mhs[1], buku[1], 3);
    peminjaman[2] = new Peminjaman(mhs[2], buku[2], 10);
    peminjaman[3] = new Peminjaman(mhs[2], buku[3], 6);
    peminjaman[4] = new Peminjaman(mhs[0], buku[1], 4);
  }
}
