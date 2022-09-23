package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountLess1000() {

        int actual = 200;
        int expected = service.remain(800);

        assertEquals(actual, expected);

    }

    @Test
    public void amountMore1000() {

        int actual = 0;
        int expected = service.remain(5_000);

        assertEquals(actual, expected);
    }

    @Test
    public void amountEquality1000() {

        int actual = 0;
        int expected = service.remain(1_000);

        assertEquals(actual, expected);
    }

    @Test
    public void amountEquality1() {

        int actual = 999;
        int expected = service.remain(1);

        assertEquals(actual, expected);
    }
}