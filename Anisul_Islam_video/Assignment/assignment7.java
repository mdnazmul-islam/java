
import java.util.Scanner;
class Assignment7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you love java?");
        System.out.println("Option selete y/Y/n/N :");
        char ch = input.next().charAt(0);
        if(ch=='y' || ch=='Y')
        {
            System.out.println("YOu ar a java jover");
        }
        else if(ch=='n' || ch=='N')
        {
            System.out.println("you are not a java lover");
        }
        else
        {
            System.out.println("not answer");
        }
    }
}
