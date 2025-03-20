import java.util.Scanner;

class Class63
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("srart armstrong number:");
       int start = input.nextInt();
       System.out.print("end armstrong number:");
       int end = input.nextInt();
       int count=0;
      System.out.print(start+" to "+end+" armstrong number :");
       int number=start;
       while(number<=end){
        int orginal=number,sum=0;
        while(number!=0)
        {
          int remender= number%10;
          sum=sum+(remender*remender*remender);
          number=number/10;
        }
        if(orginal==sum)
        {
         System.out.print(" "+sum);
         count++;
        }
       
       number=orginal+1;
       }
      System.out.println("\ntotul armstrong number :"+count);
      
       
    }
   
}
