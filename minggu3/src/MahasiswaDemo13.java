package minggu3.src;
import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa13[] arrayOfMahasiswa = new Mahasiswa13[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa13();

            System.out.println("Masukkan Data Mahasiwa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");
        }

        // cetak hasil inputan
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}
