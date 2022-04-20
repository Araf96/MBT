package Leet_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> l = new ArrayList<int[]>();
        int start = -1;
        int end = -1;
        int idx = -1;
        Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);
        for (int i = 0; i < intervals.length; i++) {
            if (start == -1) {
                start = intervals[i][0];
                end = intervals[i][1];
                l.add(new int[]{start, end});
                idx++;
            } else if (intervals[i][0] <= end) {
                end = intervals[i][1] > end ? intervals[i][1] : end;
                l.set(idx, new int[]{start, end});
            } else {
                start = intervals[i][0];
                end = intervals[i][1];
                l.add(new int[]{start, end});
                idx++;
            }
        }

        
        int res[][] =  new int[l.size()][];
           for(int i=0;i<l.size();i++) {
           	int a[] =  new int[2];
           	for(int j=0;j<2;j++) {
           		a[j] =  l.get(i)[j];
           	}
           	res[i] =  a;
           }
        return res;

    }
}

public class MergeIntervals {
    public static void main(String args[]) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        Solution sol = new Solution();
        int res[][] = sol.merge(intervals);
        System.out.println(res.toString());
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0]+ " " + res[i][1]);
        }
    }
}
