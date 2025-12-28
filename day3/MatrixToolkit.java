package day3;

import java.util.Scanner;

public class MatrixToolkit {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter rows and columns (2-10): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        if (r < 2 || r > 10 || c < 2 || c > 10) {
            System.out.println("Invalid matrix size");
            return;
        }

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        System.out.println("Enter first matrix:");
        readMatrix(A);

        System.out.println("Enter second matrix:");
        readMatrix(B);

        while (true) {

            System.out.println("\n--- MATRIX MENU ---");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Transpose (First Matrix)");
            System.out.println("5) Row / Column Sums");
            System.out.println("6) Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add:");
                    printMatrix(add(A, B));
                    break;

                case 2:
                    System.out.println("Subtract:");
                    printMatrix(subtract(A, B));
                    break;

                case 3:
                    multiplyMenu(A);
                    break;

                case 4:
                    System.out.println("Transpose:");
                    printMatrix(transpose(A));
                    break;

                case 5:
                    rowColumnSum(A);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Read matrix
    static void readMatrix(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = sc.nextInt();
            }
        }
    }

    // Print matrix
    static void printMatrix(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrix addition
    static int[][] add(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Matrix subtraction
    static int[][] subtract(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Multiplication menu
    static void multiplyMenu(int[][] A) {

        System.out.print("Enter columns for second matrix: ");
        int k = sc.nextInt();

        if (k < 2 || k > 10) {
            System.out.println("Invalid size");
            return;
        }

        int[][] B = new int[A[0].length][k];

        System.out.println("Enter second matrix for multiplication:");
        readMatrix(B);

        System.out.println("Multiplication Result:");
        printMatrix(multiply(A, B));
    }

    // Matrix multiplication
    static int[][] multiply(int[][] A, int[][] B) {

        int r = A.length;
        int c = A[0].length;
        int k = B[0].length;

        int[][] result = new int[r][k];

        // Triple loop explanation:
        // i → rows of A
        // j → columns of B
        // x → columns of A / rows of B
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                for (int x = 0; x < c; x++) {
                    result[i][j] += A[i][x] * B[x][j];
                }
            }
        }
        return result;
    }

    // Transpose of matrix
    static int[][] transpose(int[][] A) {
        int[][] T = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    // Row and Column sums
    static void rowColumnSum(int[][] A) {

        System.out.println("Row sums:");
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[0].length; j++) {
                sum += A[i][j];
            }
            System.out.println("Row " + i + ": " + sum);
        }

        System.out.println("Column sums:");
        for (int j = 0; j < A[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i][j];
            }
            System.out.println("Column " + j + ": " + sum);
        }
    }
}
