import java.util.Scanner;
class Arithmetic
{
    public static void main(String[] args)
    {Scanner input =new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter the first number :");
        number1=input.nextInt();
        System.out.print("Enter the second number :");
        number2=input.nextInt();
        int sum =number1+number2;
        System.out.println("The sum="+sum);
        int sub=number1-number2;
        System.out.println("The subtractor ="+sub);
        int multiplication =number1*number2;
        System.out.println("the multiplication ="+multiplication);
        int divaided = number1/number2;
        System.out.println("The divaided ="+ divaided);
        
    }
}
