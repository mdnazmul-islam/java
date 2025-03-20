import java.util.Scanner;

class Class60
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("any integer number:");
       int number = input.nextInt();
       int orginal=number,sum=0;
       while(number!=0)
       {
         int remender= number%10;
         sum=sum*10+remender;
         number=number/10;
       }
       if(orginal==sum)
       {
        System.out.println("number is palindrome");
       }
       else
       {
        System.out.println("number is not palindrome");
       }
      
       
    }
   
}
