open class Rectangle(var corner1: Point, var corner2: Point) {
    val width: Double
        get() = kotlin.math.abs(corner2.x - corner1.x)

    val height: Double
        get() = kotlin.math.abs(corner2.y - corner1.y)

    fun area(): Double {
        return width * height
    }

    fun move(deltaX: Double, deltaY: Double) {
        corner1.move(deltaX, deltaY)
        corner2.move(deltaX, deltaY)
    }
}