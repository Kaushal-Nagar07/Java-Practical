import java.util.Scanner;

public class Prac_5{
    public static void main(String[] args)
    {
        int K;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("===== Prac 5 =====");
        System.out.println("Enter Value a :");
        int  a = sc.nextInt();
        System.out.println("Enter Value b :");
        int  b = sc.nextInt();
        if(a<b)
            {
            K=a;
            a=b;
            b=K;
            }
        System.out.println("Enter Value c :");
        int  c = sc.nextInt(); 
        if(c>b)
        {
         if(c>a)
         {
          K=c;
          c=b;
          b=a;
          a=K;
         }
         else
         {
          K=c;
          c=b;
          b=K;
         }
        }
    System.out.print("Decreased Order of Input : "+a+" "+b+" "+c);
    }
}