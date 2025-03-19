import java.util.*;
class Switch
{
    public static void main(String[] args)
    {
        int digite;
        System.out.print("1.language bangali.");
        System.out.print("2.language hindi.");
        System.out.print("3.language urdu.");

        Scanner input= new Scanner(System.in);
        System.out.print("select the option:");
        digite=input.nextInt();
        switch(digite)
        {
            case 1:
            {
                System.out.println("language is bungali");
                 break;
            }
            case 2:
            {
                System.out.println("language is hindi.");
                break;
            }
            case 3:
            {
                System.out.println("language in urdu");
                break;
            }
           
            default:
            {
                System.out.println("language is english");
            }
            

        }

    }
    
}
