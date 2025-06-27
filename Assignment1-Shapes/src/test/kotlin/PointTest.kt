import kotlin.test.*

class PointTest {
    
    @Test
    fun testPointCreation() {
        val point = Point(3.5, 4.2)
        assertEquals(3.5, point.x)
        assertEquals(4.2, point.y)
    }
    
    @Test
    fun testClone() {
        val original = Point(1.0, 2.0)
        val clone = original.clone()
        
        assertEquals(original.x, clone.x)
        assertEquals(original.y, clone.y)
        assertNotSame(original, clone) // Different objects
    }
    
    @Test
    fun testMove() {
        val point = Point(5.0, 10.0)
        point.move(2.5, -3.0)
        
        assertEquals(7.5, point.x)
        assertEquals(7.0, point.y)
    }
    
    @Test
    fun testMoveWithNegativeDeltas() {
        val point = Point(0.0, 0.0)
        point.move(-5.0, -10.0)
        
        assertEquals(-5.0, point.x)
        assertEquals(-10.0, point.y)
    }
    
    @Test
    fun testMoveWithZeroDeltas() {
        val point = Point(3.0, 4.0)
        point.move(0.0, 0.0)
        
        assertEquals(3.0, point.x)
        assertEquals(4.0, point.y)
    }
} 