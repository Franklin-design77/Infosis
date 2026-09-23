/*
Question: Count Substrings With No Repeating Characters

Given a string s containing only lowercase English letters, count the number of substrings that contain no repeated characters.

A substring is a contiguous sequence of characters from the string.

Each substring is counted separately based on its position, even if two substrings have the same characters.

Example 1

Input:

abac

Valid substrings:

a
ab
b
ba
bac
a
ac
c

Output:

8
Example 2

Input:

abc

Valid substrings:

a
b
c
ab
bc
abc

Output:

6
Example 3

Input:

aaa

Valid substrings:

a
a
a

Output:

3

Constraints:

1 <= length(s) <= 100000

The task is to write a Java program that returns the number of substrings containing all unique characters.
*/

import java.util.*;
import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=func(str);
        System.out.println(result);
    }
    public static int  func(String str){
        int cost=0;
         for(int i=0;i<str.length();i++){
            boolean[]used=new boolean[26];

            for(int j=i;j<str.length();j++){
                int ch=str.charAt(j)-'a';

                if(used[ch]){
                    break;
                }
                used[ch]=true;
                cost++;

            }
         }
         return cost;
    }
}
