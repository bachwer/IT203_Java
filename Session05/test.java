package Session05;

import java.util.*;
import java.util.regex.*;


public class test {

    /* =========================
       FR1 – Two Sum
       ========================= */
    public static void twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                System.out.println("Found indices: " + map.get(need) + ", " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No pair found");
    }

    /* =========================
       FR2 – Move Zeroes
       ========================= */
    public static void moveZeroes(int[] arr) {
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    /* =========================
       FR3 – Valid Palindrome
       ========================= */
    public static boolean isPalindrome(String s) {
        // Remove non-letters using Regex
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    /* =========================
       FR4 – Reverse Words
       ========================= */
    public static String reverseWords(String s) {
        // Remove extra spaces & split
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    /* =========================
       FR5 – Happy Number
       ========================= */
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    /* =========================
       MAIN – Test all functions
       ========================= */
    public static void main(String[] args) {

        // FR1
        int[] arr1 = {2, 7, 11, 15};
        twoSum(arr1, 9);

        // FR2
        int[] arr2 = {0, 1, 0, 3, 12};
        moveZeroes(arr2);
        System.out.println("Move Zeroes: " + Arrays.toString(arr2));

        // FR3
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome: " + isPalindrome(s1));

        // FR4
        String s2 = "  world   hello  ";
        System.out.println("Reverse Words: \"" + reverseWords(s2) + "\"");

        // FR5
        int n = 19;
        System.out.println("Is Happy Number: " + isHappy(n));
    }
}