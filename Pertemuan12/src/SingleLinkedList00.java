package Pertemuan12.src;

public class SingleLinkedList00 {
  Node00 head;
  Node00 tail;

  boolean isEmpty(){
    return (head==null);
  }

  public void print(){
    if(!isEmpty()){
      Node00 tmp = head;
      System.out.println("Isi linked List:\t");
      while (tmp!=null) {
        tmp.data.tampilInformasi();
        tmp = tmp.next;
      }
      System.out.println("");
    }
  }

  public void addFirst(Mahasiswa00 input){
    Node00 ndInput = new Node00(input, null);
    if(isEmpty()){
      head = ndInput;
      tail = ndInput;
    }else{
      ndInput.next = head;
      head = ndInput;
    }
  }

  public void addLast(Mahasiswa00 input){
    SingleLinkedList00 tmp = this;
    Node00 ndInput = new Node00(input, null);
    if(isEmpty()){
      head = ndInput;
      tail = ndInput;
    }else{
      tail.next = ndInput;
      tail = ndInput;
    }
  }

  public void insertAfter(String key, Mahasiswa00 input){
    Node00 ndInput = new Node00(input, null);
    Node00 tmp = head;

    do{
      if (tmp.data.nama.equalsIgnoreCase(key)) {
        ndInput.next = tmp.next;
        tmp.next = ndInput;
        if(ndInput.next == null){
          tail = ndInput;
        }
        break;
      }
      tmp = tmp.next;
    }while (tmp!=null);
  }

  public void inserAt(int index, Mahasiswa00 input){
    if(index<0){
      System.out.println("Indeks salah");
    }else if(index==0){
      addFirst(input);
    }else{
      Node00 temp = head;
      for (int i = 0; i < index-1; i++) {
        temp = temp.next;
      }
      temp.next = new Node00(input, temp.next);
      if(temp.next.next == null){
        tail = temp.next;
      }
    }
  }

  public void getData(int index){
    Node00 tmp = head;

    for (int i = 0; i < index; i++) {
      tmp = tmp.next;
    }
    tmp.data.tampilInformasi();
  }

  public int indexOf(String Key){
    Node00 tmp = head;
    int index = 0;
    while (tmp != null && !tmp.data.nama.equalsIgnoreCase(Key)) {
      tmp = tmp.next;
      index++;
    }

    if(tmp == null){
      return -1;
    }else{
      return index;
    }
  }

  public void removeFirst(){
    if(isEmpty()){
      System.out.println("Linked List masih kosong, tidak dapat dihapus!");
    }else if (head == tail){
      head = tail = null;
    }else{
      head = head.next;
    }
  }

  public void removeLast(){
    if(isEmpty()){
      System.out.println("Linked list masih kosong, tidak dapat dihapus!");
    }else{
      Node00 temp = head;
      while (temp.next != tail) {
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
    }
  }

  public void remove(String key){
    Node00 temp = head;
    if(isEmpty()){
      System.out.println("Linkedlist masih ksoong, tidak dapat dihapus!");
    }else{
      while (temp != null) {
        if((temp.data.nama.equalsIgnoreCase(key) && (temp == head))){
          this.removeFirst();
          break;
        } else if(temp.data.nama.equalsIgnoreCase(key)){
          temp.next = temp.next.next;
          if(temp.next == null){
            tail = temp;
          }
          break;
        }
        temp = temp.next;
      }
    }
  }

  public void removeAt(int index){
    if(index == 0){
      removeFirst();
    }else{
      Node00 temp = head;

      for (int i = 0; i < index-1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
      if(temp.next == null){
        tail = temp;
      }
    }
  }
}
