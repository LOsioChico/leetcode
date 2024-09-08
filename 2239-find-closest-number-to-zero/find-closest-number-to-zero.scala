object Solution {
    def findClosestNumber(nums: Array[Int]): Int = {
        def iter(nums: Array[Int], closest: Int): Int = nums.headOption match
            case Some(num) =>
                val newClosest = (num.abs, closest.abs) match
                    case (numAbs, closestAbs) if numAbs == closestAbs => num.max(closest)
                    case (numAbs, closestAbs) if numAbs < closestAbs  => num
                    case _                                            => closest
                iter(nums.tail, newClosest)
            case None      => closest

        iter(nums.tail, nums.head)
    }
}