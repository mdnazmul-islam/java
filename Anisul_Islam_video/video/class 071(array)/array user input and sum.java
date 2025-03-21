import java.util.Scanner;

 class Question71
{
   
    public static void main(String[] args)
    {
       Scanner input =new Scanner(System.in);
      int[] number = new int[5];
      int sum=0;
      System.out.println("please enter the number :");
      for (int i = 0; i < number.length; i++) {
        number[i]=input.nextInt();
        sum+=number[i];
      }
      System.out.println("The array the sum :"+sum);
      
       
    }
    
}
