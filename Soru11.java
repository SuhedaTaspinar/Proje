package soru_cozumleri;
import java.util.Scanner;
public class Soru11 {
    public static void main(String[] args) {
        /*Soru 11:
        Sıcak soguk oyunu. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin etmeye çalışsın.
        Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden sonra bulduğunu belirtelim.
         */
        Scanner tara = new Scanner(System.in);
        int uretilensayi = (int) (Math.random() * 101);
        int tahmin = -13;
        int tahminEtmeSayisi = 0;

        while (tahmin != uretilensayi){
            System.out.print("tahmininizi giriniz : ");
            tahmin = tara.nextInt();
            tahminEtmeSayisi++;

            if (tahmin == uretilensayi){
                System.out.println("Tebrikler! " + tahminEtmeSayisi + ". denemede sayıyı buldunuz.");
            }else if (tahmin > uretilensayi){
                System.out.println("Tahmin ettiğiniz sayı yüksek, tahmininizi azaltın.  ");
            }else{
                System.out.println("Tahmin ettiğiniz sayı düşük, tahmininizi arttırın.  ");
            }
        }
    }
}
