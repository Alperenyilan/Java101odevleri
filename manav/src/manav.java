import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Armut kaç kg : " );
     double armut = scan.nextDouble() * 2.14;

     System.out.println("Elma kaç kg : ");
     double elma = scanner.nextDouble()*3.67;

     System.out.println("Domates kaç kg : ");
     double domates = scan.nextDouble()*1.11;

     System.out.println("Muz kaç kg : ");
     double muz = scan.nextDouble()*0.95;

     System.out.println("Patlıcan kaç kg : ");
     double patlıcan = scanner.nextDouble()*5.00;

     double toplam = armut+elma+domates+muz+patlıcan;

     System.out.println("Toplam tutar : "+toplam);


    }
}

