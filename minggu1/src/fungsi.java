import java.util.Formatter;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class fungsi {
  static String cabang[] = new String[]{
      "RoyalGarden 1",
      "RoyalGarden 2",
      "RoyalGarden 3",
      "RoyalGarden 4"
    };
    
   static String tipe[] = new String[]{
      "Aglonema",
      "Keladi",
      "Alocasia",
      "Mawar"
   };

   static int[][] penjualan = new int[][]{
   {10, 6, 2, 5},
    {5, 11, 10, 7},
    {15, 9, 10, 12},
    {7, 12, 5, 9}
   };

   static int[] harga = new int[]{
    75000, 50000, 60000, 10000
   };
  
  public static void main(String[] args) {
    pendapatanCabangs();
  }

  public static void pendapatanCabangs(){
    DecimalFormat id = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    formatRp.setCurrencySymbol("Rp ");
    formatRp.setMonetaryDecimalSeparator(',');
    formatRp.setGroupingSeparator('.');

    id.setDecimalFormatSymbols(formatRp);

    for (int i = 0; i < cabang.length; i++) {
      float totalPendapatan = 0;
      System.out.println(cabang[i]);
      for (int j = 0; j < penjualan[i].length; j++) {
        totalPendapatan += penjualan[j][i]*harga[j]; 
      }
      System.out.println("Pendapatan: " + id.format(totalPendapatan));
      System.out.println("Status: " + (totalPendapatan>1500000? "Sangat Baik":"Perlu Evaluasi"));
      System.out.println();
      
    }
  }
}
