import java.util.Scanner;
import java.util.Date;

public class indeksboy {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Boy gir  cm: ");
    double b = scanner.nextDouble();

    System.out.print("Kilo gir : ");
    double k = scanner.nextDouble();

    b=b/100;
    double endeks = k/(b*b);
    System.out.println(b);
    System.out.println(k);
    if(endeks<18)
    {
        System.out.print(String.format("Zayif vki: %f",endeks));

    } else if (endeks >= 18 && endeks <25) {
        System.out.print(String.format("Normal vki %f",endeks));
        
    } else if (endeks >= 25 && endeks <30) {
        System.out.print(String.format("Kilolu vki: %f ",endeks));
    }
    else{
        System.out.print(String.format("Obez vki: %f", endeks));
    }
    }
}
