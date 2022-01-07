package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @Test
    void shouldCalculateCashbackAmountOverBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1450;
        int actual = CashbackHackService.remain(amount);
        int expected = 550;

        assertEquals(actual, expected);
    }


    @Test
    void shouldCalculateCashbackAmountUnderBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 800;
        int actual = CashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountUpperBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = CashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }


    @Test
    void shouldCalculateCashbackAmountLowerBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = CashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountOnBoundary1000() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountOnBoundaryZero() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = CashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}