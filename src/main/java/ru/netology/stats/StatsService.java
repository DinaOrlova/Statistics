package ru.netology.stats;

public class StatsService {
    public long calculateSumOfAllSales (long [] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return  sum;
    }

    public long calculateAverageMonthlySales (long [] sales) {
        long numberOfMonths = sales.length;
        long sum = 0;
        for (long sale : sales){
            sum += sale;
        }
        return sum/numberOfMonths;
    }

    public long findMonthWithMaxSale (long [] sales) {
        long monthNumber = 0;
        long currentMonthNumber = 1;
        long maxSale = 0;
        for (long sale : sales) {
            if (maxSale <= sale) {
                maxSale = sale;
                monthNumber = currentMonthNumber;
            }
            currentMonthNumber = currentMonthNumber + 1;
        }
        return monthNumber;
    }

    public long findMonthWithMinSale (long [] sales) {
        long monthNumber = 0;
        long currentMonthNumber = 1;
        long minSale = sales[0];
        for (long sale : sales) {
            if (minSale > sale) {
                minSale = sale;
                monthNumber = currentMonthNumber;
            }
            currentMonthNumber = currentMonthNumber + 1;
        }
        return monthNumber;
    }

    public long findMonthsWithBelowAverageSales (long [] sales) {
        long sumMonthNumber = 0;
        long averageMonthlySales = calculateAverageMonthlySales(sales);
        for (long sale : sales) {
            if (sale < averageMonthlySales) {
                sumMonthNumber = sumMonthNumber + 1;
            }
        }
        return sumMonthNumber;
    }

    public long findMonthsWithAboveAverageSales (long [] sales) {
        long sumMonthNumber = 0;
        long averageMonthlySales = calculateAverageMonthlySales(sales);
        for (long sale : sales) {
            if (sale > averageMonthlySales) {
                sumMonthNumber = sumMonthNumber + 1;
            }
        }
        return sumMonthNumber;
    }
}

