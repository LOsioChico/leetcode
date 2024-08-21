object Solution {
    def maximumWealth(accounts: Array[Array[Int]]): Int = {
        def iter(accounts: Array[Array[Int]], maxWealth: Int): Int =
            accounts.headOption match
                case Some(account) =>
                    val wealth = account.sum
                    iter(accounts.tail, maxWealth.max(wealth))
                case None          => maxWealth

        iter(accounts, 0)
    }
}