package Praktikum05.src;

public class MahasiswaBerprestasi13 {
  Mahasiswa13[] listMhs = new Mahasiswa13[5];
  int idx;

  void tambah(Mahasiswa13 m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;
    } else {
      System.out.println("data sudah penuh");
    }
  }

  void tampil() {
    for (Mahasiswa13 m : listMhs) {
      m.tampilkanInformasi();
      System.out.println("-------------------");
    }
  }

  void bubbleSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
      for (int j = 1; j < listMhs.length - i; j++) {
        if (listMhs[j - 1].ipk < listMhs[j].ipk) {
          Mahasiswa13 temp = listMhs[j];
          listMhs[j] = listMhs[j - 1];
          listMhs[j - 1] = temp;
        }
      }
    }
  }
}
