import java.util.HashSet;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> hashSet = new HashSet<>();

    for(int num : nums){
      if (!hashSet.add(num)){
        return true;
      }
    }

    return false;
  }
}
