import java.util.*;
class Conditional_Oparator
{
    public static void main(String[] args)
    {
        int number1,number2;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number1:");
        number1=input.nextInt();
        System.out.print("Enter the number2:");
        number2=input.nextInt();
        int large=(number1>number2)?number1:number2;
        System.out.println("The large number:"+large);
        

    }
    
}
