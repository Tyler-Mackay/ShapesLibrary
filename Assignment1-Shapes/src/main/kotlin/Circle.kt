class Circle(center: Point, radius: Double) : Ellipse(center, radius, radius) {
    var radius: Double = radius
        set(value) {
            field = value
            verticalRadius = value
            horizontalRadius = value
        }
}