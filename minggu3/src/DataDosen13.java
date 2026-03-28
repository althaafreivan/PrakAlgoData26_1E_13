package minggu3.src;

public class DataDosen13 {
    public void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        System.out.println("==== Data Semua Dosen ====");
        for (Dosen13 dosen : arrayOfDosen) {
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int tUsiaP = 0, tUsiaW = 0, cP = 0, cW = 0;
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                tUsiaP += dosen.usia;
                cP++;
            } else {
                tUsiaW += dosen.usia;
                cW++;
            }
        }
        System.out.println("Rata-rata Usia Pria   : " + (cP > 0 ? (double) tUsiaP / cP : 0));
        System.out.println("Rata-rata Usia Wanita : " + (cW > 0 ? (double) tUsiaW / cW : 0));
    }

    public void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        Dosen13 tua = arrayOfDosen[0];
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > tua.usia) tua = dosen;
        }
        System.out.println("Dosen Paling Tua :");
        System.out.println("Nama : " + tua.nama + " (" + tua.usia + " th)");
    }

    public void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        Dosen13 muda = arrayOfDosen[0];
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < muda.usia) muda = dosen;
        }
        System.out.println("Dosen Paling Muda :");
        System.out.println("Nama : " + muda.nama + " (" + muda.usia + " th)");
    }
}
