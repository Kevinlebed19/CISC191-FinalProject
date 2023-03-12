package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test
    void ReceiptImplementTest(){
        Pizza pizzaTest = new Pizza();
        assertTrue(pizzaTest.receipt());
    }

}