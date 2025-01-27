import java.util.*;
class Bitwise_Operator
{
    public static void main(String[] args)
    {
        int number1,number2,number3;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number1:");
        number1=input.nextInt();
        System.out.print("Enter the number2:");
        number2=input.nextInt();
       number3=number1&number2;
       System.out.println("Bitwise number1 & number2 :"+number3);
       number3=number1|number2;
       System.out.println("Bitwise number1 | number2 :"+number3);
       number3=number1^number2;
       System.out.println("Bitwise number1 ^ number2 :"+number3);
        

    }
    
}
