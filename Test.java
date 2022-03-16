import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double kdv = 0.18;
        double kdvsizFiyat,KDVliFiyat;




        Scanner inp = new Scanner(System.in);
        System.out.print("Fiyat giriniz:");
        kdvsizFiyat = inp.nextInt();
        KDVliFiyat = (kdvsizFiyat * kdv)+kdvsizFiyat;
        System.out.println("KDVli Fiyat:" + KDVliFiyat);
        System.out.println("KDVsiz Fiyat:" + kdvsizFiyat);
        System.out.println("KDV Tutari:" + kdv);





    }
}
