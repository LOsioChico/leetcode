import scala.collection.mutable.HashMap

object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        val hashTable = HashMap[String, List[String]]()
        def toIndex = (char: Char) => char.toInt - 'a'.toInt

        strs.foreach(str => {
        val hash = Array.fill(26)(0)
        str.foreach(char => hash(toIndex(char)) += 1)
        hashTable.update(
            hash.mkString(","),
            hashTable.getOrElse(hash.mkString(","), List()).appended(str)
        )
        })

        hashTable.values.toList.map(str => str.sorted)
    }

}