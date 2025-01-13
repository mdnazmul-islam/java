import java.util.Scanner;

class EvenOddNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer number :");
        int Number = input.nextInt();
        if(Number%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
        
    }
}
