object Solution {
    def makeGood(s: String): String = {
        def iter(chars: List[Char], result: List[Char]): List[Char] = chars match
            case Nil => result
            case head :: tail =>
                if result.nonEmpty then
                    val isEqualCase = head.toLower == result.head.toLower && !head.equals(result.head)
                    iter(tail, if (isEqualCase) result.tail else head :: result)
                else iter(tail, head :: result)

        iter(s.toList, Nil).reverse.mkString
    }
}