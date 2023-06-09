package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

public class FeedMoneyTest {

    @Test
    public void test_feed_money_5() {
        //Arrange
        Transaction test = new Transaction();
        //Act
        double result = Transaction.getBalance();
        int expected = 5;
        //Assert
        Assert.assertEquals(expected, result);
    }
}
