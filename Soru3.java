package soru_cozumleri;
import java.util.Scanner;
public class Soru3 {
    public static void main(String[] args) {

        //Soru3:Klavyeden girilen vize ve final notlarınına göre öğrencinin dersi geçip geçmediğini söyleyen bir uygulama yazınız.
        //(Geçme notu : 50, vizenin %40ı, finalin %60ı geçerlidir.)
        Scanner tara = new Scanner(System.in);
        System.out.print("vize notunuz : ");
        double vize = tara.nextInt();
        System.out.print("final notunuz : ");
        double finalNotu = tara.nextInt();
        double gecmeNotu = (double)((vize * 0.4) + (finalNotu * 0.6));
        System.out.print("geçme notunuz :  " + gecmeNotu);
        if (gecmeNotu>50){
            System.out.println(" - dersi geçtiniz");
        }else{
            System.out.println(" - dersi geçemediniz");
        }



    }
}
