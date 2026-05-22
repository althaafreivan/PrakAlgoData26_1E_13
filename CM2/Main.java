package CM2;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Deklarasi objek linkedlist antrian
    DoubleLinkedListAntrian dlantrian = new DoubleLinkedListAntrian();
    LinkedListRekap rekap = new LinkedListRekap();
    
    // Memakai array biasa karena nanti hanya dilakukan operasi sorting, size untuk membantu menetnukan jumlah data
    int size = 0;
    Pesanan[] pesanan = new Pesanan[10];

    // Deklarasi 2 scanner, 1 untuk integer dan 1 untuk string agar tidak ada buffer
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    // Untuk memilih.
    int pilihan = -1;

    // Data Dummy
    Pembeli pbl1 = new Pembeli("Ainra", "08224500000");
    Pembeli pbl2 = new Pembeli("Danra", "08224511111");
    Pembeli pbl3 = new Pembeli("Sanri", "08224522222");
    Pembeli pbl4 = new Pembeli("Vania", "08224533333");

    dlantrian.tambahAntrean(pbl1);
    dlantrian.tambahAntrean(pbl2);
    dlantrian.tambahAntrean(pbl3);
    dlantrian.tambahAntrean(pbl4);

    // Perulangan untuk fitur utama dan main menu
    do{
    System.out.println("=======");
    System.out.println("Sistem antrian royal delish");
    System.out.println("=======");
      System.out.println("1. Tambah Antrian");
      System.out.println("2. Cetak Antrian");
      System.out.println("3. Hapus Antrian dan Pesan");
      System.out.println("4. Laporan Pesanan");
      System.out.println("5. Laporan Rekap");
      System.out.println("0. Keluar");
    System.out.print("Pilih Menu\t: ");
    
    pilihan = sc1.nextInt();
    switch (pilihan) {
      case 0:
        System.out.println("Terimakasih");
        System.exit(pilihan);
        break;
        case 1:
        // Membuat objek pembeli baru dengan data input pengguna lalu dimasukkan kedalam objek double linked list antrean.
          Pembeli baru = new Pembeli(null, null);
          System.out.print("Nama Pembeli\t: ");
        baru.namaPembeli13 = sc2.nextLine();
        System.out.print("No HP \t: ");
        baru.NoHp13 = sc2.nextLine();
        
        dlantrian.tambahAntrean(baru);
        break;
        case 2:
          // Memanggil fungsi cetak di objek dlantrian.
          dlantrian.cetakAntrian();
        break;
      case 3:
        // Membuat pesanan baru dengan data input pengguna lalu dimasukkan ke array pesanan, jika size antrian dibawah jumlah maksimum array.
        Pesanan pesananBaru = new Pesanan();

        System.out.print("Kode Pesanan: ");
        pesananBaru.kodePesanan = sc1.nextInt();
        System.out.print("Nama Pesanan: ");
        pesananBaru.namaPesanan = sc2.nextLine();
        System.out.print("Harga: ");
        pesananBaru.harga = sc1.nextInt();

        if(size<pesanan.length){
          pesanan[size] = pesananBaru;
          rekap.tambahRekap(pesananBaru.namaPesanan);
          dlantrian.hapusAntrianDanPesan();
          size++;
        }else{
          System.out.println("Antrian Penuh!");
        }
        break;
      case 4:
        // Melakukan sorting pesanan dengan bubble sort lalu menampilkannya
        Pesanan[] sorted = pesanan;
        for (int i = 0; i < sorted.length-1; i++) {
          for (int j = 0; j < sorted.length-i-1; j++) {
            if(sorted[j] !=null && sorted[j+1] !=null){
            if(sorted[j].namaPesanan.compareToIgnoreCase(sorted[j+1].namaPesanan)>0){
              Pesanan temp = sorted[j];
              sorted[j] = sorted[j+1];
              sorted[j+1] = temp;
            }
            }
          }
        }
        for (Pesanan pesanan2 : sorted) {
          if(pesanan2!=null)
          System.out.println(pesanan2.kodePesanan + "\t" +pesanan2.namaPesanan+ "\t" +pesanan2.harga);
        }
        break;
      case 5:
        rekap.cetakRekap();
        break;
        default:
          System.out.println("Pilihan Tidak Valid");
        break;
    }
  }while (true);
  }
}
