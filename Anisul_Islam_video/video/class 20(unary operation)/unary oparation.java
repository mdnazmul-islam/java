import java.util.Scanner;

class Unary_operation
{
    public static void main(String[] args)
    {
        Scanner inter = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = inter.nextInt();
        int result = +number;
        System.out.println("The result  +number :" +result);
        result = -number;
        System.out.println("The result -number :" + result);
        result = ++number;
        System.out.println("The result  ++number:"+ result);
        result = number++;
        System.out.println("The result number++ :"+result);
        result = --number;
        System.out.println("The result --number :" + number);
        result = number --;
        System.out.println("The result number-- :"+number);


    }
}
