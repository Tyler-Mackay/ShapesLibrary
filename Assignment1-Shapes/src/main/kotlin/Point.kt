class Point(var x: Double, var y: Double) {
    fun clone(): Point {
        val pointClone = Point(x, y)
        return pointClone
    }

    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}
