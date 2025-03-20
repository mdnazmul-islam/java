import java.util.Scanner;

class class54
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("how to fibonacci series:");
       int totul = input.nextInt();
       int fibonacci,firstNum=0,secondNum=1;
       System.out.print(firstNum+" "+secondNum);
       for(int i=2;i<totul;i++ )
       {
        fibonacci=firstNum+secondNum;
        System.out.print(" "+fibonacci);
        firstNum=secondNum;
        secondNum=fibonacci;
       }
      
       
      
    }
   
}
