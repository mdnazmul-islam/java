import java.util.Scanner;
class Circle
{
   public static void main(String[]args)
   {
    Scanner input = new Scanner(System.in);

     System.out.print("Enter the radies :");
     double radies = input.nextDouble();
     
     double area = 3.1416 * radies * radies;
     System.out.println("The circle area : "+area);
   }
}
