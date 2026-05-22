package CM2;

public class LinkedListRekap {
  NodeRekap head;
  NodeRekap tail;

  // Linkedlist Rekap
  public LinkedListRekap(){
    this.head = null;
    this.tail = null;
  }

    public boolean isEmpty(){
    // Jika head kosong, maka return true
    return head==null;
  }

    public void tambahRekap(String rekap){
    // Menggunakan argument objek Rekap untuk membuat node pembeli yang akan dimasukkan kedalam linked list.
    NodeRekap nodeRekap = new NodeRekap(new Rekap());
    nodeRekap.rekap.namaPesanan = rekap;

    // Jika linkedlist masih kosong, maka nodenya akan jadi head sekaligus tail dan return antrian pertama/1.
    if(isEmpty()){
       nodeRekap.rekap.jumlah = 1;  
        head = tail = nodeRekap;
        System.out.println("Data masih kosong");
        return;
    }
    else{
      // Jika tidak, maka node setelah tail yang masih null akan diarahkan ke nodePembeli, lalu prev dari nodePembeli akan mengarah ke tail sebelumnya dan sesudahnya nodePembeli akan menjadi tail baru.
      NodeRekap tmpAppend = head;
      do{
        if(rekap.equalsIgnoreCase(tmpAppend.rekap.namaPesanan)){
          tmpAppend.rekap.jumlah++;
          return;
        }
        tmpAppend = tmpAppend.next;
      }while(tmpAppend!=null);

      tail.next = nodeRekap;
      nodeRekap.prev = tail;
      tail = nodeRekap;
      return;
    }
  }

  // Mencetak Rekap
    public void cetakRekap(){
    if(isEmpty()){
      System.out.println("Antrian Kosong.");
      return;
    }
    
    NodeRekap tmp = head;
    int antrean = 1;

    int total = 0;

    do{
      total++;
      tmp = tmp.next;
    }while(tmp!=null);

    System.out.println("no.\tPesanan\tJumlah");
    while (tmp!=null) {
      System.out.println(antrean+"\t"+tmp.rekap.namaPesanan+"\t"+tmp.rekap.jumlah);
      tmp = tmp.next;
      antrean++;
    }
  }
}
