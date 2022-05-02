import java.util.Scanner;

public class Prac_2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("===== Prac 2 =====");
        System.out.println("Enter Value a :");
        float  a = sc.nextFloat();
        System.out.println("Enter Value b :");
        float  b = sc.nextFloat();
        System.out.println("Enter Value c :");
        float  c = sc.nextFloat();
        System.out.println("Enter Value d :");
        float  d = sc.nextFloat();
        System.out.println("Enter Value e :");
        float  e = sc.nextFloat();
        System.out.println("Enter Value f :");
        float  f = sc.nextFloat();
    float x=((e*d)-(b*f))/((a*d)-(b*c));
    float y=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("Value of X = " +x);
        System.out.println("Value of Y = " +y);
    }
}