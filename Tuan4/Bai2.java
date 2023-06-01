import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        
        System.out.println("Enter elements of matrix 1:");
        readMatrix(matrix1, input);
        
        System.out.println("Enter elements of matrix 2:");
        readMatrix(matrix2, input);
        
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("Sum of matrices:");
        printMatrix(sum);
        
        System.out.println("Enter a number to multiply with matrix 1:");
        int num = input.nextInt();
        int[][] product = multiplyMatrix(matrix1, num);
        System.out.println("Matrix 1 multiplied by " + num + ":");
        printMatrix(product);
        
        input.close();
    }
    
    public static void readMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
    
    public static int[][] multiplyMatrix(int[][] matrix, int num) {
        int[][] product = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                product[i][j] = matrix[i][j] * num;
            }
        }
        return product;
    }
}
