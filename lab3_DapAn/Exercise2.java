package lab3;

public class Exercise2 {
	public static void addTwoMatrices(int[][] matrixOne, int[][] matrixTwo) {
		System.out.println("Add two matrices:");
		int resultmatrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				resultmatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
				System.out.print(resultmatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void multiplyMatrix(int[][] matrix, int num) {
		System.out.println("Multiply matrix:");
		int resultmatrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				resultmatrix[i][j] = matrix[i][j] * num;
				System.out.print(resultmatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] matrixOne = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixTwo = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		addTwoMatrices(matrixOne, matrixTwo);
		multiplyMatrix(matrixOne, 2);
	}
}
