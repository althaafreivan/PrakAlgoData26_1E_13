package CM2;

public class DoubleLinkedListAntrian {
  // Deklarasi node head dan tail
  Node head;
  Node tail;

  public DoubleLinkedListAntrian(){
    this.head = null;
    this.tail = null;
  }

  public boolean isEmpty(){
    // Jika head kosong, maka return true
    return head==null;
  }

  public int tambahAntrean(Pembeli pembeli){
    // Menggunakan argument objek pembeli untuk membuat node pembeli yang akan dimasukkan kedalam linked list.
    Node nodePembeli = new Node(pembeli);

    // Jika linkedlist masih kosong, maka nodenya akan jadi head sekaligus tail dan return antrian pertama/1.
    if(isEmpty()){
        head = tail = nodePembeli;
        return 1;
    }
    else{
      // Jika tidak, maka node setelah tail yang masih null akan diarahkan ke nodePembeli, lalu prev dari nodePembeli akan mengarah ke tail sebelumnya dan sesudahnya nodePembeli akan menjadi tail baru.
      tail.next = nodePembeli;
      nodePembeli.prev = tail;
      tail = nodePembeli;

      // Menghitung antrean untuk dikembalikan
      int antrean = 1;
      Node tmp = head;
      while (tmp!=tail) {
        antrean++;
        tmp = tmp.next;
      }
      return antrean;
    }
  }

  // Mencetak antrean dengan perulangan sederhana
  public void cetakAntrian(){
    if(isEmpty()){
      System.out.println("Antrian Kosong.");
      return;
    }
    
    Node tmp = head;
    int antrean = 1;
    System.out.println("No Antrian\tNama\tNo HP");
    while (tmp!=null) {
      System.out.println(antrean+"\t"+tmp.pembeli.namaPembeli13+"\t"+tmp.pembeli.NoHp13);
      tmp = tmp.next;
      antrean++;
    }
  }

  public void hapusAntrianDanPesan(){
    // Jika kosong, maka output dan langsung kembali
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return;
    }

    // Jika head == tail, maka kosongkan dua-duanya
    if(head==tail){
      head = null;
      tail = null;
    }else{
    // Jika tidak, maka head akan dilanjutkan ke node selanjutnya dan previous akan menjadi null.
    head = head.next;
    head.prev = null;  
    }
  }

}
