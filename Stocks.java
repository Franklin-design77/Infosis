/*
Question 1 — Cloud Computing VM Revenue

In a cloud computing platform, there are n virtual machine (VM) types. The number of available instances for each type is given in vmStock.

Each customer rents exactly one VM.

The price paid is the current available instance count of the chosen VM type at that moment.
Customers arrive one by one (m customers in total).
Each customer always selects the VM type that is currently most expensive, meaning the type with the highest remaining stock.
If multiple VM types tie for the highest stock, any of them may be chosen.
After a VM is rented, the chosen VM type's stock decreases by 1.

Compute the total revenue earned after serving all m customers.

Example
n = 3
vmStock = [1, 2, 4]
m = 4

There are 3 different types of VMs available with 4 customer requests.

Simulation of Purchases
Customer	VM Type	Cost	Remaining Stock
Initial state	—	—	[1, 2, 4]
1	3	4	[1, 2, 3]
2	3	3	[1, 2, 2]
3	2 (or 3)	2	[1, 1, 2]
4	3	2	[1, 1, 1]

The revenue earned is:

$$ 4+3+2+2=11 $$

Therefore, the answer is:

11
Constraints

The image cuts off the lower part of the constraints, so the complete constraint section is not visible.

Today 5:41 PM
i did not understand the question

No problem. Let's understand the VM question without code first.

What is happening?

Imagine a cloud company has 3 types of VMs:

VM Type 1 → 1 machine available
VM Type 2 → 2 machines available
VM Type 3 → 4 machines available

So:

vmStock = [1, 2, 4]

There are 4 customers:

m = 4

Each customer wants to rent one VM.

The important rule

The customer always chooses the VM type that currently has the highest number of machines remaining.

And the price they pay = that number of machines remaining before renting.

After they rent it, that VM's stock decreases by 1.

Customer 1

Initial stock:

VM1   VM2   VM3
 1     2     4

Which has the highest stock?

VM3 = 4

So customer 1 chooses VM3.

They pay:

4

Then VM3 decreases by 1:

VM1   VM2   VM3
 1     2     3

Revenue:

4
Customer 2

Current stock:

VM1   VM2   VM3
 1     2     3

Highest stock:

VM3 = 3

Customer 2 chooses VM3.

They pay:

3

Then:

VM1   VM2   VM3
 1     2     2

Total revenue:

4 + 3 = 7
Customer 3

Current stock:

VM1   VM2   VM3
 1     2     2

Now VM2 and VM3 both have the highest stock:

VM2 = 2
VM3 = 2

The question says:

If multiple VM types tie for highest stock, any of them may be chosen.

So suppose we choose VM3.

Customer 3 pays:

2

After renting:

VM1   VM2   VM3
 1     2     1

Total revenue:

4 + 3 + 2 = 9
Customer 4

Current stock:

VM1   VM2   VM3
 1     2     1

Highest stock is:

VM2 = 2

Customer 4 chooses VM2.

They pay:

2

After renting:

VM1   VM2   VM3
 1     1     1

Total revenue:

 4+3+2+2 ={11} 

 Sample 2
3
5 3 2
3
*/
import java.util.*;
import java.util.Scanner;
public class Stocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        
        int result=stock(n,a,m);
        System.out.println(result);

    }
    public static int stock(int n,int a[],int m){
        int sum=0;
       
        for(int j=0;j<m;j++){
             int max=0;
             int u=0;
            for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                u=i;
            }
        }
        sum+=max;
        a[u]=a[u]-1;
    }
    return sum;
        
  }
}