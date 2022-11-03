package com.zhdanovich.footballtables.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainControllerTest {

    @Test
    void testShowMainMethod() {
        MainController mainController = new MainController();
        assertEquals("pages/main", mainController.showMain());
    }
}