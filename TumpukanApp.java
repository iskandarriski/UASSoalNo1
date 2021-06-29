package uasno1;

public class TumpukanApp {
     public static void main(String args[]){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println("nilai teratas = 3 " + tumpukan.peek());
        System.out.println("Nama saya Muhammad Nur Iskandar Rizqi");
        System.out.println("nilai yang dihapus = 3 " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
    }
}

