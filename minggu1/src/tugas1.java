import java.util.Scanner;

public class tugas1 {
  public static void main(String[] args) {
    char[] KODE = new char[]{
      'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
    };

    char[][] KOTA = new char[][]{
      {'B','A','N','T','E','N'},
      {'J','A','K','A','R','T','A'},
      {'B','A','N','D','U','N','G'},
      {'C','I','R','E','B','O','N'},
      {'B','O','G','O','R'},
      {'P','E','K','A','L','O','N','G','A','N'},
      {'S','E','M','A','R','A','N','G'},
      {'S','U','R','A','B','A','Y','A'},
      {'M','A','L','A','N','G'},
      {'T','E','G','A','L'}
    };

    char selection = ' ';
    int selected = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Inputkan Kode Plat: ");
    selection = sc.next().toCharArray()[0];
    
    for (int i = 0; i < KOTA.length; i++) {
      if(KODE[i] == selection) selected = i;
    }
    
    System.out.print("Kota: ");
    for (char cs : KOTA[selected]) {
      System.out.print(cs);
    }
  }
}
