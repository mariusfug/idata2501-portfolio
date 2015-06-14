package com.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControllerTest {

    @Test
    public void shouldReturnAnItemWithAName() {
        Controller controller = new Controller();
        assertEquals("demo", controller.index().getName());
    }
}
