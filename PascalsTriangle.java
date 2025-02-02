import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input the row that you want to find: ");
        int targetRow = scnr.nextInt();
        scnr.close();

        // Generate triangle using brute force
        List<List<Integer>> bruteForceTriangle = generateBruteForce(targetRow);
        System.out.println("Using brute force solution:");
        printTriangle(bruteForceTriangle);

        // Generate triangle using memoization
        System.out.println("\nUsing memoization:");
        List<List<Integer>> memoTriangle = generateMemo(targetRow);
        printTriangle(memoTriangle);
    }

    public static List<List<Integer>> generateBruteForce(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curRow.add(1);
                } else {
                    curRow.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(curRow);
        }
        return res;
    }

    //Utilizes a memoization hashmap to store previous answers in order to avoid redudant calculations
    private static Map<String, Integer> memo = new HashMap<>();

    //Calculates the value at a specific position in the triangle and uses memoization to avoid repeating work
    public static int getValue(int row, int col) {
        //First and last elements of a row are always 1
        if (col == 0 || col == row) {
            return 1;
        }

        //Key for the map
        String key = row + "," + col;

        //If value hasn't been computed yet, calculate it then store it in the hashmap
        if (!memo.containsKey(key)) {
            memo.put(key, getValue(row - 1, col - 1) + getValue(row - 1, col));
        }

        //Return the value in the hashmap
        return memo.get(key);

    }

    //Generates the triangle using memoization
    //Utilizes getValue() to avoid doing repeated work
    public static List<List<Integer>> generateMemo(int numRows) {
        List<List<Integer>> res = new ArrayList<>(); //Stores the triangle

        //Iterates through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>(); //Arraylist of current row
            for (int j = 0; j <= i; j++) {
                curRow.add(getValue(i, j)); //Adds the value from the hashmap
            }
            res.add(curRow); //Adds the current row to the result
        }
        return res; //Returns the triangle
    }

    //Prints out the triangle
    public static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
