import java.util.Scanner;

class Class75 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Matrix1 = new int[2][3];
        int[][] Matrix2 = new int[2][3];
        System.out.println("Enter the matrix (2x3):");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter the matrix1 value [" + row + "][" + col + "] :");
                Matrix1[row][col] = input.nextInt();

            }
        }
        System.out.println();
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter the matrix2 value [" + row + "][" + col + "] :");
                Matrix2[row][col] = input.nextInt();

            }
        }
        System.out.println("Matrix1 and Matrix2 add:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print((Matrix1[row][col] + Matrix2[row][col]) + " ");

            }
            System.out.println();
        }

    }

}
