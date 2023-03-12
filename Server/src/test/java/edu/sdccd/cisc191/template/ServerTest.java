package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServerTest {

    @Test
    void SuccessfullyPrintMenu(){
Server arrayTest = new Server();
assertTrue(arrayTest.printMenu());

    }

}