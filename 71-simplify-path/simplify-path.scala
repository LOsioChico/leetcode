object Solution {
    def simplifyPath(path: String): String = {
        def iter(path: Array[String], result: Array[String]): String =
            path.headOption match
                case Some(string) if string == ".."                     =>
                    if result.length > 0 then iter(path.tail, result.init)
                    else iter(path.tail, result)
                case Some(string) if string.length > 0 && string != "." => iter(path.tail, result :+ s"/$string")
                case Some(string)                                       => iter(path.tail, result)
                case None                                               =>
                    val resultString = result.mkString
                    if resultString.length > 0 then resultString else "/"

        iter(path.split("/"), Array.empty[String])
    }
}