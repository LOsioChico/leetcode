object Solution {
    def reverseString(s: Array[Char]): Unit = {
        def iter(chars: Array[Char], index: Int): Unit =
            chars.headOption match
                case Some(char) if index < s.length / 2 =>
                    val tempChar = s(s.length - 1 - index)
                    s(s.length - 1 - index) = s(index)
                    s(index) = tempChar
                    iter(chars.tail, index + 1)
                case _ =>

        iter(s, 0)
    }
}