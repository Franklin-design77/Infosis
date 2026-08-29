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