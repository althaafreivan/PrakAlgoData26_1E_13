package CM2;

public class NodeRekap {
  Rekap rekap;
  NodeRekap prev;
  NodeRekap next;

  public NodeRekap(Rekap rekap){
    this.rekap = rekap;
    this.next = null;
    this.prev = null;
  }
}
