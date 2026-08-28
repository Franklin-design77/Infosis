import java.util.*;
public class Substring {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Sub(str));
    }
    static int Sub(String str){
        HashSet<Character>set=new HashSet<>();
        int i=0;
        int max=0;
        for(int r=0;r<str.length();r++){
            char ch=str.charAt(r);
            while(set.contains(ch)){
                set.remove(str.charAt(i));
                i++;
            }
            set.add(ch);
            max=Math.max(max, (r-i)+1);
        }
        return max;
    }
}
