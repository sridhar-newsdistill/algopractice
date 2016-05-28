package org.sridhar.algopractice.basicproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
 * 
 *  The Monk is trying to explain to its users that even a single unit of time can be extremely important and to demonstrate this particular fact he gives them a challenging task.

There are N processes to be completed by you, the chosen one, since you're Monk's favorite student. All the processes have a unique number assigned to them from 1 to N.

Now, you are given two things:

    The calling order in which all the processes are called.
    The ideal order in which all the processes should have been executed.

Now, let us demonstrate this by an example. Let's say that there are 3 processes, the calling order of the processes is: 3 - 2 - 1. The ideal order is: 1 - 3 - 2, i.e., process number 3 will only be executed after process number 1 has been completed; process number 2 will only be executed after process number 3 has been executed.

    Iteration #1: Since the ideal order has process #1 to be executed firstly, the calling ordered is changed, i.e., the first element has to be pushed to the last place. Changing the position of the element takes 1 unit of time. The new calling order is: 2 - 1 - 3. Time taken in step #1: 1.

    Iteration #2: Since the ideal order has process #1 to be executed firstly, the calling ordered has to be changed again, i.e., the first element has to be pushed to the last place. The new calling order is: 1 - 3 - 2. Time taken in step #2: 1.

    Iteration #3: Since the first element of the calling order is same as the ideal order, that process will be executed. And it will be thus popped out. Time taken in step #3: 1.

    Iteration #4: Since the new first element of the calling order is same as the ideal order, that process will be executed. Time taken in step #4: 1.

    Iteration #5: Since the last element of the calling order is same as the ideal order, that process will be executed. Time taken in step #5: 1.

Total time taken: 5 units.

PS: Executing a process takes 1 unit of time. Changing the position takes 1 unit of time.*/

public class IdealOrderPrinting {

  public static void main(String[] args) throws IOException {
  // TODO Auto-generated method stub
  /*
   * Read input from stdin and provide input before running
  */
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String line = br.readLine();
  int N = Integer.parseInt(line);
  int srcArray[] = new int[N];
  int tgtArray[] = new int[N];
  //int count =0; 
  Stack<Integer> sourceStack = new Stack<Integer>();
  String arr[]=br.readLine().split("[\\s]");
  for (int i = 0; i < N; i++) {
    srcArray[i] = Integer.parseInt(arr[i]);

  }
  arr = br.readLine().split("[\\s]");
  for (int i = 0; i < N; i++) {
    tgtArray[i] = Integer.parseInt(arr[i]);
    
  }
  for(int i =0;i<N;i++)
  {
    sourceStack.push(new Integer(tgtArray[N-i-1]));
  }
  int i = 0;
  int count = 0;
  while (i < N) {
    while (!sourceStack.peek().equals(srcArray[i])) {
      swap(srcArray, i);
      //i++;
      count++;
    }
    sourceStack.pop();
    count++;
    i++;
  }
  System.out.println(count);
}

 private static void swap(int[] a, int i) {
  int temp = a[i];
  while(i<a.length-1){
    a[i]=a[i+1];
    i++;
  }
   a[a.length - 1]=temp;
  //a[a.length - 1] = temp;
}


}
