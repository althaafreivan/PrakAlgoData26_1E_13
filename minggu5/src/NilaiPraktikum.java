package minggu5.src;

public class NilaiPraktikum {
  double hitungTertinggiDC(double arr[], int l, int r){
    if(l == r){
      return arr[l];
    }

    int mid = (l + r) / 2;
    double lmax = hitungTertinggiDC(arr, l, mid);
    double rmax = hitungTertinggiDC(arr, mid + 1, r);

    return (lmax > rmax) ? lmax : rmax;
  }

  double hitungTerendahDC(double arr[], int l, int r){
    if(l == r){
      return arr[l];
    }

    int mid = (l + r) / 2;
    double lmin = hitungTerendahDC(arr, l, mid);
    double rmin = hitungTerendahDC(arr, mid + 1, r);

    return (lmin < rmin) ? lmin : rmin;
  }

  double hitungRataBF(double arr[], int n){
    double total = 0;
    for (int i = 0; i < n; i++) {
      total = total + arr[i];
    }
    
    return total / n;
  }
}
