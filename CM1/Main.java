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
    System.out.println("Daftar Peminjaman Urut Berdasarkan Denda Terbesar, Jika denda sama maka urutkan berdasarkan nama mahasiswa sesuai abjad");
    for (int i = 0; i < peminjaman.length - 1; i++) {
      for (int j = 1; j < peminjaman.length - i; j++) {
        if (peminjaman[j - 1].denda < peminjaman[j].denda) {
          Peminjaman temp = peminjaman[j];
          peminjaman[j] = peminjaman[j - 1];
          peminjaman[j - 1] = temp;
        }else if (peminjaman[j-1].denda == peminjaman[j].denda){
        }
      }
    }

    // Sesi 1.B
    // Mengurutkan sekali lagi sesuai abjad dan skip jika total denda tidak equal, karena saya malas memodifikasi yang pertama jadi saya
    // copy paste sorting diatas dan hanya mengubah kondisinya. 😁
    for (int i = 0; i < peminjaman.length - 1; i++) {
      for (int j = 1; j < peminjaman.length - i; j++) {
        // Disini karena diatas sudah disortir, jadi saya hanya mengubah kondisinya menjadi jika denda kedua pihak setara dan komparasi huruf pertama nama kedua pihak.
        // Memang bukan yang paling efisien, tapi dia bekerja dengan baik. ☺️
         if(peminjaman[j - 1].denda == peminjaman[j].denda && (int)peminjaman[j-1].mhs.nama.charAt(0) > ((int)peminjaman[j].mhs.nama.charAt(0))) {
          Peminjaman temp = peminjaman[j];
          peminjaman[j] = peminjaman[j - 1]; 
          peminjaman[j - 1] = temp;
        }else if (peminjaman[j-1].denda == peminjaman[j].denda){
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
    mhs[0] = new Mahasiswa("22001", "Budi", "Teknik Informatika");
    mhs[1] = new Mahasiswa("22002", "Andi", "Teknik Informatika");
    mhs[2] = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");


    // Sesi 1.A
    // Menambahkan argumen baru pada grade nya sesuai dengan parameter.
    buku[0] = new Buku("B001", "Algoritma", 2020, 'A');
    buku[1] = new Buku("B002", "Basis Data", 2019, 'B');
    buku[2] = new Buku("B003", "Pemrograman", 2021, 'A');
    buku[3] = new Buku("B004", "Fisika", 2024, 'B');

    peminjaman[0] = new Peminjaman(mhs[0], buku[0], 7);
    peminjaman[1] = new Peminjaman(mhs[1], buku[0], 7);
    peminjaman[2] = new Peminjaman(mhs[2], buku[2], 10);
    peminjaman[3] = new Peminjaman(mhs[2], buku[3], 6);
    peminjaman[4] = new Peminjaman(mhs[0], buku[1], 4);
  }
}
