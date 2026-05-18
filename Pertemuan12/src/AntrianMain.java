package Pertemuan12.src;

import java.util.Scanner;

public class AntrianMain {
  public static void main(String[] args) {
    SLLAntrian sllAntrian = new SLLAntrian();
    sllAntrian.tresholdAntrian = 10;
    Scanner sc = new Scanner(System.in);
    int pilih = 0;

    do{
    System.out.println("1. Tambahkan Antrian");
    System.out.println("2. Cek antrian penuh");
    System.out.println("3. Panggil Antrian");
    System.out.println("4. Tampilkan antrian depan dan akhir");
    System.out.println("5. Tampilkan jumlah antrian");
    System.out.print("Pilihan: ");
    pilih = sc.nextInt();

    switch (pilih) {
      case 1:
        System.out.print("Nama: ");
        sc.nextLine();
        String nama = sc.nextLine();
        sllAntrian.tambahkanAntrian(nama);
        break;
      case 2:
        System.out.println(sllAntrian.cekAntrianPenuh()? "Antrian tidak penuh":"Antrian penuh");
        break;
      case 3:
         sllAntrian.memanggilAntrian();
        break;
      case 4:
        sllAntrian.tampilkanTerdepanTerakhir();
        break;
    
      case 5:
        System.out.println("Jumlah antrian: "+  sllAntrian.getJumlahAntrian());
        break;
      default:
        break;
    }
      
    }while(pilih!=0);
  }
}
