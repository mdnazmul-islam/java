import java.util.Scanner;

class Question72 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("please enter the number :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();

        }
        for (int x : number) {
            System.out.print(x + " ");
        }

    }

}
