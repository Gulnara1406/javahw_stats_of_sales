package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int avgSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long max = 0;
        for (int i = 0; i < sales.length - 1; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
        int maxMonth = 0;
        long min = 10 ^ 22;
        for (int i = 0; i < sales.length - 1; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public int monthsSalesUnderAvg(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSumSales(sales)) {
                month += 1;
            }

        }
        return month;
    }

    public int monthsSalesOverAvg(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSumSales(sales)) {
                month += 1;
            }
        }
        return month;
    }
}
