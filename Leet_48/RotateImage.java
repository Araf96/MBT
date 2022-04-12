package Leet_48;

class Solution {
    public void rotate(int[][] matrix) {
        int valMatrix[][] = new int[matrix.length][matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                valMatrix[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<valMatrix.length;i++){
            for(int j=0;j<valMatrix[i].length;j++){
                int r = j;
                int c = (matrix.length - 1) - i;
                matrix[r][c] = valMatrix[i][j];
            }
        }
    }
}

public class RotateImage {
    public static void main(String args[]) {
        int matrix[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution s = new Solution();
        s.rotate(matrix);
    }
}
