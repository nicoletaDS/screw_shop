package soit.mint;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private static Order order;

    @BeforeAll
    public static void setup() {
        order = new Order();
        order.setScrew(3);
        order.setScrew_nut(2);
        order.setWasher(4);
    }

    @Test
    void checkOrder() {
        assertFalse(order.checkOrder());
        order.setScrew(1);
        assertTrue(order.checkOrder());
    }

    @Test
    void totalPrice() {
        assertEquals(25, order.totalPrice());
    }
}