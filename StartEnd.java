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