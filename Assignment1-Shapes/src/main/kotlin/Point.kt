class Point(x: Double, y: Double) {
    var x: Double = x
        private set
    var y: Double = y
        private set

    fun clone(): Point {
        return Point(x, y)
    }

    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}
