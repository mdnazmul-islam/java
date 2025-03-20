import java.util.Scanner;

class Question13
{
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the Width and Height :");
       double Width=input.nextDouble();
        double Height=input.nextDouble();
      System.out.println("Area is "+Width+" * "+Height+" = "+(Width*Height));
      System.out.println("Perimeter is 2 * ("+Width+" + "+Height+ ") = "+ (2*(Width+Height)));
    }
}
