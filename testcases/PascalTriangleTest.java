public class PascalTriangleTest {
        public static void main(String[] args) {
            // Test 1: 5 rows using brute force
            System.out.println("Test Case 1 - 5 Rows Brute Force");
            PascalsTriangle.printTriangle(PascalsTriangle.generateBruteForce(5));

            // Test 2: 5 rows using memoization
            System.out.println("\nTest Case 2 - 5 Rows Memoization");
            PascalsTriangle.printTriangle(PascalsTriangle.generateMemo(5));

            // Test 3: Edge Case (1 row)
            System.out.println("\nTest Case 3 - 1 Row Brute Force");
            PascalsTriangle.printTriangle(PascalsTriangle.generateBruteForce(1));

            // Test 4: Edge Case (0 rows)
            System.out.println("\nTest Case 4 - 0 Rows Brute Force");
            PascalsTriangle.printTriangle(PascalsTriangle.generateBruteForce(0));

            // Test 5: Edge Case (1 row)
            System.out.println("\nTest Case 3 - 1 Row Memoization");
            PascalsTriangle.printTriangle(PascalsTriangle.generateMemo(1));

            // Test 6: Edge Case (0 rows)
            System.out.println("\nTest Case 4 - 0 Rows Memoization");
            PascalsTriangle.printTriangle(PascalsTriangle.generateMemo(0));

            // Test 7: 20 rows using brute force
            System.out.println("\nTest Case 1 - 5 Rows Brute Force");
            PascalsTriangle.printTriangle(PascalsTriangle.generateBruteForce(20));

            // Test 8: 20 rows using memoization
            System.out.println("\nTest Case 2 - 5 Rows Memoization");
            PascalsTriangle.printTriangle(PascalsTriangle.generateMemo(20));
        }
    }

