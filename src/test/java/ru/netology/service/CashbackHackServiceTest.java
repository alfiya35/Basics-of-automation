package ru.netology.service;




public class CashbackHackServiceTest {
    @org.junit.Test
     public void shouldCalculateRemainder() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void shouldCalculateRemainder1() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldCalculateRemainder2() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(1500);
        int expected = 500;

        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldCalculateRemainder3() {

        CashbackHackService hack = new CashbackHackService();


        int actual = hack.remain(1100);
        int expected = 900;

        org.junit.Assert.assertEquals(actual, expected);
    }
}