/*Maximum Candies Allocated to K Children — Question

You are given an integer array candies, where candies[i] represents the number of candies in the ith pile.

You have k children and want to distribute candies to them such that:

Each child receives the same number of candies.
A child can receive candies from only one pile.
A pile can be divided among multiple children.
All children must receive at least 1 candy.
Your goal is to maximize the number of candies each child receives.
Input
candies = [5, 8, 6]
k = 3
Output
5
Explanation

If each child gets 5 candies:

5 → 1 child
8 → 1 child (5 used, 3 left)
6 → 1 child (5 used, 1 left)

So we can give:

Child 1 → 5 candies
Child 2 → 5 candies
Child 3 → 5 candies

Therefore, the maximum number of candies each child can receive is:

5
Another Example
candies = [1, 2, 3, 4, 10]
k = 5

Output:

3

Because we can make:

1 → 0 children
2 → 0 children
3 → 1 child
4 → 1 child
10 → 3 children

Total:

1 + 1 + 3 = 5 children

So each child can receive 3 candies.

Expected Algorithm

This problem is usually solved using:

Binary Search on Answer

For a guessed value x, calculate:*/


import java.util.*;
import java.util.Scanner;

public class Candies{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(Candy(a,k));
    }
    static int Candy(int[]a,int k){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int i=1;
        int ans=0;
        while(i<=max){
            int mid=(i+max)/2;
            int child=0;
            for(int x:a){
                child+=x/mid;
            }
            if (child >= k) { 
                ans = mid; 
                i = mid + 1; 
            } 
            else { 
                max = mid - 1; 
            } 
        } 
        return ans; 
    }
        
}
