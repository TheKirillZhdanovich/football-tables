package com.zhdanovich.footballtables.championships;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    static Team teamToTestGetMethod;
    static Team teamToTestSetMethod;

    @BeforeAll
    static void prepareToTest() {
        teamToTestGetMethod = new Team("1", "Барселона", "3", "3", "0",
                "0", "12", "2", "9");

        teamToTestSetMethod = new Team();
    }

    @Test
    void testGetPlaceMethod() {
        assertEquals("1", teamToTestGetMethod.getPlace());
    }

    @Test
    void testGetTeamMethod() {
        assertEquals("Барселона", teamToTestGetMethod.getTeam());
    }

    @Test
    void testGetMatchesMethod() {
        assertEquals("3", teamToTestGetMethod.getMatches());
    }

    @Test
    void testGetWinsMethod() {
        assertEquals("3", teamToTestGetMethod.getWins());
    }

    @Test
    void testGetDrawsMethod() {
        assertEquals("0", teamToTestGetMethod.getDraws());
    }

    @Test
    void testGetDefeatsMethod() {
        assertEquals("0", teamToTestGetMethod.getDefeats());
    }

    @Test
    void testGetScoredGoalsMethod() {
        assertEquals("12", teamToTestGetMethod.getScoredGoals());
    }

    @Test
    void testGetMissedGoalsMethod() {
        assertEquals("2", teamToTestGetMethod.getMissedGoals());
    }

    @Test
    void testGetPointsMethod() {
        assertEquals("9", teamToTestGetMethod.getPoints());
    }

    @Test
    void TestSetPlaceMethod() {
        teamToTestSetMethod.setPlace("2");
        assertEquals("2", teamToTestSetMethod.getPlace());
    }

    @Test
    void TestSetTeamMethod() {
        teamToTestSetMethod.setTeam("Арсенал");
        assertEquals("Арсенал", teamToTestSetMethod.getTeam());
    }

    @Test
    void TestSetMatchesMethod() {
        teamToTestSetMethod.setMatches("4");
        assertEquals("4", teamToTestSetMethod.getMatches());
    }

    @Test
    void TestSetWinsMethod() {
        teamToTestSetMethod.setWins("3");
        assertEquals("3", teamToTestSetMethod.getWins());
    }

    @Test
    void TestSetDrawsMethod() {
        teamToTestSetMethod.setDraws("1");
        assertEquals("1", teamToTestSetMethod.getDraws());
    }

    @Test
    void TestSetDefeatsMethod() {
        teamToTestSetMethod.setDefeats("0");
        assertEquals("0", teamToTestSetMethod.getDefeats());
    }

    @Test
    void TestSetScoredGoalsMethod() {
        teamToTestSetMethod.setScoredGoals("7");
        assertEquals("7", teamToTestSetMethod.getScoredGoals());
    }

    @Test
    void TestSetMissedGoalsMethod() {
        teamToTestSetMethod.setMissedGoals("5");
        assertEquals("5", teamToTestSetMethod.getMissedGoals());
    }

    @Test
    void TestSetPointsMethod() {
        teamToTestSetMethod.setPoints("10");
        assertEquals("10", teamToTestSetMethod.getPoints());
    }
}