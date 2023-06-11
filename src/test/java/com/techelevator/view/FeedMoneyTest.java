package com.techelevator.view;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FeedMoneyTest  {
Transaction transaction;
@Before
    public void setup () {
    transaction = new Transaction();
}
    @Test
    public void test_feed_money_5() {
        transaction.setBalance("5");
        int expected = 5;
        Assert.assertEquals((int)expected, (int)transaction.getBalance());
    }

    @Test
    public void test_feed_money_non_valid_bill() {
        transaction.setBalance("3");
        int expected = 0;
        Assert.assertEquals(expected, (int)transaction.getBalance());
    }
    @Test
    public void test_feed_money_non_number() {
        transaction.setBalance("a");
        int expected = 0;
        Assert.assertEquals(expected, (int)transaction.getBalance());
    }
    @After
    public void ending() {
        transaction.getChange();
    }
}
