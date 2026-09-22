/*
Question 2 — Count Substrings With No Repeating Characters

You are given a string s consisting of lowercase English letters.

Your task is to count how many substrings of s contain no repeating characters.

Definitions
A substring is a contiguous part of the string.
A substring is valid if all characters in it are unique.
Two substrings are considered different if they have different start or end indices, even if their contents are the same.

Return the total number of valid substrings.

Example

Suppose:

s = "abc"
Output
6
Explanation

The substrings with no repeating characters are:

"a"
"b"
"c"
"ab"
"bc"
"abc"

Therefore:

$$ 6 $$

Note: "a" and "a" would be considered different if they occurred at different start/end indices.

Constraints
1 ≤ length of s ≤ 10^5
s consists of only lowercase English letters (a-z)
In simple words

Given a string, find all contiguous substrings where no character appears more than once, and count them.

For example:

abc

has:

a     → valid
b     → valid
c     → valid
ab    → valid
bc    → valid
abc   → valid

So the answer is:

6
*/


import java.util.*;
public class NO_repeatChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=func(str);
        System.out.println(result);
    }
    public static int func(String str){
        int n=str.length();
        int ans=0;
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<n;i++){
            String result="";
            for(int j=i;j<n;j++){
                result=str.substring(i,j+1);
                if(!set.contains(result)){
                    set.add(result);
                }
            }
             ans=set.size();
        }
        return ans;
    }
    
}
