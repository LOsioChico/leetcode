class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int[] account : accounts){
            int wealth = 0;

            for(int money : account){
                wealth += money;
            }

            if(wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        return maxWealth;
    }
}