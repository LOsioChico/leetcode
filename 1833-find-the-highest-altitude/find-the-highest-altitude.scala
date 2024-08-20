object Solution {
    def largestAltitude(gain: Array[Int]): Int = {
        def iter(gain: Array[Int], maxAltitude: Int, currentAltitude: Int): Int =
            gain.headOption match
                case Some(num) =>
                    val updatedAltitude = currentAltitude + num
                    val updatedMaxAltitude = maxAltitude max updatedAltitude
                    iter(gain.tail, updatedMaxAltitude, updatedAltitude)
                case None      => maxAltitude

        iter(gain, 0, 0)
    }
}