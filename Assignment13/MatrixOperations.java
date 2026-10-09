
import java.util.Scanner;

public class MatrixOperations {

    static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    static int[][] transpose(int[][] a) {
        int[][] result = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    static boolean isSquare(int[][] a) {
        return a.length == a[0].length;
    }

    static boolean isDiagonal(int[][] a) {
        if (!isSquare(a)) return false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isIdentity(int[][] a) {
        if (!isSquare(a)) return false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int expected = (i == j) ? 1 : 0;
                if (a[i][j] != expected) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of Matrix A:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        if (r1 <= 0 || c1 <= 0) {
            System.out.println("Dimensions must be positive.");
            sc.close();
            return;
        }

        System.out.println("Enter elements of Matrix A:");
        int[][] a = readMatrix(sc, r1, c1);

        System.out.println("Enter rows and columns of Matrix B:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (r2 <= 0 || c2 <= 0) {
            System.out.println("Dimensions must be positive.");
            sc.close();
            return;
        }

        System.out.println("Enter elements of Matrix B:");
        int[][] b = readMatrix(sc, r2, c2);

        System.out.println("\nMatrix A:");
        display(a);
        System.out.println("Matrix B:");
        display(b);

        if (r1 == r2 && c1 == c2) {
            System.out.println("Addition:");
            display(add(a, b));

            System.out.println("Subtraction (A - B):");
            display(subtract(a, b));
        } else {
            System.out.println(
                "Addition and subtraction require equal dimensions."
            );
        }

        if (c1 == r2) {
            System.out.println("Multiplication (A x B):");
            display(multiply(a, b));
        } else {
            System.out.println(
                "Multiplication requires columns of A = rows of B."
            );
        }

        System.out.println("Transpose of A:");
        display(transpose(a));

        System.out.println("Is A square? " + isSquare(a));
        System.out.println("Is A diagonal? " + isDiagonal(a));
        System.out.println("Is A identity? " + isIdentity(a));

        sc.close();
    }
}