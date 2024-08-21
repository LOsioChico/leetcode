public class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for(int i : gain) {
            currentAltitude += i;
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }

        return maxAltitude;
    }
}