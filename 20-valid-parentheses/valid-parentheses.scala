import scala.collection.mutable

object Solution {
    def isValid(s: String): Boolean = {
        def iter(chars: Array[Char], stack: Array[Char]): Boolean =
            chars.headOption match
                case Some(char) =>
                    char match
                        case '{' | '[' | '(' => iter(chars.tail, stack :+ char)
                        case _               =>
                            val peek = stack.lastOption.getOrElse("")
                            if (peek == '{' && char == '}') ||
                               (peek == '[' && char == ']') ||
                               (peek == '(' && char == ')')
                            then iter(chars.tail, stack.init)
                            else false
                case None       => stack.isEmpty

        iter(s.toArray, Array.empty[Char])
    }
}