/*
Question: Maximum Sum of Distinct Elements After Splitting

Given an array arr of size n, split the array into two non-empty subarrays at any index i, where:

$$ 1 \leq i < n $$

The two subarrays are:

arr[0 ... i-1]
arr[i ... n-1]

For each possible split:

Count the number of distinct elements in the left subarray.
Count the number of distinct elements in the right subarray.
Add the two counts.
Find the maximum possible sum among all valid splits.

Return the maximum sum.

Input Format
Line 1: Integer n
Line 2: n space-separated integers representing arr
Output Format

Print a single integer representing the maximum possible sum of distinct element counts.

Example 1
Input
5
1 2 1 3 4
Possible splits
Split 1
[1] | [2, 1, 3, 4]

Distinct counts:

Left  = {1}          → 1
Right = {2,1,3,4}   → 4

Sum:

1 + 4 = 5
Split 2
[1, 2] | [1, 3, 4]

Distinct counts:

Left  = {1,2}      → 2
Right = {1,3,4}    → 3

Sum:

2 + 3 = 5
Split 3
[1, 2, 1] | [3, 4]

Distinct counts:

Left  = {1,2} → 2
Right = {3,4} → 2

Sum:

2 + 2 = 4
Split 4
[1, 2, 1, 3] | [4]

Distinct counts:

Left  = {1,2,3} → 3
Right = {4}     → 1

Sum:

3 + 1 = 4

Therefore, the maximum is:

$$ \boxed{5} $$
Output
5
*/
import java.util.*;
public class Array_Split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int result=Answer(n,a);
        System.out.println(result);
    }
    public static int Answer(int n,int []a){
        int result=0;
        int max=0;
        for(int i=1;i<n;i++){
            HashSet<Integer>left=new HashSet<>();
            for(int j=0;j<i;j++){
                left.add(a[j]);
            }
            HashSet<Integer>right=new HashSet<>();
            for(int j=i;j<n;j++){
                right.add(a[j]);
            }
            int left_length=left.size();
            int right_length=right.size();
            result=left_length+right_length;

            if(max<result){
                max=result;
            }

            
        }
        return max;
    }
}
