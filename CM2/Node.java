package CM2;

public class Node {
  Pembeli pembeli;
  Node prev;
  Node next;

  public Node(Pembeli pembeli){
    this.pembeli = pembeli;
    this.next = null;
    this.prev = null;
  }
}
