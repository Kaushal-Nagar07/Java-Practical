import java.util.*;
public class Prac_7 {
    public static void main(String[] args) {

        int UC1= 'A'+(int)(Math.random()*('Z'-'A'));
        int UC2= 'A'+(int)(Math.random()*('Z'-'A'));
        int UC3= 'A'+(int)(Math.random()*('Z'-'A'));

        int No1 = (int)(Math.random()*10);
        int No2 = (int)(Math.random()*10);
        int No3 = (int)(Math.random()*10);
        int No4 = (int)(Math.random()*10);

        System.out.println(" ");
        System.out.println("===== Prac 7 =====");
        System.out.println(" ");
        System.out.println(("Custom Number Plate's Number is : ")+((char)(UC1))+ ((char)(UC2))+((char)(UC3))+No1+No2+No3+No4);

    }
}