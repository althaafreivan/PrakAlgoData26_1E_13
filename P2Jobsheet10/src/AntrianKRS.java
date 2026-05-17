package P2Jobsheet10.src;

public class AntrianKRS {
  Mahasiswa[] data;
  int front;
  int rear;
  int size;
  int max;
  int sdhKRS;
  int totalDPA = 30;

  public AntrianKRS(int n){
    max = n;
    data = new Mahasiswa[max];
    size = 0;
    front = 0;
    rear = -1;
    sdhKRS = 0;
  }

  public boolean isFull(){
    return size == max;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public void tambahAntrian(Mahasiswa mhs){
    if(isFull()){
      System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
      return;
    }
    rear = (rear + 1) % max;
    data[rear] = mhs;
    size++;
    System.out.println(mhs.nama + " Berhasil masuk ke antrian");
  }

  public void layaniKRS(){
    if(isEmpty()){
      System.out.println("Antrian kosong.");
      return;
    }
    int jumlahLayani = (size >= 2) ? 2 : 1;
    System.out.println("Melayani " + jumlahLayani + " mahasiswa untuk proses KRS:");
    for(int i = 0; i < jumlahLayani; i++){
      Mahasiswa mhs = data[front];
      front = (front + 1) % max;
      size--;
      sdhKRS++;
      mhs.tampilkanData();
    }
  }

  public void lihatTerdepan(){
    if(isEmpty()){
      System.out.println("Antrian kosong.");
    }else{
      System.out.println("Mahasiswa terdepan: ");
      data[front].tampilkanData();
    }
  }

  public void lihat2Terdepan(){
    if(isEmpty()){
      System.out.println("Antrian kosong.");
    } else {
      int limit = (size >= 2) ? 2 : 1;
      System.out.println(limit + " Mahasiswa terdepan: ");
      for(int i = 0; i < limit; i++){
        int index = (front + i) % max;
        data[index].tampilkanData();
      }
    }
  }

  public void tampilkanSemua(){
    if(isEmpty()){
      System.out.println("Antrian kosong");
      return;
    }
    System.out.println("Daftar Mahasiswa dalam Antrian: ");
    for (int i = 0; i < size; i++) {
      int index = (front + i) % max;
      System.out.print((i+1) + ". ");
      data[index].tampilkanData();
    }
  }

  public void lihatAkhir(){
    if(isEmpty()){
      System.out.println("Antrian kosong.");
    }else{
      System.out.println("Mahasiswa paling belakang: ");
      data[rear].tampilkanData();
    }
  }

  public void cetakStatus(){
    System.out.println("1. Jumlah mahasiswa dalam antrian: " + size);
    System.out.println("2. Jumlah mahasiswa yang sudah melakukan proses KRS: " + sdhKRS);
    System.out.println("3. Jumlah mahasiswa yang belum melakukan proses KRS (Sisa Kuota DPA): " + (totalDPA - sdhKRS));
    
    if (isEmpty()) {
      System.out.println("Status Antrian: KOSONG");
    } else if (isFull()) {
      System.out.println("Status Antrian: PENUH");
    } else {
      System.out.println("Status Antrian: Tersedia (" + (max - size) + " slot)");
    }
  }

  public void clear(){
    front = 0;
    rear = -1;
    size = 0;
    System.out.println("Queue berhasil dikosongkan");
  }
}
