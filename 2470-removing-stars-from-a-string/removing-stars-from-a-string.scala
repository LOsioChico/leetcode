object Solution {
    def removeStars(s: String): String = {
        def iter(chars: List[Char], result: List[Char]): List[Char] = chars match {
            case Nil => result
            case '*' :: tail => 
                iter(tail, if result.nonEmpty then result.tail else result)
            case head :: tail =>
                iter(tail, head :: result)
        }

        iter(s.toList, Nil).reverse.mkString
    }
}
