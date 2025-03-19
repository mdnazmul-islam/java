import java.util.Scanner;

class class45{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("Enter the factoril number:");
       int factoril= input.nextInt();
       int mul=1;
       for (int i = 2; i <=factoril ; i++) {
        mul*=i;
        
       }
       System.out.println("The factorial number:"+mul);
    }
   
}
