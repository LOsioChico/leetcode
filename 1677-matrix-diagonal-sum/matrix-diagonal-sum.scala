object Solution {
    def diagonalSum(mat: Array[Array[Int]]): Int = {
        def iter(matrix: Array[Array[Int]], index: Int, sum: Int): Int =
            matrix.headOption match
                case Some(column) =>
                    val leftAndRightSum = column(index) + column(mat.head.length - index - 1)
                    iter(matrix.tail, index + 1, sum + leftAndRightSum)
                case None         =>
                    if(mat.length % 2 == 0) then sum
                    else sum - mat(mat.length / 2)(mat.head.length / 2)

        iter(mat, 0, 0)
    }
}