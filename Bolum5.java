package soru_cozumleri;

import java.util.Scanner;

public class Bolum5 {
      public static void main(String[] args) {

        //Soru1:Klavyeden girilen 3 sayının ortalamasını alan bir uygulama yazınız
        Scanner tara = new Scanner(System.in);
        System.out.print("birinci sayı : ");
        int sayi1 = tara.nextInt();
        System.out.print("ikinci sayı : ");
        int sayi2 = tara.nextInt();
        System.out.print("üçüncü sayı : ");
        int sayi3 = tara.nextInt();
        double ao = (double)(sayi1 + sayi2 + sayi3) / 3.0;
        System.out.println("sayıların aritmetik ortalaması : " + ao);
    }
}

