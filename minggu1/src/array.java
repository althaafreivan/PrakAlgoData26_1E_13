import java.util.Scanner;

public class array {
    static int jumlahMahasiswa13;
    static Scanner daaniiString13 = new Scanner(System.in), daaniiInt = new Scanner(System.in);
    static String[][] daftarMahasiswa13 = new String[1][1];  
    static String[] daftarMatkul13 = new String[9];
    static double[][] daftarNilai13 = new double[1][9];
    static int[] sks13 = new int[9];

    public static void main(String[] args) {
        daftarMahasiswa13 = new String[1][2];
        daftarNilai13 = new double[1][daftarNilai13[0].length];

        // Inisialisasi Data Kosong Daftar Mahasiswa
        for (int i = 0; i < daftarMahasiswa13.length; i++) {
            daftarMahasiswa13[i][0] =  "(Belum diisi)";
            daftarMahasiswa13[i][1] = "-";
        }

        // Inisialisasi Data Daftar Mata Kuliah
        daftarMatkul13 = new String[]{
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Probelm Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja",
        };

        sks13 = new int[]{
            2,
            2,
            3,
            2,
            2,
            2,
            2,
            2,
        };

        mainMenu13();
    }
    public static void mainMenu13(){
        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");
        inputNilaiMataKuliah13();
    }

    public static void inputNilaiMataKuliah13() {
        int seleksi13 = lihatMahasiswa13();

        System.out.println("===============================");
        for (int i = 0; i < daftarMatkul13.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK ");
            System.out.print(daftarMatkul13[i]+": ");
            daftarNilai13[seleksi13][i] = daaniiInt.nextDouble();
            if(daftarNilai13[seleksi13][i] < 0 || daftarNilai13[seleksi13][i] >100){
                System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0-100");
                i--;
            }
        }
        System.out.println();
        System.out.println("[OK] Semua nilai berhasil dimasukkan");
        System.out.println();
        LihatKHS13();
    }

    public static void LihatKHS13(){
        int seleksi13 = lihatMahasiswa13();
        String format = "%-4s %-48s %-16s %-16s %-16s";
        System.out.println();
        System.out.println("===============================");
        System.out.println("HASIL KONVERSI NILAI MAHASISWA");
        System.out.println("===============================");
        System.out.println("Nama : "+ daftarMahasiswa13[seleksi13][0]);
        System.out.println("NIM : "+ daftarMahasiswa13[seleksi13][1]);
        System.out.printf(format, "No", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println();
        System.out.print("------------------------------------------------------------------------------------------");
        for (int i = 0; i < daftarMatkul13.length; i++) {
            System.out.println();
            System.out.printf(format, (i+1 + "."),daftarMatkul13[i], daftarNilai13[seleksi13][i], konversiHuruf13(daftarNilai13[seleksi13][i]),  konversiIP13(daftarNilai13[seleksi13][i]));
        }
        System.out.println();
        System.out.print("------------------------------------------------------------------------------------------");
        String format1 = "%-24s %-2s %-6s";
        System.out.println();
        System.out.printf(format1, "Total SKS", ":", totalSKS13(seleksi13));
        System.out.println();
        System.out.printf(format1, "Total Bobot", ":", totalBobot13(seleksi13));
        System.out.println();
        System.out.printf(format1,"Indeks Prestasi (IP)", ":", totalBobot13(seleksi13)/totalSKS13(seleksi13));
        System.out.println();
        System.out.printf(format1,"Status Semester", ":", isLulus13(seleksi13));
        System.out.println();
        System.out.printf(format1, "Nilai Minimal", ":", nilaiMinimal13(seleksi13));
        System.out.println();
        System.out.println("===============================");
        System.out.println();
        mainMenu13();
    }

    public static double  nilaiMinimal13(int mahasiswa){
        double nilaiTerkecil13 = 100;

        for(double a13: daftarNilai13[mahasiswa]){
            if(a13 < nilaiTerkecil13){
                nilaiTerkecil13 = a13;
            }
        }
        return nilaiTerkecil13;
    }

    public static double totalBobot13(int mahasiswa){
        double totalBobot13 = 0;
        for (int i = 0; i < sks13.length; i++) {
            totalBobot13 += sks13[i]*(konversiIP13(daftarNilai13[mahasiswa][i]));
        }
        return totalBobot13;
    }
    public static int totalSKS13(int mahasiswa){
        int totalSKS13 = 0;
        for (int a13 : sks13) {
            totalSKS13+=a13;
        }
        return totalSKS13;
    }

    public static int lihatMahasiswa13(){
        int seleksi13 = 0;
        return seleksi13;
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

    public static double konversiIP13(double nilai13){
        double nilaiSetara13;        
            if(nilai13 > 80 && nilai13 <=100){
                nilaiSetara13 = 4;
            }else if (nilai13 > 73 && nilai13 <=80){
                nilaiSetara13 = 3.5;
            }else if (nilai13 > 65 && nilai13 <=73){
                nilaiSetara13 = 3;
            }else if (nilai13 > 60 && nilai13 <=65){
                nilaiSetara13 = 2.5;
            }else if (nilai13 > 50 && nilai13 <=60){
                nilaiSetara13 = 2;
            }else if (nilai13 > 39 && nilai13 <=50){
                nilaiSetara13 = 1;
            }else if (nilai13 < 39){
                nilaiSetara13 = 0;
            }else{
                nilaiSetara13 = 0;
                return 0;
            }
        return nilaiSetara13;
    }

    public static String isLulus13(int mahasiswa13){
        
        if(totalBobot13(mahasiswa13)/totalSKS13(mahasiswa13) < 2){
            return "Tidak lulus, IP Semester Kurang dari 2.0";
        }
        
        for (int i = 0; i < daftarNilai13[mahasiswa13].length; i++) {
            if (konversiHuruf13(daftarNilai13[mahasiswa13][i])=="E") {
                return "Tidak lulus, terdapat nilai huruf 'E'";
            }
        }

        for (int i = 0; i < daftarMatkul13.length; i++) {
            if(daftarMatkul13[i] == "Pancasila"){
                if(konversiHuruf13(daftarNilai13[mahasiswa13][i]) == "D" || konversiHuruf13(daftarNilai13[mahasiswa13][i]) == "E"){
                    return "Tidak lulus, Mata Kuliah Pancasila kurang dari 'C'";
                }
            }
        }

        return "Lulus";
    }
}
