import java.util.Scanner;

class vowel_Consonant
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the one charter:");
        char ch = input.next().charAt(0);
        if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.println("This charter vowel.");
        }
        else
        {
            System.out.println("This charter Consonant.");
        }
        
        
    }
}
