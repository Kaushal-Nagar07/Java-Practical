import java.util.Scanner;

public class Prac_8 {
    public static void main (String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int divi=2;
        System.out.println(" ");
        System.out.println("===== Prac 8 =====");
        System.out.println(" ");
        System.out.println("Enter Integer Value : ");
        int No = sc.nextInt();
        System.out.print("All Smallest Factor are : ");
        while (No>1) 
        {
            if (No%divi==0) 
            {
                System.out.print(divi+" ");
                No /=divi;
            }
            else
            {
                divi++;
            }
 
         }
    }
    
}
