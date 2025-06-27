class Line(var point1: Point, var point2: Point) {
    val length: Double
        get() = kotlin.math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + 
                               (point2.y - point1.y) * (point2.y - point1.y))

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