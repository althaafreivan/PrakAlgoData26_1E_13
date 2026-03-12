package Quiz1;

public class LaporanKeuangan {
    // Deklarasi Variable
    String namaPerusahaan;
    double pendapatanBulanan;
    double biayaOperasional;

    // Method HitungKeuntungan dengan tipe data double untuk mengembalikan value yang sudah dihitung.
    public double hitungKeuntungan(){
      return pendapatanBulanan-biayaOperasional;
    };
    
    // Method void hanya untuk menampilkan data.
    public void printData(){
      System.out.println(" Perusahaan " + namaPerusahaan +" Memiliki keuntungan sebesar: ");
      System.out.println(hitungKeuntungan());
    }
}
