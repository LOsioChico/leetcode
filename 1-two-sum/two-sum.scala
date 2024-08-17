object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] =
    def findPair(index: Int, current: Map[Int, Int]): Array[Int] =
        val complementIndex = target - nums(index)
        current.get(complementIndex) match 
            case Some(savedIndex) => Array(savedIndex, index)
            case None => findPair(index + 1, current + (nums(index) -> index))

    findPair(0, Map.empty[Int, Int])
}