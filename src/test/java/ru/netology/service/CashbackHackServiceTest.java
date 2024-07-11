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
}