import java.util.Scanner;

public class pemilihan {
  static float nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
  static float rasioNilaiTugas =.2f, rasioNilaiKuis = .2f, rasioNilaiUTS = .3f, rasioNilaiUAS =.4f;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==========================");
    do{
        System.out.print("Inputkan Nilai Tugas: ");
        nilaiTugas = sc.nextFloat();
        if(nilaiTugas<0 || nilaiTugas>100) System.out.println("Nilai Tidak Valid");
        System.out.println("==========================");
    }while(nilaiTugas<0 || nilaiTugas>100);
    do{
        System.out.print("Inputkan Nilai Kuis: ");
        nilaiKuis = sc.nextFloat();
        if(nilaiKuis<0 || nilaiKuis>100) System.out.println("Nilai Tidak Valid");
            System.out.println("==========================");
    }while(nilaiKuis<0 || nilaiKuis>100);
    do{
    System.out.print("Inputkan Nilai UTS: ");
    nilaiUTS = sc.nextFloat();
            if(nilaiUTS<0 || nilaiUTS>100) System.out.println("Nilai Tidak Valid");
                System.out.println("==========================");
    }while(nilaiUTS<0 || nilaiUTS>100);
    do{
    System.out.print("Inputkan Nilai UAS: ");
    nilaiUAS = sc.nextFloat();
            if(nilaiUAS<0 || nilaiUAS>100) System.out.println("Nilai Tidak Valid");
                System.out.println("==========================");
    }while(nilaiUAS<0 || nilaiUAS>100);
    System.out.println("==========================");
    float nilaiFinal = (nilaiTugas*rasioNilaiTugas)+(nilaiKuis*rasioNilaiKuis)+(nilaiUTS*rasioNilaiUTS)+(nilaiUAS*rasioNilaiUAS);
    String nilaiHuruf = konversiHuruf13(nilaiFinal);

    System.out.println("Nilai Akhir: "+nilaiFinal);
    System.out.println("Nilai Huruf: "+nilaiHuruf);
        System.out.println("==========================");
    System.out.println("Keterangan: " + (nilaiHuruf =="D" || nilaiHuruf == "E" ? "Sayang Sekali Tidak Lulus" : "SELAMAT ANDA LULUS"));

}

  
  public static String konversiHuruf13(double nilai13){
        String nilaiHuruf13;        
            if(nilai13 > 80 && nilai13 <=100){
                nilaiHuruf13 = "A";
            }else if (nilai13 > 73 && nilai13 <=80){
                nilaiHuruf13 = "B+";
            }else if (nilai13 > 65 && nilai13 <=73){
                nilaiHuruf13 = "B";
            }else if (nilai13 > 60 && nilai13 <=65){
                nilaiHuruf13 = "C+";
            }else if (nilai13 > 50 && nilai13 <=60){
                nilaiHuruf13 = "C";
            }else if (nilai13 > 39 && nilai13 <=50){
                nilaiHuruf13 = "D";
            }else if (nilai13 < 39){
                nilaiHuruf13 = "E";
            }else{
                nilaiHuruf13 = "";
                return null;
            }
        return nilaiHuruf13;
    }
}
