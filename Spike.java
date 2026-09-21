/*
Count the Number of Spikes

A lab sensor records N temperature readings over time. A reading is called a spike if it is strictly greater than both its immediate neighbours. The first and last readings can never be spikes.

Input Format

Line 1: Integer N

$$ 3 \leq N \leq 10^5 $$

Line 2: N space-separated integers T[i]

$$ -10^3 \leq T[i] \leq 10^3 $$
Output Format

Print a single integer — the number of spikes.

Example 1
Input
6
1 5 2 8 3 1
Output
2
Explanation
Index 1: 5 > 1 and 5 > 2 → spike
Index 3: 8 > 2 and 8 > 3 → spike

Therefore, the total number of spikes is:2 
*/
import java.util.*;
import java.util.Scanner;
public class Spike {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int answer=Spi(n,a);
        System.out.print(answer);
    }
    public static int Spi(int n,int[]a){
        int count=0;
        for(int i=1;i<n-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                count++;
            }
        }
        return count;
    }
}
