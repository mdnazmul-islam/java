import java.util.Scanner;

class Question11
{
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the three number :");
       int num1=input.nextInt();
       int num2=input.nextInt();
       int num3=input.nextInt();
       System.out.println("The three number Average :"+((num1+num2+num3)/3.0));
    }
}
