package DynamicProgramming;

public class BestTimeToBuySellStock {
    //O(n^2)
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }

        }
        return maxProfit;
    }

    //O(n)
    public static int maxProfit2(int[] prices) {
        int minAsYouGo = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {

            if (prices[i] < minAsYouGo)
                minAsYouGo = prices[i];
            else {
                if (maxProfit < prices[i] - minAsYouGo)
                    maxProfit = prices[i] - minAsYouGo;
            }
        }
        return maxProfit;
    }

    public static int maxProfit3(int[] prices) {
        int i = 0; //min
        int j = 1;
        int max =0;
        while (i < prices.length && j < prices.length) {
            if (prices[i] >prices[j])
                i=j;
            else
                if(max<prices[j]-prices[i])
                    max=prices[j]=prices[i];
            j++;
        }
        return max;
    }

}
