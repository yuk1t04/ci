package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(5, new Calculator().add(5, 6));
    }
}