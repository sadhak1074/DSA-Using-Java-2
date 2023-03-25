public class twodarray3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}; // Example matrix
        int topRow = 0, bottomRow = matrix.length - 1, leftCol = 0, rightCol = matrix[0].length - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Print top row
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Print right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            // Print bottom row
            if (topRow <= bottomRow) { // Check if there's a bottom row left to print
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            // Print left column
            if (leftCol <= rightCol) { // Check if there's a left column left to print
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
    }
}

