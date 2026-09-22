/*
Question 1 — Meeting Room Availability

You are given m meeting rooms, numbered from 1 to m, along with a list of existing bookings. For a requested meeting window, determine which rooms are available for the entire duration of that window.

A room is considered available if it has no booking that overlaps with the requested meeting window.

Note
If one meeting ends exactly at time t and another starts at time t, they do not overlap.
You are given
requestedStartTime and requestedEndTime: the start and end time of the requested meeting.
m: the total number of rooms.
existingBookings, where each booking contains:
room ID
booking start time
booking end time
Output

Return all room IDs that remain available throughout the requested meeting window, sorted in increasing order.

Example
Input
requestedStartTime = 5
requestedEndTime = 10
m = 4
existingBookings = [[1, 3, 5], [1, 1, 2], [2, 2, 6]]
Output
[1, 3, 4]
Explanation
Room 1 has meetings at [1, 2] and [3, 5].
These do not overlap with the requested window [5, 10].
The meeting ending at 5 and the requested meeting starting at 5 do not overlap.
Room 2 has a meeting at [2, 6].
This overlaps with the requested window [5, 10] at time 5.
Therefore, Room 2 is unavailable.
Rooms 3 and 4 have no meetings scheduled.
Therefore, they are available.

Hence:

[1, 3, 4]
Key overlap condition

A booking overlaps the requested window if:

bookingStart < requestedEnd
AND
bookingEnd > requestedStart

If this condition is false, the room is available for that booking.
*/
import java.util.*;
public class Room_available {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start_time=sc.nextInt();
        int end_time=sc.nextInt();
        int Num_Room=sc.nextInt();
        int[][]existingBookings={
            {1,3,5},
            {1,1,2},
            {2,2,6}
        };
        ArrayList<Integer>list=fun(start_time,end_time,Num_Room,existingBookings);
        System.out.print(list);
    }
    public static ArrayList<Integer> fun(int start_time,int end_time,int Num_Room,int[][]existingBookings){
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=1;i<=Num_Room;i++){
            boolean Available=true;
            for(int j=0;j<existingBookings.length;j++){
                int Room_num=existingBookings[j][0];
                int Book_start=existingBookings[j][1];
                int Book_end=existingBookings[j][2];

                if(i==Room_num){
                    if(Book_start<end_time && Book_end>start_time){
                    Available=false;
                    break;
                }
              }
            }
            if(Available){
                result.add(i);
            }
        }
        return result;
    }
}
