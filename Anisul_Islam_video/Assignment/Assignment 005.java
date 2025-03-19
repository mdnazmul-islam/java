import java.util.Scanner;

class Assginment5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the person age :");
        int age = input.nextInt();
        if(age>=18)
        {
            System.out.println("The valid voder");
        }
        else
        {
            System.out.println("invalid voder");
        }
        
    }
}
