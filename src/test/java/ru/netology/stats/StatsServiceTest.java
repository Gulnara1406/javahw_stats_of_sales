package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void salesSumTest() {
        StatsService service = new StatsService();
        int actual = service.sumSales(sales);
        int expected = 180;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void avgSumSalesTest() {
        StatsService service = new StatsService();
        int actual = service.avgSumSales(sales);
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void maxSalesMonthTest() {
        StatsService service = new StatsService();
        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void minSalesMonthTest() {
        StatsService service = new StatsService();
        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void salesUnderAvgSalesMonthTest() {
        StatsService service = new StatsService();
        int actual = service.monthsSalesUnderAvg(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void salesOverAvgSalesMonthTest() {
        StatsService service = new StatsService();
        int actual = service.monthsSalesOverAvg(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}
