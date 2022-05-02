import java.util.Scanner;

public class Prac_11{
    public static int a;
    public static int b;
    public static int[][] matrix = new int[6][6];
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("======== Matrix 6*6 ========");
        System.out.println(" ");
        for (int i=0; i<matrix.length ;i++)
        {
            System.out.print("        ");
             for (int j=0; j<matrix[i].length ;j++)
             {
                 matrix[i][j] = (int) (Math.random()*2);
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
        }
        
        
        // System.out.println("1.Row");
        // System.out.println("2.Column");
        // System.out.print("Choose Option You want to find for : ");
        // int K = sc.nextInt();
        
        while(1!=0)
        {
            System.out.println(" ");
            System.out.println("1.Row");
            System.out.println("2.Column");
            System.out.print("Choose Option You want to find for : ");
            int K = sc.nextInt();
        switch (K)
        {
            case 1:
            System.out.print("Enter Row between 1 to 6 : ");
            a = sc.nextInt();
            if( a >= 1 && 6 >=  a)
            {
                Row(matrix);
            }
            else
            {
                System.out.println(" ");
                System.out.println("!! Wrong Row number !!");
                System.out.println("please Enter Row between 1 to 6");
                System.out.println(" ");

            }
            
            break;

            case 2:
            System.out.print("Enter Column between 1 to 6 : ");
            b = sc.nextInt();
            if( b >= 1 && 6 >= b)
            {
                Column(matrix);
            }
            else
            {
                System.out.println(" ");
                System.out.println("!! Wrong Column number !!");
                System.out.println("please Enter Column between 1 to 6");
                System.out.println(" ");
            }
            
            break;

            default:
            System.out.print("Enter Proper choice ");
        }
        }
    }


    public static void Row (int matrix[][]) 
    {
        int count = 0;
        
        for (int j=0; j<matrix.length ;j++)
        {
                if (matrix[a-1][j] == 1)
                {
                    count++;
                }
        }
                if (count % 2 == 0)
                {
                    System.out.println("Row " +a+  " has Total "+count+" 1's . That Means it has Even Number of 1's" );
                }
                else
                {
                    System.out.println("Row " +a+  " has Total " +count+ " 1's . That Means it has Odd Number of 1's" );
                }
        
            
            
    }

    public static void Column (int matrix[][]) 
    {
        int count = 0;
        
        for (int i=0; i<matrix.length ;i++)
        {
                if (matrix[i][b-1] == 1)
            {
                count++;
            }
        }
            if (count % 2 == 0)
            {
                System.out.println("Column " +b+  " has Total "+count+" 1's . That Means it has Even Number of 1's" );
            }
            else
            {
                System.out.println("Column " +b+ " has Total "+count+" 1's . That Means it has Odd Number of 1's");
            }
            
    }


    }