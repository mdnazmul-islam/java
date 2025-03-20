import java.util.Scanner;

class Class58
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("any integer number:");
       int number = input.nextInt();
       System.out.print("user number reverse:");
       while(number!=0)
       {
         int remender= number%10;
         System.out.print(remender);
         number=number/10;
       }
      
       
    }
   
}
