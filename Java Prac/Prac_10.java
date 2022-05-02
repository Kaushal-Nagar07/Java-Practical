import java.util.Scanner;

public class Prac_10 {
    public static void main(String[] args)
    {
        int reverse = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("===== Prac 10 =====");
        System.out.println(" ");

        System.out.print("Enter A Number to reverse it : ");
        int a = sc.nextInt();

        while(a != 0)
        {
            int Remainder = a%10;
            reverse = reverse * 10 + Remainder;
            a = a/10;
        }
        System.out.println(" ");
        System.out.println("Reverse of the Number is : " + reverse);
    }

}
