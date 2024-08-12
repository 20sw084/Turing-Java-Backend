import java.util.*;

// Question: calculates the number of strings that can be formed using the distinct characters of a given string

public class Main {
    public static void main(String[] args) {
        String str = "abc"; // example string
        System.out.println("Number of strings: " + countStrings(str));
    }

    public static int countStrings(String str) {
        // Remove duplicate characters and store in a set
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        // Calculate the sum of factorials from 1 to the size of the set
        int n = set.size();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 2; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }

        return sum;
    }
}
