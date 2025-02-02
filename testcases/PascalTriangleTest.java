import java.util.List;

public class PascalTriangleTest {
        public static void main(String[] args) {
            // Test 1: 5 rows using brute force
            System.out.println("Test Case 1 - Brute Force (5 rows)");
            PascalsTriangle.printTriangle(PascalsTriangle.generateBruteForce(5));

            // Test 2: 5 rows using memoization
            System.out.println("\nTest Case 2 - Memoization (5 rows)");
            PascalsTriangle.printTriangle(PascalsTriangle.generateMemo(5));

            // Test 3: Edge Case (1 row)
            System.out.println("\nTest Case 3 - 1 Row");
            PascalsTriangle.printTriangle(PascalsTriangle.generateBruteForce(1));

            // Test 4: Edge Case (0 rows)
            System.out.println("\nTest Case 4 - 0 Rows");
            PascalsTriangle.printTriangle(PascalsTriangle.generateBruteForce(0));
        }
    }

