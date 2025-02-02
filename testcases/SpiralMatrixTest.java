import java.util.List;

public class SpiralMatrixTest {

    public static void main(String[] args) {
        testSpiralOrder();
        testEmptyMatrix();
        testSingleElementMatrix();
    }

    // Test for spiral order
    public static void testSpiralOrder() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> result = SpiralMatrix.spiralOrder(matrix);

        if (!expected.equals(result)) {
            System.out.println("Test Failed: testSpiralOrder");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + result);
        } else {
            System.out.println("Test Passed: testSpiralOrder");
        }
    }

    // Test for empty matrix
    public static void testEmptyMatrix() {
        int[][] matrix = {};
        List<Integer> result = SpiralMatrix.spiralOrder(matrix);

        if (!result.isEmpty()) {
            System.out.println("Test Failed: testEmptyMatrix");
            System.out.println("Expected: []");
            System.out.println("Actual: " + result);
        } else {
            System.out.println("Test Passed: testEmptyMatrix");
        }
    }

    // Test for a single element matrix
    public static void testSingleElementMatrix() {
        int[][] matrix = {
                {1}
        };
        List<Integer> expected = List.of(1);
        List<Integer> result = SpiralMatrix.spiralOrder(matrix);

        if (!expected.equals(result)) {
            System.out.println("Test Failed: testSingleElementMatrix");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + result);
        } else {
            System.out.println("Test Passed: testSingleElementMatrix");
        }
    }
}
