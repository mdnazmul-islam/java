import java.util.Scanner;

class ForLoop{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the any number:");
        int number= input.nextInt();
        for(int i=0;i<=number;i++)
        {
            System.out.println(i);
            
        }
    }
}
