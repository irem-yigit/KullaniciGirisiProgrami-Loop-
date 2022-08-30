import java.util.Scanner;

public class miniproje12 {
    public static void main(String[] args){        //while döngüsü ile kullanıcı girişi yazma programı

        Scanner scan = new Scanner(System.in);

        int giris=3;
        String sys_kullanici = "yigitiremm";
        String sys_parola = "123456";

        System.out.println("*********************");
        System.out.println("Kullanıcı girişine hoşgeldiniz...");
        System.out.println("**********************");

        while (true){
            System.out.println("Kullanıcı adınızı giriniz: ");
            String kullanici= scan.nextLine();
            System.out.println("Parolanızı giriniz: ");
            String parola= scan.nextLine();

            if (sys_kullanici.equals(kullanici) && sys_parola.equals(parola)){  //equals eşit olup olmadığını ölçer
                System.out.println("Sisteme hoşgeldiniz..." + kullanici);
                break;
            }
            else if (!kullanici.equals(sys_kullanici) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı adınızı yanlış girdiniz...Tekrar deneyiniz...");
                giris-=1;
                System.out.println("Kalan giriş hakkınız: " + giris);
            }
            else if (kullanici.equals(sys_kullanici) && !parola.equals(sys_parola)) {
                System.out.println("Parolanızı yanlış girdiniz...Tekrar deneyiniz...");
                giris -= 1;
                System.out.println("Kalan giriş hakkınız: " + giris);
            }
            else {
                System.out.println("Kullanıcı adı ve parolanızı yanlış girdiniz... Tekrar deneyiniz...");
                giris-=1;
                System.out.println("Kalan giriş hakkınız: " + giris);
            }
            if (giris==0){
                System.out.println("Giriş hakkınız bitmiştir. Sistemden çıkılıyor...");
                break;
            }
        }

    }
}
