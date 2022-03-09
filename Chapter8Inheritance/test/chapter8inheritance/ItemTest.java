package chapter8inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

    public ItemTest() {
    }

    @Test // tests all the gets at once
    public void testConstructor() {
        // AAA convention / format

        // Arrange - setting up all the variables I need to test with
        String expectedName = "Coffee";
        String expectedSKU = "123";
        double expectedPrice = 1.5;
        int expectedQuantity = 3;
        double expectedTotalPrice = 4.5;

        // Act - calling the code we are testing, and getting actual values
        Item item = new Item(expectedName, expectedSKU, expectedPrice, expectedQuantity);
        String actualName = item.getName();
        String actualSku = item.getSku();
        double actualPrice = item.getUnitPrice();
        int actualQuantity = item.getQuantity();
        double actualTotalPrice = item.getTotalPrice();

        // Assert - did we get what we expected
        assertEquals(expectedName, actualName);
        assertEquals(expectedSKU, actualSku);
        // only with doubles, you need a how close is close enough 'delta'
        assertEquals(expectedPrice, actualPrice, .000001);
        assertEquals(expectedQuantity, actualQuantity);
        assertEquals(expectedTotalPrice, actualTotalPrice, .000001);
    }

    @Test
    public void testSetQuantitySuccessful() {
        // Arrage
        int expectedQuantity = 3;
        // dummy values because I don't care what they are yet
        Item item = new Item("", "", 0, 0);

        // Act
        boolean result = item.setQuantity(expectedQuantity);
        int actualQuantity = item.getQuantity();

        // Assert
        assertEquals(expectedQuantity, actualQuantity);
        assertTrue(result);
    }

    @Test
    public void testSetQuantityDoesntAcceptNegative() {
        // Arrage
        int expectedQuantity = 0;
        // dummy values because I don't care what they are yet
        Item item = new Item("", "", 0, 0);

        // Act
        boolean result = item.setQuantity(-3);
        int actualQuantity = item.getQuantity();

        // Assert
        assertEquals(expectedQuantity, actualQuantity);
        assertFalse(result);
    }

    @Test
    public void testSetUnitPriceSuccessful() {
        // Arrage
        double expectedUnitPrice = 3;
        // dummy values because I don't care what they are yet
        Item item = new Item("", "", 0, 0);

        // Act
        item.setUnitPrice(expectedUnitPrice);
        double actualUnitPrice  = item.getUnitPrice();

        // Assert
        assertEquals(expectedUnitPrice, actualUnitPrice, .000001);
    }
    
    @Test
    public void testSetUnitPriceDoesntAcceptNegative() {
        // Arrage
        double expectedUnitPrice = 0;
        // dummy values because I don't care what they are yet
        Item item = new Item("", "", 0, 0);

        // Act
        item.setUnitPrice(-3);
        double actualUnitPrice  = item.getUnitPrice();

        // Assert
        assertEquals(expectedUnitPrice, actualUnitPrice, .000001);
    }

}
