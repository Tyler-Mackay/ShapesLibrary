import kotlin.test.*

class LineTest {
    
    @Test
    fun testLineCreation() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(3.0, 4.0)
        val line = Line(point1, point2)
        
        assertEquals(point1, line.point1)
        assertEquals(point2, line.point2)
    }
    
    @Test
    fun testLength() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(3.0, 4.0)
        val line = Line(point1, point2)
        
        assertEquals(5.0, line.length, 0.001) // 3-4-5 triangle
    }
    
    @Test
    fun testLengthHorizontalLine() {
        val point1 = Point(1.0, 5.0)
        val point2 = Point(6.0, 5.0)
        val line = Line(point1, point2)
        
        assertEquals(5.0, line.length, 0.001)
    }
    
    @Test
    fun testLengthVerticalLine() {
        val point1 = Point(3.0, 1.0)
        val point2 = Point(3.0, 7.0)
        val line = Line(point1, point2)
        
        assertEquals(6.0, line.length, 0.001)
    }
    
    @Test
    fun testSlope() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(2.0, 4.0)
        val line = Line(point1, point2)
        
        assertEquals(2.0, line.slope(), 0.001)
    }
    
    @Test
    fun testSlopeNegative() {
        val point1 = Point(0.0, 4.0)
        val point2 = Point(2.0, 0.0)
        val line = Line(point1, point2)
        
        assertEquals(-2.0, line.slope(), 0.001)
    }
    
    @Test
    fun testSlopeVerticalLineThrowsException() {
        val point1 = Point(3.0, 1.0)
        val point2 = Point(3.0, 7.0)
        val line = Line(point1, point2)
        
        assertFailsWith<IllegalStateException> {
            line.slope()
        }
    }
    
    @Test
    fun testMove() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 6.0)
        val line = Line(point1, point2)
        
        line.move(2.0, -1.0)
        
        assertEquals(3.0, line.point1.x)
        assertEquals(1.0, line.point1.y)
        assertEquals(6.0, line.point2.x)
        assertEquals(5.0, line.point2.y)
        
        // Length should remain the same after moving
        assertEquals(5.0, line.length, 0.001)
    }
} 