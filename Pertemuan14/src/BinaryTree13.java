package Pertemuan14.src;

import java.util.Currency;

public class BinaryTree13 {
  Node13 root;
  
  BinaryTree13(){
    root = null;
  }

  public boolean isEmpty(){
    return root == null;
  }

  public void add(Mahasiswa13 mahasiswa){
    Node13 newNode = new Node13(mahasiswa);
    if(isEmpty()){
      root = newNode;
    }else{
      Node13 current = root;
      Node13 parent = null;
      while (true) {
        parent = current;
        if(mahasiswa.ipk<current.mahasiswa.ipk){
          current = current.left;
          if(current == null){
            parent.left = newNode;
            return;
          }
        }else{
          current = current.right;
          if(current == null){
            parent.right = newNode;
            return;
          }
        }
      }
    }
  }

  public void addRekursif(Mahasiswa13 mahasiswa) {
    root = addRekursif(root, mahasiswa);
  }

  private Node13 addRekursif(Node13 current, Mahasiswa13 mahasiswa) {
    if (current == null) {
      return new Node13(mahasiswa);
    }
    if (mahasiswa.ipk < current.mahasiswa.ipk) {
      current.left = addRekursif(current.left, mahasiswa);
    } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
      current.right = addRekursif(current.right, mahasiswa);
    }
    return current;
  }

  public void cariMinIPK() {
    if (isEmpty()) {
      System.out.println("Tree kosong");
      return;
    }
    Node13 current = root;
    while (current.left != null) {
      current = current.left;
    }
    System.out.print("Mahasiswa dengan IPK terkecil: ");
    current.mahasiswa.tampilInformasi();
  }

  public void cariMaxIPK() {
    if (isEmpty()) {
      System.out.println("Tree kosong");
      return;
    }
    Node13 current = root;
    while (current.right != null) {
      current = current.right;
    }
    System.out.print("Mahasiswa dengan IPK terbesar: ");
    current.mahasiswa.tampilInformasi();
  }

  public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    tampilMahasiswaIPKdiAtas(root, ipkBatas);
  }

  private void tampilMahasiswaIPKdiAtas(Node13 node, double ipkBatas) {
    if (node != null) {
      tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
      if (node.mahasiswa.ipk > ipkBatas) {
        node.mahasiswa.tampilInformasi();
      }
      tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
    }
  }

  public boolean find(double ipk){
    Node13 current = root;
    while (current != null) {
      if(current.mahasiswa.ipk == ipk){
        return true;
      }else if(ipk > current.mahasiswa.ipk){
        current = current.right;
      }else{
        current = current.left;
      }
    }
    return false;
  }

  public void traversePreOrder(Node13 node){
    if(node!=null){
      node.mahasiswa.tampilInformasi();
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  public void traverseInOrder(Node13 node){
    if(node!=null){
      traverseInOrder(node.left);
      node.mahasiswa.tampilInformasi();
      traverseInOrder(node.right);
    }
  }

  public void traversePostOrder(Node13 node){
    if(node!=null){
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      node.mahasiswa.tampilInformasi();
    }
  }

  public Node13 getSuccessor(Node13 del){
    Node13 successor = del.right;
    Node13 successorParent = del;
    while (successor.left != null) {
      successorParent = successor;
      successor = successor.left;
    }
    if(successor!=del.right){
      successorParent.left = successor.right;
      successor.right = del.right;
    }
    return successor;
  }

  public void delete(double ipk){
    if(isEmpty()){
      System.out.println("Binary tree kosong");
      return;
    }

    //Cari node (current) yang akan dihapus
    Node13 parent = root;
    Node13 current = root;
    boolean isLeftChild = false;
    while (current != null) {
      if(current.mahasiswa.ipk == ipk){
        break;
      }else if(ipk < current.mahasiswa.ipk){
        parent = current;
        current = current.left;
        isLeftChild = true;
      }else{
        parent = current;
        current = current.right;
        isLeftChild = false;
      }
    }

    if(current == null){
      System.out.println("Data tidak ditemukan");
      return;
    }else{
      if(current.left == null && current.right == null){
        if(current == root){
          root = null;
        }else{
          if(isLeftChild){
            parent.left = null;
          }else{
            parent.right = null;
          }
        }
      }else if(current.left == null){
        if(current == root){
          root = current.right;
        }else{
          if(isLeftChild){
            parent.left = current.right;
          }else{
            parent.right = current.right;
          }
        }
      }else if(current.right == null){
        if(current == root){
          root = current.left;
        }else{
          if(isLeftChild){
            parent.left = current.left;
          }else{
            parent.right = current.left;
          }
        }
      }else{
        Node13 successor = getSuccessor(current);
        System.out.println("Jika 2 anak, current = ");
        successor.mahasiswa.tampilInformasi();
        if(current == root){
          root = successor;
        }else{
          if(isLeftChild){
            parent.left = successor;
          }else{
            parent.right = successor;
          }
        }

        successor.left = current.left;
      }
    }
  }
}
