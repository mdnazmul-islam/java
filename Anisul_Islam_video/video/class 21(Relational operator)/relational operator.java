import java.util.Scanner;

class Relational_operation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number1 = input.nextInt();
        System.out.println("Enter the second number :");
        int number2 = input.nextInt();
        boolean result = number1>number2;
        System.out.println("number1>number2 ="+result);
        result = number1<number2;
        System.out.println("number1<number2 ="+result);
        result= number1>=number2;
        System.out.println("number1>=number2 ="+result);
        result= number1<=number2;
        System.out.println("number1<=number2 ="+result); 
        result= number1==number2;
        System.out.println("number1==number2 ="+result);
        result= number1!=number2;
        System.out.println("number1!=number2 ="+result);

    }
}
