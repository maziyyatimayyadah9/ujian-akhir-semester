package queue;
public class antrianApp {
    public static void main(String[] args){
            antrian antrian = new antrian(10);
            antrian.masuk(5);
            antrian.lihat();
            antrian.masuk(60);
            antrian.lihat();   
            long nilai1 = antrian.peekDepan();
            System.out.println(" nilai yang paling depan = "+nilai1);
            System.out.println(" nama saya adalah Maziyyati Mayyadah ");
            System.out.println();
            antrian.masuk(70);
            antrian.lihat();
            long nilai2 = antrian.keluar();
            System.out.println("yang diambil dari antrian = " +nilai2);
            antrian.lihat();
            long nilai4 = antrian.peekDepan();
            System.out.println(" nilai yang paling depan = "+nilai4);
    }
}