import java.util.*;
import java.util.Scanner;
public class FrequencyUnique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Freq(str));
    }
    static int Freq(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());

        int previous=Integer.MAX_VALUE;
        int ans=0;
        for(int freq:list){
            int current=Math.min(freq,previous-1);
            ans+=freq-current;
            previous=current;

        }
        return ans;
    }
}
