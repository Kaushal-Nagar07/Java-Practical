import java.util.Scanner;

public class Prac_9
{
    public static int gcd(int No1, int No2)
    {
        while (No1 != No2) {
            if (No1 > No2) {
                No1 -= No2;
            } else {
                No2 -= No1;
            }

        }
        return No1;
    }

    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
        System.out.println(" ");
        System.out.println("===== Prac 9 =====");
        System.out.println(" ");
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("GCD(Greatest common divisor) of " + a + " and " + b + " = " + gcd(a, b));
        }
    }

}