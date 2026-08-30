/*Activity Selection Problem – Question
Problem Statement

You are given N activities, where each activity has a start time and an end time.

You can select an activity only if its start time is greater than or equal to the end time of the previously selected activity.

Your task is to find the maximum number of non-overlapping activities that can be selected.

To solve the problem, use the Greedy Algorithm by sorting the activities according to their end time.

Input Format
The first line contains an integer N, representing the number of activities.
The next N lines contain two integers:
start – starting time of the activity
end – ending time of the activity
Output Format

Print the maximum number of activities that can be selected without overlapping.

Sample Input
5
1 3
2 4
3 5
5 7
6 8
Sample Output
3*/

import java.util.*;
import java.util.Scanner;
public class StartEnd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int act[][]=new int[n][2];
        for(int i=0;i<n;i++){
            act[i][0]=sc.nextInt();
            act[i][1]=sc.nextInt();
        }
        System.out.println("Maximum Activity: "+Act(act,n));
    }
    static int Act(int[][]act,int n) {
        Arrays.sort(act,(a,b)->a[1]-b[1]);
        int endStart=act[0][1];
        int count=1;
        for(int i=1;i<n;i++){
            int start=act[i][0];
            int end=act[i][1];

            if(start>=endStart){
                count++;
                endStart=end;
            }
        }
        return count;

    }
}
