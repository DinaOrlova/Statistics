package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSumOfAllSales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSumOfAllSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageMonthlySales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverageMonthlySales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMaxSale() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.findMonthWithMaxSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMinSale() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.findMonthWithMinSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.findMonthsWithBelowAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.findMonthsWithAboveAverageSales(sales);

        assertEquals(expected, actual);
    }
}