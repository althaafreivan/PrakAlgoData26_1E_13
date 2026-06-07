package Pertemuan14.src;

public class BinaryTreeArrayMain13 {
  public static void main(String[] args) {
    BinaryTreeArray13 bta = new BinaryTreeArray13();
  Mahasiswa13 mhs1 = new Mahasiswa13("244160121", "Ali", "A", 3.57);
    Mahasiswa13 mhs2 = new Mahasiswa13("244160221", "Badar", "B", 3.85);
    Mahasiswa13 mhs3 = new Mahasiswa13("244160185", "Candra", "C", 3.21);
    Mahasiswa13 mhs4 = new Mahasiswa13("244160220", "Dewi", "B", 3.54);

    Mahasiswa13 mhs5 = new Mahasiswa13("244160131", "Devi", "A", 3.72);
    Mahasiswa13 mhs6 = new Mahasiswa13("244160205", "Ehsan", "D", 3.37);
    Mahasiswa13 mhs7 = new Mahasiswa13("244160170", "Fizi", "B", 3.46);


    Mahasiswa13[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
    int idxLast = 6;
    bta.populateData(dataMahasiswas, idxLast);
    System.out.println("\nInorder Traversal Mahasiswa: ");
    bta.traverseInOrder(0);
    
    System.out.println("\n--- Testing Tugas Praktikum ---");
    Mahasiswa13 mhs8 = new Mahasiswa13("244160300", "Gita", "A", 3.90);
    System.out.println("Menambahkan mahasiswa baru ke Array Tree:");
    bta.add(mhs8);
    
    System.out.println("\nPreOrder Traversal Mahasiswa: ");
    bta.traversePreOrder(0);
  }
}
