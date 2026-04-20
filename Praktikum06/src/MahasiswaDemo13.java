package Praktikum06.src;

import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("---------------------------");

            Mahasiswa13 m = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("---------------------------");
        System.out.println("Pencarian data (Sequential Search)");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        System.out.println("---------------------------");
        System.out.println("Pencarian data (Binary Search)");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cariBinary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Menggunakan binary search");
        int posisiBinary = list.findBinarySearch(cariBinary, 0, jumMhs - 1);
        list.tampilPosisi(cariBinary, posisiBinary);
        list.tampilDataSearch(cariBinary, posisiBinary);

        sc.close();
    }
}
