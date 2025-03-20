import java.util.Scanner;

class Class60
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("srart palindrome number:");
       int start = input.nextInt();
       System.out.print("end palindrom number:");
       int end = input.nextInt();
       int count=0;
      System.out.print(start+" to "+end+" 1palindrome number :");
       int number=start;
       while(number<=end){
        int orginal=number,sum=0;
        while(number!=0)
        {
          int remender= number%10;
          sum=sum*10+remender;
          number=number/10;
        }
        if(orginal==sum)
        {
         System.out.print(" "+sum);
         count++;
        }
       
       number=orginal+1;
       }
      System.out.println("\ntotul palindrome number :"+count);
      
       
    }
   
}
