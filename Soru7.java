package soru_cozumleri;
import java.util.Scanner;
public class Soru7 {
    public static void main(String[] args) {
        //Soru7:Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız.
        Scanner tara = new Scanner(System.in);
        System.out.print("faktöriyeli alınacak sayı : ");
        int sayi = tara.nextInt();
        int sayac=1;
        int sonuc=1;
        while (sayac<=sayi){
        sonuc = sonuc * sayac;
        sayac++;
        }
        System.out.println("sonuç:" + sonuc);
    }
}
