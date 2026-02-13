import java.util.Scanner;

public class tugas2 {
  static String[][] jadwal;
  static String[] Header;
  static Scanner scInt = new Scanner(System.in), scString = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.print("Jumlah Jadwal: ");
    int amount = scInt.nextInt();
    
    Header = new String[]{
      "Nama Mata Kuliah",
      "Ruang",
      "Hari Kuliah",
      "Jam Kuliah"
    };

    jadwal = new String[amount][4];

    menu();
  }

  public static void menu(){
    int selectedMenu = 0;
    System.out.println("Menu");
    System.out.println("1. Input Data Jadwal Kuliah");
    System.out.println("2. Tampilkan Seluruh Jadwal Kuliah");
    System.out.println("3. Tampilkan Jadwal Kuliah Berdasarkan Hari");
    System.out.println("4. Tampilkan Jadwal Kuliah Berdasarkan Nama Mata Kuliah");

    selectedMenu = scInt.nextInt();
    switch (selectedMenu) {
      case 1:
        storeDataJadwal();
        break;
      case 2:
        showJadwal();
        break;
      case 3:
        showJadwalBerdasarkanHari();
        break;
      case 4:
        showJadwalBerdasarkanNamaMatkul();
        break;
    
      default:
        return;
    }
  }

   public static void showJadwal() {
      String var0 = "%-4s %-32s %-12s %-12s %-12s";
      System.out.println("==============================================================================");
      System.out.println("SELURUH JADWAL KULIAH");
      System.out.println("==============================================================================");
      System.out.printf(var0, "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
      System.out.println();
      System.out.println("------------------------------------------------------------------------------");

      for(int var1 = 0; var1 < jadwal.length; ++var1) {
         if (jadwal[var1][0] != null) {
            System.out.printf(var0, var1 + 1 + ".", jadwal[var1][0], jadwal[var1][1], jadwal[var1][2], jadwal[var1][3]);
            System.out.println();
         }
      }

      System.out.println("==============================================================================");
      System.out.println();
      menu();
   }

   public static void showJadwalBerdasarkanHari() {
      System.out.print("Masukkan Hari Kuliah yang dicari: ");
      String var0 = scString.nextLine();
      String var1 = "%-4s %-32s %-12s %-12s %-12s";
      boolean var2 = false;
      System.out.println("==============================================================================");
      System.out.println("JADWAL KULIAH HARI " + var0.toUpperCase());
      System.out.println("==============================================================================");
      System.out.printf(var1, "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
      System.out.println();
      System.out.println("------------------------------------------------------------------------------");

      for(int var3 = 0; var3 < jadwal.length; ++var3) {
         if (jadwal[var3][2] != null && jadwal[var3][2].equalsIgnoreCase(var0)) {
            System.out.printf(var1, var3 + 1 + ".", jadwal[var3][0], jadwal[var3][1], jadwal[var3][2], jadwal[var3][3]);
            System.out.println();
            var2 = true;
         }
      }

      if (!var2) {
         System.out.println("Jadwal pada hari " + var0 + " tidak ditemukan.");
      }

      System.out.println("==============================================================================");
      System.out.println();
      menu();
   }

   public static void showJadwalBerdasarkanNamaMatkul() {
      System.out.print("Masukkan Nama Mata Kuliah yang dicari: ");
      String var0 = scString.nextLine();
      String var1 = "%-4s %-32s %-12s %-12s %-12s";
      boolean var2 = false;
      System.out.println("==============================================================================");
      System.out.println("HASIL PENCARIAN MATA KULIAH: " + var0.toUpperCase());
      System.out.println("==============================================================================");
      System.out.printf(var1, "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
      System.out.println();
      System.out.println("------------------------------------------------------------------------------");

      for(int var3 = 0; var3 < jadwal.length; ++var3) {
         if (jadwal[var3][0] != null && jadwal[var3][0].equalsIgnoreCase(var0)) {
            System.out.printf(var1, var3 + 1 + ".", jadwal[var3][0], jadwal[var3][1], jadwal[var3][2], jadwal[var3][3]);
            System.out.println();
            var2 = true;
         }
      }

      if (!var2) {
         System.out.println("Mata Kuliah " + var0 + " tidak ditemukan.");
      }

      System.out.println("==============================================================================");
      System.out.println();
      menu();
   }

  public static void storeDataJadwal(){
    int selectedJadwal = 0;
    System.out.print("Masukkan Jadwal Dengan Rentang 1-" + jadwal.length+ " : ");
    selectedJadwal = scInt.nextInt() -1;

    for (int i = 0; i < Header.length; i++) {
      System.out.print(Header[i] + ": ");
      jadwal[selectedJadwal][i] = scString.nextLine();
    }
    System.out.println("Jadwal Berhasil Diinput");
    System.out.println();
    menu();
  }
}
