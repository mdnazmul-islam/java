import java.util.Scanner;

class Question72 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;
        int max, min;
        System.out.println("please enter the number :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();

        }
        max = number[0];
        min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            } else if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("The maximum number :" + max);
        System.out.println("The minimum number :" + min);

    }

}
