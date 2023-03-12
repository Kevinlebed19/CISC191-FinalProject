package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {
    @Test
    void SuccessfullyPrintMessage() {
        Burger burgerTest = new Burger();
        assertTrue(burgerTest.purchaseItem());
    }
}