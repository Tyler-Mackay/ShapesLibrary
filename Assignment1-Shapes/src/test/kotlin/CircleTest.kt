import kotlin.test.*

class CircleTest {
    
    @Test
    fun testCircleCreation() {
        val center = Point(3.0, 4.0)
        val circle = Circle(center, 5.0)
        
        assertEquals(center, circle.center)
        assertEquals(5.0, circle.radius, 0.001)
        assertEquals(5.0, circle.verticalRadius, 0.001)
        assertEquals(5.0, circle.horizontalRadius, 0.001)
    }
    
    @Test
    fun testArea() {
        val center = Point(0.0, 0.0)
        val circle = Circle(center, 4.0)
        
        val expectedArea = kotlin.math.PI * 4.0 * 4.0
        assertEquals(expectedArea, circle.area(), 0.001)
    }
    
    @Test
    fun testMove() {
        val center = Point(2.0, 3.0)
        val circle = Circle(center, 2.5)
        
        circle.move(3.0, -2.0)
        
        assertEquals(5.0, circle.center.x)
        assertEquals(1.0, circle.center.y)
        
        // Radius should remain unchanged
        assertEquals(2.5, circle.radius, 0.001)
    }
    
    @Test
    fun testInheritanceFromEllipse() {
        val center = Point(1.0, 1.0)
        val circle = Circle(center, 6.0)
        
        // Should inherit Ellipse functionality
        val expectedArea = kotlin.math.PI * 6.0 * 6.0
        assertEquals(expectedArea, circle.area(), 0.001)
        
        // Vertical and horizontal radii should be equal
        assertEquals(circle.verticalRadius, circle.horizontalRadius, 0.001)
    }
} 