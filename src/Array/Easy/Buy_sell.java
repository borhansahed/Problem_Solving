package Array.Easy;

public class Buy_sell {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1};
        System.out.println(buySellStock(arr));
    }

    static int buySellStock(int[] prices) {


        int stock = prices[0];
        int profit = 0;

        for(int i = 1; i<prices.length ; i++){
           stock = Math.min(stock, prices[i]);
           profit = Math.max(profit, prices[i] - stock);

        }

        return profit;

    /*

    T.C -> O(n^2)
    S.C -> O(1)

        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            for (int j = i+1; j < prices.length; j++) {

                profit = Math.max(profit,   prices[j] - prices[i]);
            }
        }
        return profit;

        */
    }
}
