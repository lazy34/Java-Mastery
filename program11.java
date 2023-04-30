package Lab_Assignment;
//Write a program to find the Transpose of a Matrix (3 x 3)

public class program11 {
    public static void main(String[] args) {
        try {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            // Print original matrix
            System.out.println("Original matrix:");
            printMatrix(matrix);

            // Find transpose of matrix
            int[][] transpose = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    transpose[i][j] = matrix[j][i];
                }
            }

            // Print transpose matrix
            System.out.println("Transpose matrix:");
            printMatrix(transpose);
        }
        catch (Exception e)
        {
            System.out.println("Error Occurred : "+e);
        }

        finally {
            System.out.println("Program Terminated");
        }
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

