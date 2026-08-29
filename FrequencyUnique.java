/*Question: Minimum Deletions to Make Character Frequencies Unique

Given a string s containing lowercase English letters, delete characters from the string so that no two different characters have the same frequency.

Return the minimum number of deletions required.

Input
aaabbbcc
Output
2
Explanation

The frequencies are:

a → 3
b → 3
c → 2

Frequencies must be unique.

Delete one b:

a → 3
b → 2
c → 2

Still duplicate.

Delete one c:

a → 3
b → 2
c → 1

Now the frequencies are:

3, 2, 1

They are unique.

Therefore:

Output = 2 */





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
