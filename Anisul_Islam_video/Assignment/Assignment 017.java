/*
1 
1 0
1 0 1
1 0 1 0
*/
import java.util.Scanner;

 class Assignment17
{
   
    public static void main(String[] args)
    {
       Scanner input =new Scanner(System.in);
       System.out.print("Pleace enter the line number:");
       int row=input.nextInt();
       for (int i = 1; i <=row; i++) 
       {
        for (int j = 1; j <=i; j++) 
        {
           
           if(j%2==0)
            System.out.print("0 ");
            else
            System.out.print("1 ");
        }
        System.out.println();
       }
      
       
    }
    
}
