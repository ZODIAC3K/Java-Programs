
// 30.	Write a java Program for matrix addition, subtraction and multiplication using Array.

import java.util.Scanner;

public class matrix_operations {


    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] matrixSum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixSum;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] matrixDiff = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixDiff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixDiff;
    }

    public static int[][] matrixProduct(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        int[][] matrixProduct = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    matrixProduct[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixProduct;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter the elements of the first matrix --");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix --");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Select the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                int[][] matrixSum = addMatrices(matrix1, matrix2);
                System.out.println("The Addition of the matrices is:");
                printMatrix(matrixSum);
                break;
            case 2:
                int[][] matrixDiff  = subtractMatrices(matrix1, matrix2);
                System.out.println("The Subtraction of the matrices is:");
                printMatrix(matrixDiff);
                break;
            case 3:
                int[][] matrixProduct  = matrixProduct(matrix1, matrix2);
                System.out.println("The Multipliction of the matrices is:");
                printMatrix(matrixProduct);
                break;
            default: 
                System.out.println("Invalid Input Try Again....");
        }
    }
}