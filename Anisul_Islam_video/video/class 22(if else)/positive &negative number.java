import java.util.Scanner;

class If_Else_Condition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the interger number :");
        int number = input.nextInt();
        if(number>0)
        {
            System.out.println("The positive number.");
        }
        if(number<0)
        {
            System.out.println("The negative number.");
        }
        if(number==0)
        {
            System.out.println("The zero number.");
        }

    }
}
