import java.util.*;

/* 
Question:
Initialize an array arr with the same length as x.
Iterate through each element in the arrays x and y.
For each element x[i], insert it at index y[i] in the arr array. If the position is already occupied, shift the existing elements to the right.
Return the resulting array.
*/

public class Solution {
    public int[] solution(int[] x, int[] y) {
        // Step 1: Create the result array with the same length as x
        int[] arr = new int[x.length];

        // Step 2: Iterate through each element of x and y
        for (int i = 0; i < x.length; i++) {
            // Step 3: Shift elements if necessary
            for (int j = arr.length - 1; j > y[i]; j--) {
                arr[j] = arr[j - 1];
            }
            // Insert the current element of x into the correct position in arr
            arr[y[i]] = x[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test case
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {0, 1, 2, 2, 1};
        
        int[] result = solution.solution(x, y);
        
        // Output the result
        System.out.println(Arrays.toString(result));  // Expected Output: [1, 5, 2, 4, 3]
    }
}
