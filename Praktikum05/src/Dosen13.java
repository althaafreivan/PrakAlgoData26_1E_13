package Praktikum05.src;

public class Dosen13 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen13(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia);
        System.out.println("---------------------------");
    }
}
