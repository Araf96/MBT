package Leet_54;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        int l = 0, r = matrix[0].length - 1, d = matrix.length - 1, u = 0;

        int size = matrix.length * matrix[0].length;

        while (res.size() < size) {
            for (int i = l; i <= r && res.size() < size; i++) {
                res.add(matrix[u][i]);
            }

            for (int i = u + 1; i <= d - 1 && res.size() < size; i++) {
                res.add(matrix[i][r]);
            }

            for (int i = r; i >= l && res.size() < size; i--) {
                res.add(matrix[d][i]);
            }

            for (int i = d - 1; i >= u + 1 && res.size() < size; i--) {
                res.add(matrix[i][l]);
            }
            u++;
            l++;
            r--;
            d--;
        }

        return res;
    }
}

public class SpiralMax {
    public static void main(String args[]) {
        Solution sol = new Solution();
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List l = sol.spiralOrder(matrix);
        System.out.println(l.toString());
    }
}
