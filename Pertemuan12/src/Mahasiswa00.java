package Pertemuan12.src;

public class Mahasiswa00 {
  String nim;
  String nama;
  String kelas;
  double ipk;

  Mahasiswa00(){

  }

  Mahasiswa00(String nm, String name, String kls, double ip)
  {
    nim = nm;
    nama = name;
    kelas = kls;
    ipk = ip;
  }

  public void tampilInformasi(){
    System.out.println( nama+"\t"+nim+"\t"+kelas+"\t"+ipk);
  }
}
