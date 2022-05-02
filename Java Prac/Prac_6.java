import java.util.Scanner;

public class Prac_6 {
    public static void main (String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" ");
        System.out.println("===== Prac 5 =====");
        System.out.println(" ");
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        switch (Character.toLowerCase(ch)) 
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': 
            System.out.println(ch+" is vowel");
        break;
            default:
            System.out.println(ch+ " is constant");
               break; 
        }
    }    
}
