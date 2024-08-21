object Solution {
    def rowAndMaximumOnes(mat: Array[Array[Int]]): Array[Int] = {
        def iter(matrix: Array[Array[Int]], index: Int, result: Array[Int]): Array[Int] =
            matrix.headOption match
                case Some(row) =>
                    val rowSum = row.sum
                    val updatedResult = if rowSum > result(1) then Array(index, rowSum) else result
                    iter(matrix.tail, index + 1, updatedResult)
                case None         => result

        iter(mat, 0, Array(0,0))
    }
}