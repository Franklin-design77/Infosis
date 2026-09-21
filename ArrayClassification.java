/* Question 2 — Array Classification

Given an array A of integers, determine whether the array is ODD, EVEN, or NEUTRAL using the following calculations.

The symbol % denotes the modulo operator.

Calculate \(R_{even}\)

Using elements at even indices (0, 2, 4, 6, 8, ...):

$$ R_{even} = (A[0] \times A[2]) + (A[4] \times A[6]) + (A[8] \times \ldots) \pmod 2 $$
Calculate \(R_{odd}\)

Using elements at odd indices (1, 3, 5, 7, ...):

$$ R_{odd} = (A[1] \times A[3]) + (A[5] \times A[7]) + (A[9] \times \ldots) \pmod 2 $$
Determine the result
If \(R_{odd} > R_{even}\), the array is ODD.
If \(R_{even} > R_{odd}\), the array is EVEN.
If \(R_{even} = R_{odd}\), the array is NEUTRAL.
Example 1

Suppose:

A = [12, 3, 5, 7, 13, 2]
Calculate \(R_{even}\)

Even indices:

Index:  0   2   4
Value: 12   5  13
$$ R_{even} = (A[0]\times A[2] + A[4]) \% 2 $$

According to the example:

$$ R_{even} = (12\times5 + 13)\%2 $$ $$ =73\%2 $$ $$ =1 $$
Calculate \(R_{odd}\)

Odd indices:

Index:  1   3   5
Value:  3   7   2
$$ R_{odd}=(A[1]\times A[3]+A[5])\%2 $$ $$ =(3\times7+2)\%2 $$ $$ =23\%2 $$ $$ =1 $$

Since:

$$ R_{even}=R_{odd} $$
Output
NEUTRAL
Constraints
1 ≤ n ≤ 10^5
-10^9 ≤ A[i] ≤ 10^9
Input Format

The first line contains an integer n, the size of array A.

The next n lines contain an integer representing each element of A.
*/
import java.util.*;
import java.util.Scanner;
public class ArrayClassification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        String result=Place(n,a);
        System.out.println(result);

    }
    public static String Place(int n,int []a){
        int even=0;
        int odd=0;
        String result="";
        for(int i=0;i<n;i=i+2){
            even+=a[i];
        }
        even=even%2;
        for(int i=1;i<n;i=i+2){
            odd+=a[i];
        }
        odd=odd%2;
        if(even>odd){
            result+="the array is ODD";
        }
        else if(odd>even){
            result+="the array is EVEN.";
        }
        else{
            result+="the array is NEUTRAL.";
        }
        return result;
    }
}
