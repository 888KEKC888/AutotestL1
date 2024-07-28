package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldResult() {
        CashbackHackService hackService = new CashbackHackService();
        int amaunt = 900;

        int actual = hackService.remain(amaunt);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldResultZero() {
        CashbackHackService hackService = new CashbackHackService();
        int amaunt = 1000;

        int actual = hackService.remain(amaunt);
        int expected = 0;

        assertEquals(expected, actual);
    }
}