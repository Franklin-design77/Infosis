/*
Question 1 — HackerCards

HackerCards is a card game where each card type has a unique ID greater than or equal to 1, and the cost of a card is equal to its ID.

Leanne already owns the cards based on her collection. Mike wants to buy as many additional cards as possible within a budget of d, subject to the following rules:

He can buy at most one of each card.
He cannot buy any card that Leanne already owns.
The total cost of the purchased cards must be at most d.
If multiple choices are possible, he always prefers the lower-cost cards first.

Return the IDs of the cards Mike will buy, in ascending order.

Example
collection = [2, 4, 5]
d = 7

Leanne owns the cards in the collection, and Mike has a budget of 7.

He can purchase a maximum of 2 additional cards:

1 and 3

Their total cost is:

$$ 1+3=4 $$

Other options such as:

1 and 6

cost more, while 7 alone is fewer cards.

Therefore, Mike buys:

[1, 3]
Function Description

Complete the function hackerCards in the editor with the following parameters:

int collection[n]  → ID numbers of cards in Leanne's collection
int d              → Mike's budget
Returns
int[] → the IDs of the cards Mike will purchase, in ascending order

The image cuts off the remaining constraints and return details.
*/

import java.util.*;
import java.util.Scanner;
public class Card_cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        ArrayList<Integer>list=func(d,a);
        System.out.println(list);

    }
    public static ArrayList<Integer> func(int d,int[]a){
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int h:a){
            set.add(h);
        }
        int cost=0;
        for(int i=1;i<d;i++){
            if(set.contains(i)){
                continue;
            }
            if(cost+i<=d){
                result.add(i);
                cost+=i;
            }
            else{
                break;
            }
        }
        return result;
    }
}
