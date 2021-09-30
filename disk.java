/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

		// your code goes here
		static int findMaxElement(int[] arr,
                                              int k, int n)
    {
        // creating the max heap ,to get max element always
        PriorityQueue<Integer> queue = new PriorityQueue<>();
 
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
 
        for (; i < k; i++)
            queue.add(arr[i]);
 
        // adding the maximum element among first k elements
        res.add(queue.peek());
 
        // removing the first element of the array
        queue.remove(arr[0]);
 
        // iterarting for the next elements
        for (; i < n; i++) {
 
            // adding the new element in the window
            queue.add(arr[i]);
 
            // finding & adding the max element in the
            // current sliding window
            res.add(queue.peek());
 
            // finally removing the first element from front
            // end of queue
            queue.remove(arr[i - k + 1]);
        }
		int max = 0;
		for (int x : res)
			if(x>max){
				max = x;
			}
        return max;
 
        // this code is Contributed by Pradeep Mondal P
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 8,2,4,6 };
        int k = 2, n = arr.length;
 
        int result = findMaxElement(arr, k, n);
        System.out.print(result);
	}
}
