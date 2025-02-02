import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); //Arraylist to store the spiral order of elements
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        //Defines the boundaries of the matrix
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        //While rowStart and colStart is in bounds
        while (rowStart <= rowEnd && colStart <= colEnd) {
            //Traverses rowStart from left to right
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++; //Moves top boundary down

            //Traverses colEnd from top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--; //Move right boundary inwards

            //Checks if current row is valid
            if (rowStart <= rowEnd) {
                //Traverses rowEnd from right to left
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--; //Moves bottom boundary up
            }

            //Checks if current column is valid
            if (colStart <= colEnd) {
                //Traverses colStart from bottom to top
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
                colStart++; //Moves left boundary inwards
            }
        }
        return result; //Returns the list containing spiral order
    }

}
