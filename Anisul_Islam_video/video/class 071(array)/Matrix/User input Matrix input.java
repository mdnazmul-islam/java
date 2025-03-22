import java.util.Scanner;

class Class75 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Matrix = new int[2][3];
        System.out.println("Enter the matrix (2x3):");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter the matrix value [" + row + "][" + col + "] :");
                Matrix[row][col] = input.nextInt();

            }
        }
        System.out.println("User input Matrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(Matrix[row][col] + " ");

            }
            System.out.println();
        }

    }

}
