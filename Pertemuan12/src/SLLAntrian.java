package Pertemuan12.src;

public class SLLAntrian {
  NodeAntrian head;
  NodeAntrian tail;
  int tresholdAntrian;

  public void tambahkanAntrian(String nama){
    if(cekAntrianPenuh()){
      System.out.println("Antrian penuh, mohon tunggu mahasiswa dilayani.");
      return;
    }

    if(head==null) {
      head = tail = new NodeAntrian(nama, null);
    }else{
      NodeAntrian tmp = head;
      while(tmp.next!=null){
        tmp = tmp.next;
      }
      tmp.next = tail = new NodeAntrian(nama, null);
    }

    System.out.println("Berhasil ditambahkan!");
  }

  public void memanggilAntrian(){
    if(cekAntrianKosong()) return;

    System.out.println("Memanggil antrian dengan nama " + head.nama);
    head = head.next;

  }

  public boolean cekAntrianKosong(){
    return (head==null );
  }

  public boolean cekAntrianPenuh(){
    if(cekAntrianKosong()){
      return false;
    }

    NodeAntrian tmp = head;
    int i = 0;
    for (; i < tresholdAntrian-1; i++) {
      if(tmp.next == null) break;
    }

    return i>=tresholdAntrian-1;
  }

  public void kosongkanAntrian(){
    head  = tail = null;
  }
  
  public void tampilkanTerdepanTerakhir(){
    if(cekAntrianKosong()) return;
    System.out.println("Terdepan : " + head.nama);
    System.out.println("Terakhir : " + tail.nama);
  }

  public int getJumlahAntrian(){
    int i = 0;
    NodeAntrian tmp = head;
    while (tmp != null) {
      i++;
      tmp = tmp.next;
    }
    return i;
  }
}
