open class Ellipse(var center: Point, var verticalRadius: Double, var horizontalRadius: Double) {
    fun area(): Double {
        return kotlin.math.PI * verticalRadius * horizontalRadius
    }

    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}