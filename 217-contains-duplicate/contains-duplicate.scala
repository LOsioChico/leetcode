object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        def iter(nums: Array[Int], seen: Set[Int]): Boolean =
            if(nums.nonEmpty) then
                if(seen(nums.head)) then true
                else iter(nums.tail, seen + nums.head)
            else false

        iter(nums, Set.empty[Int])
    }
}