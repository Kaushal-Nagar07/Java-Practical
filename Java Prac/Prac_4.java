import java.util.Scanner;

public class Prac_4{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("======== BMI(Body Mas Index) Calculater =======");
        System.out.println("Enter Your Weight in Pound :");
        float  a = sc.nextFloat();
        System.out.println("Enter Your Height in Inches :");
        float  b = sc.nextFloat();
    float W_KG= a*0.454f;
    float H_Meter= b*0.0254f;
        System.out.println("Your BMI = " +(W_KG)/(H_Meter*H_Meter));
    }
}