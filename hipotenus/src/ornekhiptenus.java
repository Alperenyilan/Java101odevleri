import java.util.Scanner;
public class ornekhiptenus{
    public static void main(String[] args)
    {
        double a,b,c;
        Scanner oku=new Scanner(System.in);

        System.out.print("Birinci dik kenarı giriniz:");
        a=oku.nextDouble();
        System.out.print("İkinci dik kenarı giriniz:");
        b=oku.nextDouble();

        c=Math.sqrt(a*a+b*b);

        System.out.printf("\nHipotenüs:%.2f",c);

    }
}