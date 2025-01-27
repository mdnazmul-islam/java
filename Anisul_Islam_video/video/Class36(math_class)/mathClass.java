import java.util.*;
class Math_class
{
    public static void main(String[] args)
    {
        int number1,number2;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number1:");
        number1=input.nextInt();
        System.out.print("Enter the number2:");
        number2=input.nextInt();
        System.out.println("The maximum number:"+Math.max(number1, number2));
        System.out.println("The minimum number:"+Math.min(number1, number2));
        System.out.println("two number add :"+Math.addExact(number1, number2));
        System.out.println("two number sub:"+Math.subtractExact(number1,number2));
        System.out.println("tow number multiply :"+Math.multiplyExact(number1, number2));
        
      

    }
    
}
