package com.brian.leetcode;

public class MaxProfit {

    public int m1(int[] prices) {

        int profit = 0;
        int b = 0, s = 1;
        int i = 0;

        if (prices == null || prices.length == 1) {
            return 0;
        }

        int length = prices.length;

        while (i < length) {
            if (i == 0) {
                if (prices[i+1] > prices[i]) {
                    b = i;
                }
            } else if (i == length-1) {
                if (prices[i] > prices[i-1]) {
                    s = i;
                    if (b < s) {
                        profit = profit + (prices[s] - prices[b]);
                        System.out.println("buy on " + b + ", sell on " + s + ", getting " + (prices[s] - prices[b]));
                    }
                }
            } else {
                if (prices[i] > prices[i-1] && prices[i] > prices[i+1]) {
                    s = i;
                    if (b < s) {
                        profit = profit + (prices[s] - prices[b]);
                        System.out.println("buy on " + b + ", sell on " + s + ", getting " + (prices[s] - prices[b]));
                    }
                } else if (prices[i] < prices[i+1] && prices[i] < prices[i-1]) {
                    b = i;
                }
            }
            i++;
        }

        System.out.println("m1: Getting profile: " + profit);
        return profit;
    }

    int m2(int[] prices) {
        int profit = 0;

        if (prices.length < 2) {
            return 0;
        }

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                profit = profit + prices[i+1] - prices[i];
            }
        }
        System.out.println("m2: Getting profile: " + profit);
        return profit;
    }

    public int m3(int[] prices) {
        // write your code here
        if(prices.length <= 1)
            return 0;

        int begin = prices[0];
        int end = prices[0];
        int sum = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]>=end){
                end = prices[i];
            }else{
                sum = sum + end - begin;
                begin = prices[i];
                end = prices[i];
            }
        }
        sum = sum + end - begin;
        System.out.println("m2: Getting profile: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] a = new int[]{1, 23, 2, 500, 1000, 34, 23, 35, 233};
        maxProfit.m1(a);
        maxProfit.m2(a);
        maxProfit.m3(a);
    }
}
