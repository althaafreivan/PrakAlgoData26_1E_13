package Quiz1;

import java.util.Scanner;

public class LaporanKeuanganMain {
  public static void main(String[] args) {
    // Deklarasi object array laporan keuangan.
  LaporanKeuangan laporanKeuangan[];

    // Deklarasi object scanner dan minta input jumlah laporan keuangan yang ingin diinput.
    Scanner scanner = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);
    System.out.print("Jumlah Laporan Keungan: ");
    int totalLaporan = scanner.nextInt();

    // Inisialisasi object array laporan keuangan.
    laporanKeuangan = new LaporanKeuangan[totalLaporan];
    for (int i = 0; i < laporanKeuangan.length; i++) {
      laporanKeuangan[i] = new LaporanKeuangan();
    }

    // Mengiterasi setiap laporan keuangan untuk menginputkan value dari variable yang dibutuhkan.
    int selection = 0;
    for (int i = 0; i < laporanKeuangan.length; i++) {
    System.out.print("Silahkan input angka untuk isi laporan keuangan [" + (i+1) +"]");
    System.out.println();
    
    System.out.println("Nama Perusahaan: ");
    laporanKeuangan[i].namaPerusahaan = scannerString.next();

    System.out.print("Input Pendapatan Bulanan: ");
    laporanKeuangan[i].pendapatanBulanan = scanner.nextDouble();

    System.out.print("Input biaya operasional: ");
    laporanKeuangan[i].biayaOperasional = scanner.nextDouble();
    }

    // Pengulangan untuk Sistem Menu agar kembali ke awal jika salah satu opsi selesai.
    do{
      System.out.println("Menu: ");
      System.out.println("1. Keuntungan ");
      System.out.println("2. Rata-rata Keuntungan ");
      System.out.println("3. Persentase Keuntungan ");
      System.out.print("Pilihan anda: ");

      selection = scanner.nextInt();

      switch (selection) {

        // Untuk mengambil keuntungan perusahaan (single)
        case 1:
          int indeks = -1;
            System.out.println("Indeks ke: ");
            indeks = scanner.nextInt();
            indeks --;
            if(indeks<laporanKeuangan.length && indeks >-1){
              laporanKeuangan[indeks].printData();
            }
          break;

        // Untuk mengambil rata rata keuntungan semua perusahaan dengan pendapatan bulanan diatas 100.000
        case 2:
          double rata = 0;
          int totalPerusahaan = 0;
          for (LaporanKeuangan laporanKeuangan2 : laporanKeuangan) {
            if(laporanKeuangan2.pendapatanBulanan > 100000) rata += laporanKeuangan2.hitungKeuntungan();
            totalPerusahaan++;
          }
          rata /= totalPerusahaan;
          System.out.println("Rata-rata keuntungan: " + rata);
          break;
          
        // Untuk mengambil rata rata persentase keuntungan semua perusahaan dengan pendapatan bulanan diatas 100.000
        case 3:
          System.out.println("Persentase keuntungan");
          double totalkotor = 0;
          double totalBersih = 0;
          int _totalPerusahaan = 0;
          for (LaporanKeuangan laporanKeuangan2 : laporanKeuangan) {
            if(laporanKeuangan2.pendapatanBulanan > 100000) {
              totalkotor += laporanKeuangan2.pendapatanBulanan;
              totalBersih += laporanKeuangan2.hitungKeuntungan();
              _totalPerusahaan++;
            }
          }
          totalkotor/=_totalPerusahaan;
          totalBersih/=_totalPerusahaan;
          
          System.out.println("Persentase Keuntungan: " + ((totalBersih/totalkotor)*100) + "%" + "Dari total.");
          break;
        default:
          System.out.println("Maaf input salah.");
          break;
      }

    }while(selection!=0);

  }
}
