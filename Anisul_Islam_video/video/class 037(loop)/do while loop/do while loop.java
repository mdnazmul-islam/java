import java.util.Scanner;

class WhileLoop{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the any number:");
        int number= input.nextInt();
        int i=0;
      
        do{
            System.out.println(i);
            i++;
            
        }
        while(i<=number);
    }
}
