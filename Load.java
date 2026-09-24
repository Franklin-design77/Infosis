/*
Question

You are given two arrays of size n:

timestamp[i] represents the time at which a load was recorded.
load[i] represents the load recorded at that timestamp.
windowSize represents the length of a time window.

Find the maximum total load recorded within any time window of length windowSize.

A timestamp t belongs to a window starting at start if:

start <= t < start + windowSize
Example
timestamp = [1, 3, 7, 5]
load      = [10, 20, 40, 30]
windowSize = 4

The maximum total load is:

70

because the window [5, 9) contains:

time 5 → load 30
time 7 → load 40

30 + 40 = 70
*/
import java.util.*;
import java.util.Scanner;
public class Load {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[]time=new long[n];
        long[]load=new long[n];
        for(int i=0;i<n;i++){
            time[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            load[i]=sc.nextInt();
        }
        long window=sc.nextLong();

        long result=func(time,load,window);
        System.out.println(result);
    }
    public static long func(long[]time,long[]load,long window){
        long[][]tu=new long[time.length][2];
        for(int i=0;i<time.length;i++){
            tu[i][0]=time[i];
            tu[i][1]=load[i];    
        }
        Arrays.sort(tu,(a,b)->Long.compare(a[0],b[0]));

        long sum=0;
        long max=0;
        int right=0;
        for(int left=0;left<time.length;left++){
            while(right<time.length && tu[right][0]<tu[left][0]+window){
                sum+=tu[right][1];
                right++;
                
            }
            max=Math.max(max, sum);
            sum-=tu[left][1];
        }
        return max;
    }
}
