package stack_tumpukan;
public class tumpukanApp {
    public static void main (String [] args){
    tumpukan tumpukan=new tumpukan(10);
    tumpukan.push(95);
    tumpukan.baca();
    tumpukan.push(30);
    tumpukan.baca();
    long nilai1=tumpukan.pop();
    System.out.println(" nilai teratas = "+nilai1);
    System.out.println(" nama saya adalah Maziyyati Mayyadah ");
    long nilai2 = tumpukan.pop();
    System.out.print(" nilai yang dihapus = "+nilai2);
    System.out.println(" ");
    tumpukan.push(40);
    tumpukan.baca();
    tumpukan.push(50);
    tumpukan.baca();
    }
}
