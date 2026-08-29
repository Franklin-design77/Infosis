/*
Problem statement

Given a string s and an integer k, find the length of the longest substring that contains exactly k distinct vowels.

The vowels are:

a, e, i, o, u
A, E, I, O, U

If no such substring exists, print:

-1
Input Format
First line: String s
Second line: Integer k
Output Format

Print a single integer representing the length of the longest substring containing exactly k distinct vowels.

Example

Input:

artyebui
2

Output:

6

Because the longest valid substring is:

rtyebu

It contains exactly two distinct vowels:

e, u

and its length is:

6
Another example

Input:

string
1

Output:

6

The entire string contains only one distinct vowel, i.

If no valid substring

Input:

bcdfghjklmnpqrstvwxyz
1

Output:

-1

because there are no vowels.

Algorithm: Sliding Window + Two Pointers + HashMap frequency counting.*/
  





import java.util.*;

public class Main {

    static boolean vowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max = -1;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (vowel(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            while (map.size() > k) {

                char x = s.charAt(left);

                if (vowel(x)) {

                    map.put(x, map.get(x) - 1);

                    if (map.get(x) == 0) {
                        map.remove(x);
                    }
                }

                left++;
            }

            if (map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        System.out.println(max);
    }
}
