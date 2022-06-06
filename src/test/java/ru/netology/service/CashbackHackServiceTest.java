package ru.netology.service;

import org.testng.annotations.Test;
 import org.testng.Assert;



class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainder() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(900);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateRemainder1() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateRemainder2() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(1500);
        int expected = 500;

        org.testng.Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateRemainder3() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(1100);
        int expected = 900;

        org.testng.Assert.assertEquals(actual, expected);
    }
}