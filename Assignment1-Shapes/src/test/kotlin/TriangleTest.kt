import kotlin.test.*

class TriangleTest {
    
    @Test
    fun testTriangleCreation() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(3.0, 0.0)
        val point3 = Point(0.0, 4.0)
        val triangle = Triangle(point1, point2, point3)
        
        assertEquals(point1, triangle.point1)
        assertEquals(point2, triangle.point2)
        assertEquals(point3, triangle.point3)
    }
    
    @Test
    fun testTriangleCreationCollinearPointsThrowsException() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(1.0, 1.0)
        val point3 = Point(2.0, 2.0) // All on the same line
        
        assertFailsWith<IllegalArgumentException> {
            Triangle(point1, point2, point3)
        }
    }
    
    @Test
    fun testAreaRightTriangle() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(3.0, 0.0)
        val point3 = Point(0.0, 4.0)
        val triangle = Triangle(point1, point2, point3)
        
        assertEquals(6.0, triangle.area(), 0.001) // 0.5 * 3 * 4 = 6
    }
    
    @Test
    fun testAreaEquilateralTriangle() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(2.0, 0.0)
        val point3 = Point(1.0, kotlin.math.sqrt(3.0))
        val triangle = Triangle(point1, point2, point3)
        
        val expectedArea = kotlin.math.sqrt(3.0) // Area of equilateral triangle with side 2
        assertEquals(expectedArea, triangle.area(), 0.001)
    }
    
    @Test
    fun testAreaArbitraryTriangle() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 1.0)
        val point3 = Point(2.5, 4.0)
        val triangle = Triangle(point1, point2, point3)
        
        assertEquals(4.5, triangle.area(), 0.001) // Base=3, Height=3, Area=4.5
    }
    
    @Test
    fun testMove() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(3.0, 0.0)
        val point3 = Point(0.0, 4.0)
        val triangle = Triangle(point1, point2, point3)
        
        val originalArea = triangle.area()
        triangle.move(2.0, -1.0)
        
        assertEquals(2.0, triangle.point1.x)
        assertEquals(-1.0, triangle.point1.y)
        assertEquals(5.0, triangle.point2.x)
        assertEquals(-1.0, triangle.point2.y)
        assertEquals(2.0, triangle.point3.x)
        assertEquals(3.0, triangle.point3.y)
        
        // Area should remain the same after moving
        assertEquals(originalArea, triangle.area(), 0.001)
    }
    
    @Test
    fun testMoveWithNegativeDeltas() {
        val point1 = Point(5.0, 5.0)
        val point2 = Point(8.0, 5.0)
        val point3 = Point(6.5, 8.0)
        val triangle = Triangle(point1, point2, point3)
        
        triangle.move(-3.0, -2.0)
        
        assertEquals(2.0, triangle.point1.x)
        assertEquals(3.0, triangle.point1.y)
        assertEquals(5.0, triangle.point2.x)
        assertEquals(3.0, triangle.point2.y)
        assertEquals(3.5, triangle.point3.x)
        assertEquals(6.0, triangle.point3.y)
    }
} 