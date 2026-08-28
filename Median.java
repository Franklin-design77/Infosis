import java.util.Scanner;
import java.util.*;
public class Median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int mid=0;
        int i=0;
        int j=a.length-1;
        if(a.length%2==0){
            mid=((i+j)/2)+1;
        }
        else{
            mid=(i+j)/2;
        }
        System.out.println(a[mid]);




    }
}
