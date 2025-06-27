import kotlin.test.*

class EllipseTest {
    
    @Test
    fun testEllipseCreation() {
        val center = Point(5.0, 3.0)
        val ellipse = Ellipse(center, 4.0, 6.0)
        
        assertEquals(center, ellipse.center)
        assertEquals(4.0, ellipse.verticalRadius, 0.001)
        assertEquals(6.0, ellipse.horizontalRadius, 0.001)
    }
    
    @Test
    fun testArea() {
        val center = Point(0.0, 0.0)
        val ellipse = Ellipse(center, 3.0, 4.0)
        
        val expectedArea = kotlin.math.PI * 3.0 * 4.0
        assertEquals(expectedArea, ellipse.area(), 0.001)
    }
    
    @Test
    fun testAreaCircle() {
        val center = Point(0.0, 0.0)
        val ellipse = Ellipse(center, 5.0, 5.0) // Circle
        
        val expectedArea = kotlin.math.PI * 5.0 * 5.0
        assertEquals(expectedArea, ellipse.area(), 0.001)
    }
    
    @Test
    fun testMove() {
        val center = Point(2.0, 3.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        
        ellipse.move(4.0, -1.0)
        
        assertEquals(6.0, ellipse.center.x)
        assertEquals(2.0, ellipse.center.y)
        
        // Radii should remain unchanged
        assertEquals(2.0, ellipse.verticalRadius, 0.001)
        assertEquals(3.0, ellipse.horizontalRadius, 0.001)
    }
    
    @Test
    fun testMoveWithNegativeDeltas() {
        val center = Point(10.0, 8.0)
        val ellipse = Ellipse(center, 1.0, 2.0)
        
        ellipse.move(-5.0, -3.0)
        
        assertEquals(5.0, ellipse.center.x)
        assertEquals(5.0, ellipse.center.y)
    }
} 