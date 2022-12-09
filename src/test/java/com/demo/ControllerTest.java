package com.demo;


import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControllerTest {

    @Test
    public void shouldReturnAListOfItems() {
        Controller controller = new Controller();
        List<Item> items = controller.items();
        assertTrue(items.size() > 0);
        assertEquals("a", items.get(0).getName());
        assertEquals("b", items.get(1).getName());
        assertEquals("c", items.get(2).getName());
    }
}
