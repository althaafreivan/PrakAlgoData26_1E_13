package minggu2.src;

public class Mahasiswa13 {
  static String nim, nama, kelas;
  static double ipk;
  
  static void tampilkanInformasi(){
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("kelas" + kelas);
  }

  static void ubahKelas(String kelasBaru){
    kelas = kelasBaru;
  }
  static void updateIpk(double ipkBaru){  
    if(ipk>=0 && ipk<= 4.0) {ipk = ipkBaru;}
    else{System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");}
  }

  static String nilaiKinerja(double ipk){
    if(ipk>=3.5){
      return "Kinerja sangat baik";
    }else if(ipk>=3.0){
      return "Kinerja baik";
    }else if(ipk>=2.0){
      return "Kinerja Cukuo";
    }else{
      return "Kinerja Kurang";
    }
  }
}
