public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] differenceArray = new int[n];
        int sumLeft = 0;
        int sumRight = 0;

        for(int i = 0; i < n; i++){
            sumRight += nums[i];
        }

        for(int i = 0; i < n; i++){
            sumLeft += nums[i];
            differenceArray[i] = Math.abs(sumLeft - sumRight);
            sumRight -= nums[i];
        }

        return differenceArray;
    }
}