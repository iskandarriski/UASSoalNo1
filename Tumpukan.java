package uasno1;

public class Tumpukan {
    public int ukuran;
        public long[] tumpukan;
        public int top;
    private int s;
        
public Tumpukan(int s){
    ukuran = s;
    tumpukan = new long [ukuran];
    top = -2;
}
public void push(long j){
    tumpukan[++top]=j;
}
public long pop(){
    return tumpukan[top--];
}
public long peek(){
    return tumpukan[top];
}
public boolean isEmpty(){
    return (top == ukuran-1);
}
public boolean isFull(){
    return (top == ukuran-1);
}
public void baca(){
    int i = top;
    while( i>=0){
        System.out.print(tumpukan[i]);
        System.out.print(" ");
        i--;
    }
    System.out.println(" ");
}
}

