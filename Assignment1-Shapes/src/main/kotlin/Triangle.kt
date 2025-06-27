class Triangle(var point1: Point, var point2: Point, var point3: Point) {
    init {
        if (area() == 0.0) {
            throw IllegalArgumentException("Points must not be collinear (area cannot be 0)")
        }
    }

    fun area(): Double {
        // Calculate the lengths of the three sides
        val a = kotlin.math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + 
                               (point2.y - point1.y) * (point2.y - point1.y))
        val b = kotlin.math.sqrt((point3.x - point2.x) * (point3.x - point2.x) + 
                               (point3.y - point2.y) * (point3.y - point2.y))
        val c = kotlin.math.sqrt((point1.x - point3.x) * (point1.x - point3.x) + 
                               (point1.y - point3.y) * (point1.y - point3.y))
        
        // Calculate semi-perimeter
        val s = (a + b + c) / 2
        
        // Calculate area using Heron's formula
        return kotlin.math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
        point3.move(deltaX, deltaY)
    }
}