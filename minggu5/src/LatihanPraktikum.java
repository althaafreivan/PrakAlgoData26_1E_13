package minggu5.src;

public class LatihanPraktikum {
  public static void main(String[] args) {
      double nilaiUTS[] = {78, 85, 90, 76, 92, 88, 80, 82};
      double nilaiUAS[] = {82, 88, 87, 79, 95, 85, 83, 84};

      System.out.println("a. Nilai tertinggi UTS: " + new NilaiPraktikum().hitungTertinggiDC(nilaiUTS, 0, nilaiUTS.length - 1));
      System.out.println("b. Nilai UTS terendah: " + new NilaiPraktikum().hitungTerendahDC(nilaiUTS, 0, nilaiUTS.length - 1));
      System.out.println("c. Rata-rata UAS: " + new NilaiPraktikum().hitungRataBF(nilaiUAS, nilaiUAS.length));
  }
}
