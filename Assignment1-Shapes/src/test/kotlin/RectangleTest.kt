import kotlin.test.*

class RectangleTest {
    
    @Test
    fun testRectangleCreation() {
        val corner1 = Point(1.0, 2.0)
        val corner2 = Point(5.0, 7.0)
        val rectangle = Rectangle(corner1, corner2)
        
        assertEquals(corner1, rectangle.corner1)
        assertEquals(corner2, rectangle.corner2)
    }
    
    @Test
    fun testWidth() {
        val corner1 = Point(1.0, 2.0)
        val corner2 = Point(5.0, 7.0)
        val rectangle = Rectangle(corner1, corner2)
        
        assertEquals(4.0, rectangle.width, 0.001)
    }
    
    @Test
    fun testWidthWithNegativeCoordinates() {
        val corner1 = Point(-3.0, -1.0)
        val corner2 = Point(2.0, 4.0)
        val rectangle = Rectangle(corner1, corner2)
        
        assertEquals(5.0, rectangle.width, 0.001)
    }
    
    @Test
    fun testHeight() {
        val corner1 = Point(1.0, 2.0)
        val corner2 = Point(5.0, 7.0)
        val rectangle = Rectangle(corner1, corner2)
        
        assertEquals(5.0, rectangle.height, 0.001)
    }
    
    @Test
    fun testHeightWithReversedPoints() {
        val corner1 = Point(5.0, 7.0)
        val corner2 = Point(1.0, 2.0)
        val rectangle = Rectangle(corner1, corner2)
        
        assertEquals(5.0, rectangle.height, 0.001)
    }
    
    @Test
    fun testArea() {
        val corner1 = Point(0.0, 0.0)
        val corner2 = Point(4.0, 3.0)
        val rectangle = Rectangle(corner1, corner2)
        
        assertEquals(12.0, rectangle.area(), 0.001)
    }
    
    @Test
    fun testAreaWithNegativeCoordinates() {
        val corner1 = Point(-2.0, -3.0)
        val corner2 = Point(2.0, 1.0)
        val rectangle = Rectangle(corner1, corner2)
        
        assertEquals(16.0, rectangle.area(), 0.001) // width=4, height=4
    }
    
    @Test
    fun testMove() {
        val corner1 = Point(1.0, 2.0)
        val corner2 = Point(5.0, 7.0)
        val rectangle = Rectangle(corner1, corner2)
        
        rectangle.move(3.0, -2.0)
        
        assertEquals(4.0, rectangle.corner1.x)
        assertEquals(0.0, rectangle.corner1.y)
        assertEquals(8.0, rectangle.corner2.x)
        assertEquals(5.0, rectangle.corner2.y)
        
        // Width, height and area should remain the same
        assertEquals(4.0, rectangle.width, 0.001)
        assertEquals(5.0, rectangle.height, 0.001)
        assertEquals(20.0, rectangle.area(), 0.001)
    }
} 