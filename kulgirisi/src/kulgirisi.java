import java.util.Scanner;

public class kulgirisi {
    public static void main(String[] args) {
        String kuladi;
        String sifre;

        kuladi="1041sokak";
        sifre = "124124";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Kullanici adi giriniz: ");
         String Kuladi = input1.next();

       Scanner input2 = new Scanner(System.in);
       System.out.println("Sifre giriniz : ");
       String Sifre = input2.next();

       if (Kuladi.equals(kuladi) && Sifre.equals(sifre)){
           System.out.println("Giris Basarili");
       } else if (Kuladi.equals(kuladi)) {
           System.out.println("Sifre yanlis");
       } else if (Sifre.equals(sifre)) {
           System.out.println("Kul adi yanlış");
       }
       else
           System.out.println("Kullanici adi ve şifre yanlış Yeni şifre oluşturmak için 1 giriniz: ");
       int yenisifre = input1.nextInt();
       switch (yenisifre){
           case 1:
               Scanner input3 = new Scanner(System.in);
               System.out.print("Yeni sifre giriniz: ");
               String yeniSifreolusturma=input3.nextLine();
               if (yeniSifreolusturma.equals("124124")){
                System.out.print("Sifre olusturulamadı, lütfen baska sifre giriniz: ");
                yeniSifreolusturma = input3.nextLine();
               }else {
                   System.out.println("Sifre olusturuldu");
               }
               break;

       }
    }
}








