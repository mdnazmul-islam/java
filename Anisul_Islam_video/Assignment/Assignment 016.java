import java.util.Scanner;

 class Assignment16
{
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       String user="nazmul";
       int pass=4321;
      
       while(true)
       {
        System.out.print("Enter the userName;");
        String userName= input.next();
        System.out.print("Enter the password:");
        int password= input.nextInt();
        if(user.equals(userName) &&  pass==password)
        {
            System.out.println("Welcome to the system");
            break;
        }
        else
        {
            System.out.println("username/password is incorrect. try the again");
           
        }
      }
      
       
    }
   
}
