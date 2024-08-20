object Solution {
    def leftRightDifference(nums: Array[Int]): Array[Int] = {
        def iter(nums: Array[Int], leftSum: Int, rightSum: Int, result: Array[Int]): Array[Int] = 
            nums.headOption match
                case Some(num) =>
                    val updatedLeftSum = leftSum + num
                    val updatedRightSum = rightSum - num
                    val resultValue = (updatedLeftSum - rightSum).abs
                    iter(nums.tail, updatedLeftSum, updatedRightSum, result :+ resultValue)
                case None      => result
        iter(nums, 0, nums.sum, Array.empty[Int])
    }
}