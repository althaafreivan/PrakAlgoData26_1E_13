package minggu3.src;
import java.util.Scanner;

public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int n = Integer.parseInt(sc.nextLine());
        Dosen13[] arrayDosen = new Dosen13[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W) : ");
            char jk = sc.nextLine().toUpperCase().charAt(0);
            boolean isPria = (jk == 'P');
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------");

            arrayDosen[i] = new Dosen13(kode, nama, isPria, usia);
        }

        DataDosen13 dd = new DataDosen13();
        dd.dataSemuaDosen(arrayDosen);
        dd.jumlahDosenPerJenisKelamin(arrayDosen);
        dd.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        dd.infoDosenPalingTua(arrayDosen);
        dd.infoDosenPalingMuda(arrayDosen);
    }
}
