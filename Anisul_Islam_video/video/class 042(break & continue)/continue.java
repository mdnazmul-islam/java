import java.util.Scanner;

class Class42{
   
    public static void main(String[]args)
    {
       
       Scanner input =new Scanner(System.in);
       System.out.println("1 to 10 range not prinr number :");
       int num = input.nextInt();
       for(int i=1;i<=10;i++)
       {
        if(i==num)
         continue;

        System.out.println(i);
       }
       
    }
   
}
