class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnesIdx = 0;
        int maxOnesCount = 0;
        for(int i = 0; i < mat.length; i++){
            int onesCount = 0;

            for(int j = 0; j < mat[i].length; j++){
                onesCount += mat[i][j];
            }

            if(onesCount > maxOnesCount){
                maxOnesIdx = i;
                maxOnesCount = onesCount;
            }
        }
        return new int[]{maxOnesIdx, maxOnesCount};
    }
}
