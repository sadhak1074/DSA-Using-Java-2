public class twodarray1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Example matrix

        // Loop through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each element in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // Print the current element
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
