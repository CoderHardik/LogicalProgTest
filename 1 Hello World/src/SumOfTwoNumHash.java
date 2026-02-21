/*
The Scenario Array size (\(n\)):3
Array elements (\(A\)): [10, 20, 30]
Target Sum (\(num\)): 50 

Step 1: Input & Map Creation
The code first populates the HashMap hm where the key is the counter and the value is the array element.
Step	Array Element (a)	Logic	Map State (Key=Value)
1	10	hm.put(0, 10)	{0=10}
2	20	hm.put(1, 20)	{0=10, 1=20}
3	30	hm.put(2, 30)	{0=10, 1=20, 2=30}

Console Output so far:
text
Key 0 and value 10
Key 1 and value 20
Key 2 and value 30

Step 2: The Search Loop The code now loops through the array again to find the "complement" (the number needed to reach the target sum).
Formula: \(temp=num-A[i]\) 

Step 3: Final Output
Every time the "Check" is YES, the program prints the pair.
text
Values 20 and 30 are the pair
Values 30 and 20 are the pair

Actually it can be done much easier way as below.
*/


import java.util.*;
public class FindSumOfTwo {

    public static void main(String[] args) {
        int A[]= {10, 20, 30};
        int target = 50;
        sumoftwo(A, target);
    }

    public static void sumoftwo(int A[], int target) {
        
        Set <Integer> result = new HashSet<>();
        
        for (int i: A){
            int compliment = target-i;
            if (result.contains(compliment)){
                System.out.println("numbers are "+i+" and "+compliment);
            }
            result.add(i);
        }
    }
    
}
