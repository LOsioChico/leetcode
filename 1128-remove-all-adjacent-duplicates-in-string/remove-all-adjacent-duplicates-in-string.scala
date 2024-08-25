object Solution {
    def removeDuplicates(s: String): String = {
        def iter(s: Array[Char], result: String): String =
            s.headOption match
                case Some(c) =>
                    if result.nonEmpty && result.last == c then iter(s.tail, result.init)
                    else iter(s.tail, result + c)
                case None    => result

        iter(s.toCharArray, "")
    }
}