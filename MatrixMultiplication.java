package array;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define matrices A and B
        int[][] matrixA = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrixB = { {7, 8}, {9, 10}, {11, 12} };

        // Call the matrixMultiplication method
        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        // Create a new matrix to store the result
        int[][] result = new int[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
}
