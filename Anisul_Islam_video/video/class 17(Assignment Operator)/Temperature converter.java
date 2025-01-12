import java.util.Scanner;
class Temperature_Converter
{
   public static void main(String[]args)
   {
    Scanner input = new Scanner(System.in);
      System.out.println("1.celsius to fahrenheit,kelvin");
      System.out.println("2.fahrenheit to celsius,kelvin");
      System.out.println("3.kelvin to fahrenheit,celsius");    
     System.out.print("Select the option :");
     int choose = input.nextInt();
     if(choose==1)
     {
        double c,f,k;
        System.out.print("Enter the celsies :");
        c = input.nextDouble();
        f=(9.0/5 *c) + 32;
        k= (c+273.15);
        System.out.println("The fahrenheit :"+f);
        System.out.println("The kelvin :"+k);
      
     }
     if(choose==2)
     {
        double c,f,k;
        System.out.print("Enter the fahrenheit :");
        f = input.nextDouble();
        c=(f-32)*5/9.0;
        k= (f-32)*5/9.0+273.15;
        System.out.println("The celsies :"+c);
        System.out.println("The kelvin :"+k);
      
     }
     if(choose==3)
     {
        double c,f,k;
        System.out.print("Enter the kelvin :");
        k = input.nextDouble();
        f=(k - 273.15) *9/5 + 32 ;
        c= k - 273.15;
        System.out.println("The fahrenheit :"+f);
        System.out.println("The celsies :"+c);
      
     }
     
     
   }
}
