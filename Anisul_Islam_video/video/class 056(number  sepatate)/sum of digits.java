import java.util.Scanner;

class Class56
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("any integer number:");
       int number = input.nextInt();
       int sum=0;
       while(number!=0)
       {
         int remender= number%10;
         sum+=remender;
         number=number/10;
       }
       System.out.println("the number digit sum : "+sum);
       
    }
   
}
