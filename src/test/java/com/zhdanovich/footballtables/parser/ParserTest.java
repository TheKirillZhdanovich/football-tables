package com.zhdanovich.footballtables.parser;

import com.zhdanovich.footballtables.championships.Team;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    private Parser parser = new Parser("");

    @Test
    void TestIsDigitMethodTrue() throws InvocationTargetException, IllegalAccessException {
        try {
            Method method = Parser.class.getDeclaredMethod("isDigit", String.class);
            method.setAccessible(true);
            assertEquals(true, method.invoke(parser, "5"));

        } catch (NoSuchMethodException e) {
            System.out.println("No such method in Parser class");;
        }
    }

    @Test
    void TestIsDigitMethodFalse() throws InvocationTargetException, IllegalAccessException {
        try {
            Method method = Parser.class.getDeclaredMethod("isDigit", String.class);
            method.setAccessible(true);
            assertEquals(false, method.invoke(parser, "Спартак"));

        } catch (NoSuchMethodException e) {
            System.out.println("No such method in Parser class");;
        }
    }

    @Test
    void TestPrepareTableMethod() throws InvocationTargetException, IllegalAccessException {
        String[] strings = new String[]{"1", "Арсенал", "4", "4", "0", "0", "9", "1", "12",
                                        "2", "Манчестер", "Сити", "4", "3", "1", "0", "7", "3", "10"};

        String[][] expectedAnswer = new String[][]{{"1", "Арсенал", "4", "4", "0", "0", "9", "1", "12"},
                                                   {"2", "Манчестер Сити", "4", "3", "1", "0", "7", "3", "10"}};

        try {
            Method method = Parser.class.getDeclaredMethod("prepareTable", String[].class);
            method.setAccessible(true);
            assertArrayEquals(expectedAnswer, (String[][])method.invoke(parser, new Object[]{strings}));

        } catch (NoSuchMethodException e) {
            System.out.println("No such method in Parser class");;
        }
    }

    @Test
    void TestGetTableMethod() throws InvocationTargetException, IllegalAccessException {
        String[][] s = new String[][]{{"1", "Арсенал", "4", "4", "0", "0", "9", "1", "12"},
                {"2", "Манчестер Сити", "4", "3", "1", "0", "7", "3", "10"}};

        List<Team> expectedAnswer = List.of(new Team("1", "Арсенал", "4", "4", "0", "0", "9", "1", "12"),
                                            new Team("2", "Манчестер Сити", "4", "3", "1", "0", "7", "3", "10"));

        try {
            Method method = Parser.class.getDeclaredMethod("getTable", String[][].class);
            method.setAccessible(true);
            assertEquals(expectedAnswer, method.invoke(parser, new Object[]{s}));

        } catch (NoSuchMethodException e) {
            System.out.println("No such method in Parser class");;
        }
    }

}