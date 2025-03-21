/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

import java.util.Scanner;

 class Assignment16
{
   
    public static void main(String[] args)
    {
       Scanner input =new Scanner(System.in);
       System.out.print("Pleace enter the line number:");
       int row=input.nextInt();
       for (int i = 0; i <row; i++) 
       {
        for (int j = row-i; j >0; j--) 
        {
            System.out.print(j+" ");
        }
        System.out.println();
       }
      
       
    }
    
}
