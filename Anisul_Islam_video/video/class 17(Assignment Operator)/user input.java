import java.util.Scanner;
class Assignment
{
   public static void main(String[]args)
   {
    Scanner input = new Scanner(System.in);

     System.out.print("Enter the First number :");
     int x = input.nextInt();
     System.out.print("Enter the Second number:");
     int y = input.nextInt();
     x+=y;
     System.out.println("x += y = "+x);
     x-=y;
     System.out.println("x -= y = "+x);
      x*=y;
     System.out.println("x *= y = "+x); 
     x/=y;
     System.out.println("x /= y = "+x); 
     x%=y;
     System.out.println("x %= y = "+x);
      
   }
}
