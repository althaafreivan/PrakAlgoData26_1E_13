package Pertemuan14.src;

public class BinaryTreeArray13 {
  Mahasiswa13[] dataMahasiswa;
  int idxLast;

  public BinaryTreeArray13(){
    this.dataMahasiswa = new Mahasiswa13[10]; 
  }

  void populateData(Mahasiswa13 dataMhs[], int idxLast){
    this.dataMahasiswa = dataMhs;
    this.idxLast = idxLast;
  }

  void traverseInOrder(int idxStart){
    if(idxStart <= idxLast){
      if(dataMahasiswa[idxStart] != null){
        traverseInOrder(2*idxStart+1);
        dataMahasiswa[idxStart].tampilInformasi();
        traverseInOrder(2*idxStart+2); // Fix left/right child indexing (was 2*idxStart+1 for both)
      }
    }
  }

  void add(Mahasiswa13 data) {
    if (idxLast >= dataMahasiswa.length - 1) {
      System.out.println("Tree Array sudah penuh");
      return;
    }
    idxLast++;
    dataMahasiswa[idxLast] = data;
  }

  void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
      if (dataMahasiswa[idxStart] != null) {
        dataMahasiswa[idxStart].tampilInformasi();
        traversePreOrder(2 * idxStart + 1);
        traversePreOrder(2 * idxStart + 2);
      }
    }
  }
}
