package P1Jobsheet10.src;

import java.util.Scanner;

public class QueueMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan kapasitas queue: ");
    int n = sc.nextInt();
    int pilih = 0;

    Queue13 q = new Queue13(n);

    do{
      menu();
      pilih = sc.nextInt();

      switch (pilih) {
        case 1:
            System.out.println("Masukkan data baru: ");
            int dataMasuk = sc.nextInt();
            q.enqueue(dataMasuk);
          break;
        case 2:
            int dataKeluar = q.dequeue();
            if (dataKeluar!=0){
              System.out.println("Data yang dikeluarkan: " + dataKeluar);
              break;
            }
            break;
        case 3:
          q.print();
          break;
        case 4:
          q.peek();
          break;
        case 5:
          q.clear();
          break;
        default:
          break;
      }
    }while (pilih>0 && pilih <6);
  }

  public static void menu(){
    System.out.println("Masukkan operasi yang diinginkan: ");
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Print");
    System.out.println("4. Peek");
    System.out.println("5. Clear");
    System.out.println("-----------");
  }
}
