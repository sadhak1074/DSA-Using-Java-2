public class twodarray2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Example matrix
        int x = 5; // Element to search for
        
        // Loop through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each element in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) { // If element is found
                    System.out.println("Element " + x + " found at row " + (i+1) + ", column " + (j+1));
                    return; // Stop searching
                }
            }
        }
        
        // Element not found if code reaches this point
        System.out.println("Element " + x + " not found in matrix");
    }
}
