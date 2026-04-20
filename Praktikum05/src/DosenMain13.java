package Praktikum05.src;

import java.util.Scanner;

public class DosenMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 data = new DataDosen13();
        int choice;

        do {
            System.out.println("=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Semua Dosen");
            System.out.println("3. Sorting ASC (Usia - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia - Selection Sort)");
            System.out.println("5. Sorting DSC (Usia - Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Kode         : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama         : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkStr = sc.nextLine();
                    Boolean jk = jkStr.equalsIgnoreCase("L");
                    System.out.print("Usia         : ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    data.tambah(new Dosen13(kode, nama, jk, usia));
                    break;
                case 2:
                    System.out.println("--- Data Seluruh Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    System.out.println("--- Sorting ASC (Bubble Sort) ---");
                    data.SortingASC();
                    data.tampil();
                    break;
                case 4:
                    System.out.println("--- Sorting DSC (Selection Sort) ---");
                    data.sortingDSC();
                    data.tampil();
                    break;
                case 5:
                    System.out.println("--- Sorting DSC (Insertion Sort) ---");
                    data.insertionSort();
                    data.tampil();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 6);

        sc.close();
    }
}
