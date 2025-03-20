import java.util.Scanner;

class class47{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("Enter the series end:");
       int end= input.nextInt();
      
       int sum=0;
       System.out.print("The series:");
       for (int i = 1; i <=end ; i++) {
        sum=sum+(i*i);
        System.out.print(i+"^2");
        if(i<end)
        System.out.print("+");
        
       }
       System.out.println("\n"+1+" to "+end+" series sum :"+sum);
    }
   
}
