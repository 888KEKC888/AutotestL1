package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldResult() {
        CashbackHackService hackService = new CashbackHackService();
        int amaunt = 900;

        int actual = hackService.remain(amaunt);
        int expected = 100;

        assertEquals(expected, actual);
    }
}