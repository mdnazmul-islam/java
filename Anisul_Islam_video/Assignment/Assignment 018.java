import java.util.Scanner;

class Assignment18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] day = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        System.out.print("Plece Enter the day number (1-7) :");
        int UserInput = input.nextInt();
        System.out.println("Number of day :" + day[UserInput - 1]);

    }

}
