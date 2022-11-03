package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.BundesligaService;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BundesligaControllerTest {

    @Test
    void testShowBundesligaMethod() {
        BundesligaController bundesligaController = new BundesligaController(new BundesligaService());
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

        assertEquals("pages/bundesliga", bundesligaController.showBundesliga(model));
    }
}