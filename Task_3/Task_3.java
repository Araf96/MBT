package Task_3;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

// int solve(int[] n){
//     int count = 0;
//     int totalPollution = Arrays.stream(n).sum();
//     int halfPollution = totalPollution/2; //I know I should have taken double but thought int wold work
//     long distinct =  Arrays.stream(n).distinct)().count();
//     if(distinct == 1l)
//      return  n; // this is the corner case where all factories pollute equally i.e [10,10]
//   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//   for(int a:n)
//      pq.add(a);
//    while(totalPollution >= halfPollution){
//        int currnetPoll = pq.poll();
//        int halfVal = currentPoll/2;
//        totalPollution -= halfVal;
//        count++;
//        pq.add(halfVal);

//  }
//  return count;
// }

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (Arrays.stream(A).distinct().count() == 1)
            return A.length;

        int tp = Arrays.stream(A).sum();
        double totPol = tp;
        double halfPol = totPol / 2.0;
        int filters = 0;

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            double t = A[i];
            pq.add(t);
        }

        while (totPol > halfPol) {
            double curr = pq.poll();
            double hc = curr / 2.0;
            pq.add(hc);
            totPol = totPol - hc;
            filters++;
        }

        return filters;
    }
}

public class Task_3 {
    public static void main(String args[]) {
        int A[] = { 5, 19, 8, 1 };
        Solution sol = new Solution();
        int res = sol.solution(A);
        System.out.println(res);
    }
}
