import java.util.Scanner;

class Question7{
    public static void main(String[]args)
    {
       Scanner input =new Scanner(System.in);
       System.out.print("input first number:");
       int number=input.nextInt();
       for(int i=1;i<=10;i++)
       {
        System.out.println(number+" X "+i+" = "+ (number*i));
       }
      
    }
}
