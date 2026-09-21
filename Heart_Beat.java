/*Question 1

You are given heartbeat records. Each record has:

timestamp (in seconds) when the heartbeat was recorded, and
serviceId it came from.

For each service ID, order its heartbeats by timestamp. If the gap between any two consecutive heartbeats is greater than the threshold, that service timed out at least once.

Return an array of strings with the service IDs that timed out at least once. The array must be sorted in lexicographical order.

Note: Heartbeats are not sorted by timestamp in the input.

Example 1

Input:

timestamp = [10, 20, 60, 10, 66]
serviceId = ["svc1", "svc1", "svc1", "svc2", "svc2"]
threshold = 30

Output:

["svc1", "svc2"]

Explanation:

For svc1: heartbeats at 20s and 60s are 40 seconds apart → exceeds threshold 30 → timed out.
For svc2: heartbeats at 10s and 66s are 56 seconds apart → exceeds threshold 30 → timed out.
Example 2

Input:

timestamp = [1, 2, 3]
serviceId = ["svc1", "svc2", "svc1"]
threshold = 1

Output:

["svc1"]

Explanation:

For svc1: heartbeats at timestamps 1 and 3 are 2 seconds apart → exceeds threshold 1 → timed out.
For svc2: only one heartbeat → no timeout.
Constraints
1 ≤ length of the arrays ≤ 2 × 10^5
1 ≤ timestamp[i] ≤ 10^9
1 ≤ length of serviceId ≤ 10
serviceId[i] consists only of lowercase English letters (a-z) and digits (0-9)
0 ≤ threshold ≤ 10^9  */

import java.util.*;
public class Heart_Beat{
    public static void main(String[]args){
        long[]timestamp = {10, 20, 60, 10, 66};
        String []serviceId = {"svc1", "svc1", "svc1", "svc2", "svc2"};
        long threshold = 30;
        ArrayList<String>answer=First(timestamp,serviceId,threshold);
        System.out.print(answer);

    }
    public static ArrayList<String> First(long[]timestamp,String[]serviceId,long threshold){
        HashMap<String,ArrayList<Long>>map=new HashMap<>();
        for(int i=0;i<timestamp.length;i++){
            if(!map.containsKey(serviceId[i])){
                map.put(serviceId[i],new ArrayList<>());
            }
            map.get(serviceId[i]).add(timestamp[i]);
        }
        ArrayList<String>result=new ArrayList<>();
        for(String str:map.keySet()){
            List<Long>time=map.get(str);
            Collections.sort(time);

            for(int i=1;i<time.size();i++){
                long gap= time.get(i)-time.get(i-1);
                if(gap>threshold){
                    result.add(str);
                    break;
                }
                
            }

        }
        Collections.sort(result);
        return result;

    }
}