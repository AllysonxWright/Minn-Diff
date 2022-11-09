import java.util.function.Function;

/* 
This problem is in the PClassic 2019f Problem Set (https://pclassic.org/problems)
During lunch time, your friend tells you that there will
be a broomflying pop quiz this afternoon. In the
Magical Learning Gym, there are n consecutives stones
in a row and each with a different height. To pass the
quiz, you need to successfully (and gracefully) fly from
a stone to the consecutive one. Since the smaller the
height difference is, the higher chance of you passing
the quiz is, thus, as a newbie, you want to find the
minimum difference between two consecutive stones. 
Extra Challenge: 
Return the INDEX of the stone that you should 
stand by in a new function, minDiffStone(). 
*/

/* ClASS NOTES 
- What do the numbers in the array represent = the stone heights 
- Look at each pair in the array and fet the absolute value of the differece so it does not matter if you do 34-1 or 1-34 
- minimum difference - between 4 and 6  = 2
- create an array of length n-1 

*/

public class MinDiff {
    public static void main(String[] args) throws Exception {
        int[] intArray1 = { 1, 34, 4, 6, 14, 2 };
        int ans1 = minDiff(intArray1); // Should be 2 as |4 - 6| = 2;
        System.out.println("Min Diff of {1, 34, 4, 6, 14, 2} is: " + ans1);

        int[] intArray2 = { 23, 15, 46, 75, 6, 74, 100 };
        int ans2 = minDiff(intArray2); // Should be 8 as |23 - 15| = 8;
        System.out.println("Min Diff of {23, 15, 46, 75, 6, 74, 100} is: " + ans2);
    }

    private static int minDiff(int[] stones) {
        int smallestsoFar = Integer.MAX_VALUE; // make it the biggest integer
        for (int i=0; i < stones.length-1; i++) {
            int currentDiff = Math.abs(stones[i] - stones [i + 1]); // using absolute value 
            if (currentDiff <  smallestsoFar ) {
                 // now you need to update the smallest so far 
            smallestsoFar = currentDiff; // now when you return smallest so farr it will give you the current difference 
            }

        }
        return smallestsoFar;
            
    }

}
    



    
    




