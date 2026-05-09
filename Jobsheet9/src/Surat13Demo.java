public class Surat13Demo {
  public static void main(String[] args) {
    StackSurat13 stackSurat = new StackSurat13(5);
    StackKonversi stackKonversi = new StackKonversi();

    while(true){
      System.out.println("Menu:");
      System.out.println("1. Terima Surat Izin");
      System.out.println("2. Proses Surat Izin");
      System.out.println("3. Lihat Surat Izin Terakhir");
      System.out.println("4. Cari Surat Izin");
      System.out.println("5. Keluar");
      System.out.print("Pilih menu: ");
      int pilihan = new java.util.Scanner(System.in).nextInt();

      switch(pilihan){
        case 1:
          System.out.print("Masukkan ID Surat: ");
          String idSurat = new java.util.Scanner(System.in).nextLine();
          System.out.print("Masukkan Nama Mahasiswa: ");
          String namaMahasiswa = new java.util.Scanner(System.in).nextLine();
          System.out.print("Masukkan Kelas: ");
          String kelas = new java.util.Scanner(System.in).nextLine();
          System.out.print("Masukkan Jenis Izin (A/B/C): ");
          char jenisIzin = new java.util.Scanner(System.in).next().charAt(0);
          System.out.print("Masukkan Durasi (hari): ");
          int durasi = new java.util.Scanner(System.in).nextInt();

          Surat13 surat = new Surat13(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
          terimaSuratIzin(stackSurat, surat);
          break;
        case 2:
          prosesSuratIzin(stackSurat);
          break;
        case 3:
            lihatSuratIzinTerakhir(stackSurat);
          break;
        case 4:
          System.out.print("Masukkan Nama Mahasiswa yang ingin dicari: ");
          String namaCari = new java.util.Scanner(System.in).nextLine();
          cariSurat(stackSurat, namaCari);
          break;
        case 5:
          System.exit(0);
        default:
          System.out.println("Pilihan tidak valid");
      }
    }

  }

  public static void terimaSuratIzin(StackSurat13 stackSurat, Surat13 surat){
    stackSurat.push(surat);
  }

  public static void prosesSuratIzin(StackSurat13 stackSurat){
    if(!stackSurat.isEmpty()){
      Surat13 surat = stackSurat.pop();
      System.out.println("Memproses surat izin dari: " + surat.namaMahasiswa);
    } else {
      System.out.println("Tidak ada surat izin yang masuk");
    }
  }

  public static void lihatSuratIzinTerakhir(StackSurat13 stackSurat){
    if(!stackSurat.isEmpty()){
      Surat13 surat = stackSurat.peek();
      System.out.println("Surat izin terakhir yang masuk: " + surat.namaMahasiswa);
    } else {
      System.out.println("Tidak ada surat izin yang masuk");
    }
  }

  public static void cariSurat(StackSurat13 stackSurat, String namaMahasiswa){
    boolean found = false;
    for(int i = 0; i <= stackSurat.top; i++){
      if(stackSurat.stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)){
        System.out.println("Surat izin ditemukan!");
        System.out.println("ID Surat: " + stackSurat.stack[i].idSurat);
        System.out.println("Nama: " + stackSurat.stack[i].namaMahasiswa);
        System.out.println("Kelas: " + stackSurat.stack[i].kelas);
        System.out.println("Jenis: " + stackSurat.stack[i].jenisIzin);
        System.out.println("Durasi: " + stackSurat.stack[i].durasi + " hari");
        found = true;
        break;
      }
    }
    if(!found){
      System.out.println("Surat izin atas nama " + namaMahasiswa + " tidak ditemukan");
    }
  }
}
