package minggu3.src;
import java.util.Scanner;

public class MatakuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jml = sc.nextInt();
        sc.nextLine(); 
        
        Matakuliah13[] arrayMatakuliah = new Matakuliah13[jml];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------");

            arrayMatakuliah[i] = new Matakuliah13(kode, nama, sks, jumlahJam);
        }

        // cetak hasil inputan
        for (int i = 0; i < jml; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayMatakuliah[i].cetakInfo();
        }
    }
}
