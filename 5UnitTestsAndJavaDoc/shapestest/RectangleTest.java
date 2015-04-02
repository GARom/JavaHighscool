package shapestest;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {
    
    /**
     * Test of getWidth method, of class Rectangle.
     */
    @Test
    public void testGetWidthExpect10WhenRectangleIsL5W10() {
        //arrange - setup test
        Rectangle instance = new Rectangle(5,10);
        int expResult = 10;

        int result = instance.getWidth();

        assertEquals(expResult, result);
    }

    /**
     * Test of setWidth method, of class Rectangle.
     */
    @Test
    public void testSetWidthExpect7WhenWidthSetTo7() {

        int width = 7;
        Rectangle instance = new Rectangle(5,10);
        int expResult = 7;
        //act
        int result = instance.setWidth(width);
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of getLength method, of class Rectangle.
     */
    @Test
    public void testGetLengthExpect8WhenRectangleIsL8W3() {

        Rectangle instance = new Rectangle(8,3);
        int expResult = 8;

        int result = instance.getLength();

        assertEquals(expResult, result);
    }

    /**
     * Test of setLength method, of class Rectangle.
     */
    @Test
    public void testSetLengthExpect9WhenLengthSetTo9() {

        int length = 9;
        Rectangle instance = new Rectangle(5,10);
        int expResult = 9;

        int result = instance.setLength(length);

        assertEquals(expResult, result);
    }

    /**
     * Test of area method, of class Rectangle.
     */
    @Test
    public void testAreaExpect50WhenL5W10() {

        Rectangle instance = new Rectangle(5,10);
        int expResult = 50;
        //act
        int result = instance.area();
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of perimeter method, of class Rectangle.
     */
    @Test
    public void testPerimeterExpect30WhenL5W10() {

        Rectangle instance = new Rectangle(5,10);
        int expResult = 30;

        int result = instance.perimeter();

        assertEquals(expResult, result);
    }
}