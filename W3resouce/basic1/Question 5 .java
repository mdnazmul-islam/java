import java.util.Scanner;

class Question5{
    public static void main(String[]args)
    {
       Scanner input =new Scanner(System.in);
       System.out.print("input first number:");
       int number1=input.nextInt();
       System.out.print("Input second number:");
       int number2=input.nextInt();
       System.out.println(number1+" x "+number2+" = "+(number1*number2));
    }
}
