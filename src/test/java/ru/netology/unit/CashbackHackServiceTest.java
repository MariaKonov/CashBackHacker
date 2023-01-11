package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void Test() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(2800), 200);
    }

    @Test
    public void Test2() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void Test3() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
}