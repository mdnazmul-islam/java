
import java.util.*;
class Assignment8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The candidate have you completed your masters?");
        System.out.println("Option selete y/Y/n/N :");
        char ch1 = input.next().charAt(0);
        System.out.println("The candidate have you completed your masters?");
        System.out.println("Option selete y/Y/n/N :");
        char ch2 = input.next().charAt(0);
        if((ch1=='y' || ch1=='Y')&&(ch2=='y' || ch2=='Y'))
        {
            System.out.println("you are eligible to for the job interview.");
        }
        else if((ch1=='n' || ch1=='N')&&(ch2=='n' || ch2=='N'))
        {
            System.out.println("you are not eligible to for the job interview.");
        }
        else
        {
            System.out.println("not answer");
        }
    }
}
