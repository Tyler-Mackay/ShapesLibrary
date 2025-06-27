import kotlin.test.*

class SquareTest {
    
    @Test
    fun testSquareCreation() {
        val corner1 = Point(0.0, 0.0)
        val corner2 = Point(4.0, 4.0)
        val square = Square(corner1, corner2)
        
        assertEquals(corner1, square.corner1)
        assertEquals(corner2, square.corner2)
        assertEquals(4.0, square.side, 0.001)
    }
    
    @Test
    fun testSquareCreationInvalidThrowsException() {
        val corner1 = Point(0.0, 0.0)
        val corner2 = Point(4.0, 3.0) // Not a square!
        
        assertFailsWith<IllegalArgumentException> {
            Square(corner1, corner2)
        }
    }
    
    @Test
    fun testSideProperty() {
        val corner1 = Point(1.0, 1.0)
        val corner2 = Point(6.0, 6.0)
        val square = Square(corner1, corner2)
        
        assertEquals(5.0, square.side, 0.001)
    }
    
    @Test
    fun testArea() {
        val corner1 = Point(0.0, 0.0)
        val corner2 = Point(3.0, 3.0)
        val square = Square(corner1, corner2)
        
        assertEquals(9.0, square.area(), 0.001)
    }
    
    @Test
    fun testMove() {
        val corner1 = Point(1.0, 1.0)
        val corner2 = Point(4.0, 4.0)
        val square = Square(corner1, corner2)
        
        square.move(2.0, -1.0)
        
        assertEquals(3.0, square.corner1.x)
        assertEquals(0.0, square.corner1.y)
        assertEquals(6.0, square.corner2.x)
        assertEquals(3.0, square.corner2.y)
        
        // Side and area should remain the same
        assertEquals(3.0, square.side, 0.001)
        assertEquals(9.0, square.area(), 0.001)
    }
    
    @Test
    fun testInheritanceFromRectangle() {
        val corner1 = Point(0.0, 0.0)
        val corner2 = Point(5.0, 5.0)
        val square = Square(corner1, corner2)
        
        // Should inherit Rectangle properties
        assertEquals(5.0, square.width, 0.001)
        assertEquals(5.0, square.height, 0.001)
        assertEquals(square.width, square.height, 0.001)
    }
} 