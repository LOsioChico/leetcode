object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        def iter(index: Int, sumNums: Array[Int]): Array[Int] = 
            if(index == nums.length) then sumNums
            else
                val sum = nums(index) + sumNums(index - 1)
                iter(index + 1, sumNums :+ sum)

        iter(1, Array[Int](nums(0)))
    }
}