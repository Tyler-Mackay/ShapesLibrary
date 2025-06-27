class Line(point1: Point, point2: Point) {
    var point1: Point = point1
        private set
    var point2: Point = point2
        private set

    val length: Double
        get() = kotlin.math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + 
                               (point2.y - point1.y) * (point2.y - point1.y))

    init {
        if (length == 0.0) {
            throw IllegalArgumentException("Line length cannot be 0")
        }
    }

    fun slope(): Double {
        val dx = point2.x - point1.x
        if (dx == 0.0) {
            throw IllegalStateException("Vertical line has undefined slope")
        }
        return (point2.y - point1.y) / dx
    }

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}