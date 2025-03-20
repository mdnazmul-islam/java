import java.util.Scanner;

class Question15
{
    public static void main(String[] args) {
      
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the two number:");
      int num1=input.nextInt();
      int num2=input.nextInt();
      int temp;
      System.out.println("number 1 = "+num1+" and number 2 = "+num2);
      temp=num1;
      num1=num2;
      num2=temp;
      System.out.println("swap the numbewr 1 = "+num1+" and number2 = "+num2);
    }
}
