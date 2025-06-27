open class Ellipse(center: Point, verticalRadius: Double, horizontalRadius: Double) {
    var center: Point = center
        private set
    val verticalRadius: Double = verticalRadius
    val horizontalRadius: Double = horizontalRadius

    fun area(): Double {
        return kotlin.math.PI * verticalRadius * horizontalRadius
    }

    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}