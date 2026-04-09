package Praktikum05.src;

public class SortingMain13 {
 public static void main(String[] args) {
  int a[] = {20, 10, 2, 7, 12};
  
  Sorting13 dataurut1 = new Sorting13(a, a.length);
  System.out.println("Data awal 1 ");
  dataurut1.tampil();
  dataurut1.bubbleSort();
  System.out.println("Data setelah diurutkan dengan BUBBLE SORT (ASC)");
  dataurut1.tampil();

  int b[] = {30, 20, 2, 8, 14};
  Sorting13 dataurut2 = new Sorting13(b, b.length);
  System.out.println("Data awal 2 ");
  dataurut2.tampil();
  dataurut2.SelectionSort();
  System.out.println("Data setelah diurutkan dengan SELECTION SORT (ASC)");
  dataurut2.tampil();

  int c[] = {40, 10, 4, 9, 3};
  Sorting13 dataurut3 = new Sorting13(c, c.length);
  System.out.println("Data awal 3 ");
  dataurut3.tampil();
  dataurut3.insertionSort();
  System.out.println("Data setelah diurutkan dengan INSERTION SORT (ASC)");
  dataurut3.tampil();
 }
}
