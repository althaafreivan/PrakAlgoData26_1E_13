import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class MahasiswaDemo13 {
  public static void main(String[] args) {
    StackTugasMahasiswa13 stack = new StackTugasMahasiswa13(5);
    int pilih = 0;
    Scanner mhsScanner = new Scanner(System.in);

    do{
      System.out.println("\nMenu:");
      System.out.println("1. Mengumpulkan tugas");
      System.out.println("2. Menilai Tugas");
      System.out.println("3. Melihat Tugas Teratas");
      System.out.println("4. Melihat Tugas Terbawah");
      System.out.println("5. Melihat Jumlah Tugas");
      System.out.println("6. Melihat Daftar Tugas");
      System.out.print("Pilih: ");

      pilih = mhsScanner.nextInt();
      mhsScanner.nextLine(); 

      switch (pilih) {
        case 1:
          System.out.print("Nama: ");
          String nama = mhsScanner.nextLine();
          System.out.print("NIM: ");
          String nim = mhsScanner.nextLine();
          System.out.print("Kelas: ");
          String kelas = mhsScanner.nextLine();
          Mahasiswa13 mhs = new Mahasiswa13(nama, nim, kelas);
          stack.push(mhs);
          System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
          break;

        case 2:
          Mahasiswa13 dinilai = stack.pop();
          if(dinilai != null){
            System.out.println("Menilai tugas dari " + dinilai.nama);
            System.out.print("Masukkan nilai (0-100)" + ": ");
            int nilai = mhsScanner.nextInt();
            dinilai.tugasDinilai(nilai);
            System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, dinilai.nilai);
            String biner = stack.konversiDesimalKeBiner(dinilai.nilai);
            System.out.println("Nilai Biner Tugas: " + biner);
          }
          break;

        case 3:
          Mahasiswa13 lihat = stack.peek();
          if(lihat != null){
            System.out.println("Tugas terakhir dikumpulkan oleh: " + lihat.nama);
          }
          break;
        case 4:
          Mahasiswa13 lihatBawah = stack.peekBottom();
          if(lihatBawah != null){
            System.out.println("Tugas pertama dikumpulkan oleh: " + lihatBawah.nama);
          }
          break;
        case 5:
          System.out.println("Jumlah tugas: " + stack.hitungTugas());
          break;
        case 6:
          System.out.println("Daftar Semua Tugas:");
          System.out.println("Nama\tNIM\tKelas");
          stack.print();
          break;

        default:
          System.out.println("Pilihan tidak valid");
      }
    } while (pilih != 0);
  }
}
