object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        def iter(nums: Array[Int], seen: Set[Int]): Boolean =
            nums.headOption match
                case Some(num) => 
                    if (seen(num)) then true
                    else iter(nums.tail, seen + num)
                case None => false

        iter(nums, Set.empty[Int])
    }
}