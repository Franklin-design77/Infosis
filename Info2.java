import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Info2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Aray(str));
        
    }
    static String Aray(String str){
        ArrayList<Character>list=new ArrayList<>();
        for(char ch:str.toCharArray()){
            if(vowels(ch)){
                list.add(ch);
            }
        }
        Collections.sort(list);
        int index=0;
        char as[]=str.toCharArray();
        for(int i=0;i<as.length;i++){
            char d=str.charAt(i);
            if(vowels(d)){
                as[i]=list.get(index);
                index++;
            }
        }
        return new String(as);

        
    }
    static boolean vowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}
