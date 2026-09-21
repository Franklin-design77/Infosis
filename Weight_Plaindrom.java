/*Question: Sum of Weights of Palindromic Substrings

Given a string s, find the sum of the alphabetical weights of all palindromic substrings of the string.

The alphabetical weight of each character is defined as:

a = 1
b = 2
c = 3
...
z = 26

A palindromic substring is a substring that reads the same from left to right and right to left.

For every palindromic substring, calculate the sum of the weights of its characters and add all these values together.

Return the final answer.

Input Format
Line 1: A string s
Output Format
Print a single integer representing the sum of the weights of all palindromic substrings.
Example 1

Input:

abcbd

Palindromic substrings:

a
b
c
b
d
bcb

Their weights are:

a   = 1
b   = 2
c   = 3
b   = 2
d   = 4
bcb = 2 + 3 + 2 = 7

Therefore:

$$ 1+2+3+2+4+7=19 $$

Output:

19
Example 2

Input:

aaa

Palindromic substrings:

a
a
a
aa
aa
aaa

Weights:

1 + 1 + 1 + 2 + 2 + 3

Therefore:

Output:
10
Example 3

Input:

abc

Palindromic substrings:

a
b
c

Weights:

1 + 2 + 3 = 6

Output:6 
*/
import java.util.*;
import java.util.Scanner;
public class Weight_Plaindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        long answer=Palin(str);
        System.out.println(answer);
    }
    public static long Palin(String str){
        int n=str.length();
        long result=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=str.substring(i,j+1);
                if(isPalindrom(sub)){
                    long sum=0;
                    for(int k=0;k<sub.length();k++){
                        sum+=(sub.charAt(k)-'a')+1;
                }
                result+=sum;
            }
            
        }
        
    }
    return result;
 }
    static boolean isPalindrom(String sub){
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
