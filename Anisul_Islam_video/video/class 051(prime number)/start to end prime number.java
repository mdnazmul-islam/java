import java.util.Scanner;

class class51
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("start the prime number :");
       int start = input.nextInt();
       System.out.print("end the prime number :");
       int end = input.nextInt();
       boolean count=true;
       for(int j=start;j<=end;j++)
       {
        for(int i=2;i<j;i++)
        {
         if(j%i==0)
         {
             count=false;
             break;
         }
        }
        if(count)
        {
         System.out.print(j+" ");
        }
        count=true;
       

       }
      
      
      
    }
   
}
