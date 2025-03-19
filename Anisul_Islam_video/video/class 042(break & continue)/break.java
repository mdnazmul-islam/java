import java.util.Scanner;

class Class42{
   
    public static void main(String[]args)
    {
       int sum=0;
       Scanner input =new Scanner(System.in);
       System.out.println("1 to other number sum :");
       int num = input.nextInt();
       for(int i=1;i<=num;i++)
       {
        if(i==11)
         break;

        sum+=i;
        
       }
       System.out.println("1 to 10 sum = "+sum);
    }
   
}
