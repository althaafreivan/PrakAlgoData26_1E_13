import java.util.Scanner;

public class perulangan {
  public static void main(String[] args) {
    String NIM;
    Scanner sc = new Scanner(System.in);

    System.out.println("Inputkan NIM anda: ");
    NIM = sc.nextLine();
    
    String substring = NIM.length() > 2 ? NIM.substring(NIM.length() - 2) : NIM;
    int lastTwo = Integer.parseInt(substring); 
    if(lastTwo<10) lastTwo+=10;
    
    for(int i = 1; i<=lastTwo; i++){
      if(i==10 || i==15) continue;

      if (i%2 ==0 && i%3!=0) {
        System.out.print(i+" ");
        continue;
      }

      if (i>=3 && i%3==0) {
        System.out.print("# ");
        continue;
      }


      System.out.print("* ");
      
    }
  }
}
