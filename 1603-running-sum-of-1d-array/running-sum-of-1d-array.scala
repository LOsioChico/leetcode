object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        def iter(nums: Array[Int], sumNums: Array[Int]): Array[Int] =
            nums.headOption match
                case Some(num) => iter(nums.tail, sumNums :+ (sumNums.last + num))
                case None => sumNums
        iter(nums.tail, Array[Int](nums.head))
    }
}