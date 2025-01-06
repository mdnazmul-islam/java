import java.util.Scanner;
class Input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        String name;
        System.out.print("Enter any number:");
        number = input.nextInt();
        System.out.println("Enter the name:");
        name=input.next();
        System.out.println("the number ="+number);
        System.out.println(name);

    }
}
