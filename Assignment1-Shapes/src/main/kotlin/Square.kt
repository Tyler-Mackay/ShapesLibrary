class Square(corner1: Point, corner2: Point) : Rectangle(corner1, corner2) {
    init {
        if (kotlin.math.abs(width - height) > 0) {
            throw IllegalArgumentException("Points must form a square (width must equal height)")
        }
    }

    val side: Double
        get() = width  // width and height are equal, so either works
}