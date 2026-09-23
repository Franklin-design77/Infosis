/*
Question 1 — Converted to Text

You are working on a lightweight search engine indexing module, and one of the early tasks is to filter out non-informative words that appear too frequently, often called stop words. These words are so common across documents that they dilute search relevance.

Implement a function that finds all the words that occur in the string text at least k times.

Function Description

The function findStopWords will take two inputs:

string text: a string containing words of letters in the English alphabet separated by spaces, " "
int k: the minimum number of occurrences of a word required to be considered as a stop word

The function should return an array of strings, the stop words in order of their first occurrence in the string.

Example
text = "a mouse is smaller than a dog but a dog is stronger"
k = 2

The list of stop words that occur at least k = 2 times is:

["a", "is", "dog"]
"a" occurs 3 times
"is" occurs 2 times
"dog" occurs 2 times

No other word occurs at least 2 times.

The answer is in the order of the first occurrence in text.

Constraints
text has at most 50000 characters.
Every character in text is either an English lowercase letter or a space.
text starts and ends with a letter.
No consecutive characters are spaces, i.e., text is a valid sentence.
There will be at least one stop word in the text.
sample test case

Sure 👍 Here are some sample test cases for the Stop Words problem.

Sample Test Case 1

Input:

a mouse is smaller than a dog but a dog is stronger
2

Output:

a is dog

Explanation:

a   → 3 times
is  → 2 times
dog → 2 times
Sample Test Case 2

Input:

hello world hello java world java java
2

Output:

hello world java

Counts:

hello → 2
world → 2
java  → 3

Order is based on first occurrence.
*/
import java.util.*;
import java.util.Scanner;
public class Count_Orrucance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        ArrayList<String>result=func(str,k);
        System.out.println(result);

    }
    public static ArrayList<String> func(String str,int k){
       String[] arr=str.split(" ");
       HashMap<String,Integer>map=new HashMap<>();
       for(String h:arr ){
        
            map.put(h,map.getOrDefault(h,0)+1);
        
       }
       ArrayList<String>list=new ArrayList<>();
       for(String one:arr){
        if(map.get(one)>=k && !list.contains(one)){
            list.add(one);
        }
       }
       return list;
    }
}
