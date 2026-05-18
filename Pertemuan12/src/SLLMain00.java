package Pertemuan12.src;

import java.util.Scanner;

public class SLLMain00 {
  public static void main(String[] args) {
    SingleLinkedList00 sll = new SingleLinkedList00();
    
    Mahasiswa00 mhs1 = new Mahasiswa00("21212203", "Dirga", "4D", 3.2);
    Mahasiswa00 mhs2 = new Mahasiswa00("21212204", "Cintia", "3B", 3.3);
    Mahasiswa00 mhs3 = new Mahasiswa00("21212205", "Bimon", "2C", 3.4);
    Mahasiswa00 mhs4 = new Mahasiswa00("21212206", "Alvaro", "1A", 3.5);
  
    sll.print();
    sll.addFirst(mhs4);
    sll.print();
    sll.addLast(mhs1);
    sll.print();
    sll.insertAfter("Dirga", mhs3);
    sll.inserAt(2, mhs2);
    sll.print();

    System.out.println("data mahasiswa an Bimon berada pada index: "+sll.indexOf("Bimon"));
    System.out.println();

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();
    /* Modifikasi tambahan
    Scanner sc = new Scanner( System.in);
    System.out.print("Jumlah data: ");
    SingleLinkedList00 sll1 = addNewData(sc.nextInt());
    sll1.print();
   */
    }

 /* Modifikasi tambahan
  public static SingleLinkedList00 addNewData(int n){
    SingleLinkedList00 sll1 = new SingleLinkedList00();

    for (int i = 0; i < n; i++) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Masukkan data mahasiswa ke-" + (i+1));
    Mahasiswa00 newMhs = new Mahasiswa00();
    System.out.print("NIM: "); 
    newMhs.nim= sc1.nextLine();
    System.out.print("Nama: ");
    newMhs.nama= sc1.nextLine();
    System.out.print("Kelas: ");
    newMhs.kelas= sc1.nextLine();
    System.out.print("IPK: ");
    newMhs.ipk = sc1.nextDouble();
    sll1.addLast(newMhs);
    }
    
    return sll1;
  } */
}
