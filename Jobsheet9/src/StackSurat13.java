public class StackSurat13 {
  Surat13 stack[];
  int top;
  int size;

  public StackSurat13(int size){
    this.size = size;
    stack = new Surat13[size];
    top = -1;
  }

  public boolean isFull(){
    return top == size-1;
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public void push(Surat13 surat){
    if(!isFull()){
      top++;
      stack[top] = surat;
    } else {
      System.out.println("Stack sudah penuh");
    }
  }

  public Surat13 pop(){
    if(!isEmpty()){
      Surat13 s = stack[top];
      top--;
      return s;
    } else {
      System.out.println("Stack sudah kosong");
      return null;
    }
  }

  public Surat13 peek(){
    if(!isEmpty()){
      return stack[top];
    } else {
      System.out.println("Stack kosong! Tidak ada surat yang masuk");
      return null;
    }
  }

  public int hitungSurat() {
    return top + 1;
  }
}
