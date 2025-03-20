import java.util.Scanner;

class class47{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("Enter the series start:");
       int start = input.nextInt();
       System.out.print("Enter the series end:");
       int end= input.nextInt();
      
       int sum=1;
       System.out.print("The series:");
       for (int i = start; i <=end ; i++) {
        sum*=(i*i);
        System.out.print(i+"^2");
        if(i<end)
        System.out.print("x");
        
       }
       System.out.println("\n"+start+" to "+end+" series multiplication :"+sum);
    }
   
}
