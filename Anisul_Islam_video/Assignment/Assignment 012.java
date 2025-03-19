import java.util.Scanner;

class Assignment12{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("start odd number:");
       int start= input.nextInt();
       System.out.print("End odd number:");
       int end=input.nextInt();
       int sum=0;
       for (int i = start; i <=end ; i=i+2) {
        sum+=i;
        
       }
       System.out.println(start+" to "+end+" sum odd number :"+sum);
    }
   
}
