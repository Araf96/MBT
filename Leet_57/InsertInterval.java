// package Leet_57;

// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;

// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
//         //List<int[]> list = new ArrayList<int[]>();
//         HashSet<int[]> hs = new HashSet<int[]>();
//         int newStart = -1, newEnd = -1;
//         for (int i = 0; i < intervals.length; i++) {
//             int startI = intervals[i][0];
//             int endI = intervals[i][1];

//             if (newInterval[0] < startI && newInterval[1] < endI) {
//                 newStart = newInterval[0];
//                 newEnd = newInterval[1];
//                 hs.add(new int[] { newStart, newEnd });
//             } else if (newInterval[0] >= startI && newInterval[1] <= endI) {
//                 newStart = startI;
//                 newEnd = endI;
//                 hs.add(new int[] { newStart, newEnd });
//             } else if (newInterval[0] >= startI && newInterval[0] <= endI && newInterval[1] > endI) {
//                 newStart = startI;
//             } else if (newInterval[0] < startI && newInterval[1] > endI) {
//                 continue;
//             } else if (newInterval[0] < startI && newInterval[1] <= endI) {
//                 newEnd = endI;
//                 hs.add(new int[] { newStart, newEnd });
//             } else if (newInterval[0] < startI && newInterval[1] <= endI) {

//             }
//         }

//         if (hs.size() == intervals.length) {
//             hs.add(new int[] { newInterval[0], newInterval[1] });
//         }
//     }
// }

// public class InsertInterval {
//     public static void main(String args[]) {
//         int[][] intervals = { { 1, 3 }, { 6, 9 } };
//         int newInterval[] = { 2, 5 };
//         Solution sol = new Solution();
//         int res[][] = sol.insert(intervals, newInterval);
//         for (int i = 0; i < res.length; i++) {
//             for (int j = 0; j < res[i].length; j++) {
//                 System.out.print(res[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
