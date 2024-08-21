class Solution {
    public static int diagonalSum(int[][] mat) {
        int totalSum = 0;

        for(int i = 0; i < mat.length; i++){
            totalSum += mat[i][i] + mat[i][mat.length - i - 1];
        }

        if(mat.length % 2 != 0){
            totalSum -= mat[mat.length / 2][mat.length / 2];
        }

        return totalSum;
    }
}