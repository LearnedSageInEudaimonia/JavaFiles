package com.arrays;

public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfits = 0;


        for(int price : prices){
            if(minPrice > price){
                minPrice = price;
                System.out.println(minPrice);
            }
            else {
                maxProfits = Math.max(maxProfits,price - minPrice);
            }
        }
        return  maxProfits;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 3};
        System.out.println(maxProfit(arr));
    }

}
