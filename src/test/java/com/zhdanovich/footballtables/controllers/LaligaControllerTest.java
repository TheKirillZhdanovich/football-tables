package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.LaligaService;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaligaControllerTest {

    @Test
    void testShowLaligaMethod() {
        LaligaController laligaController = new LaligaController(new LaligaService());
        Model model = new Model() {
            @Override
            public Model addAttribute(String attributeName, Object attributeValue) {
                return null;
            }

            @Override
            public Model addAttribute(Object attributeValue) {
                return null;
            }

            @Override
            public Model addAllAttributes(Collection<?> attributeValues) {
                return null;
            }

            @Override
            public Model addAllAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public Model mergeAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public boolean containsAttribute(String attributeName) {
                return false;
            }

            @Override
            public Object getAttribute(String attributeName) {
                return null;
            }

            @Override
            public Map<String, Object> asMap() {
                return null;
            }
        };

        assertEquals("pages/laliga", laligaController.showLaliga(model));
    }
}