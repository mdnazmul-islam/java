import java.util.Scanner;

class Capital_Small
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the one charter:");
        char ch = input.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("Small charter");
        }
        else
        {
            System.out.println("Capital charter");
        }
        
        
    }
}
