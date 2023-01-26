// Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

package Array_Medium;

public class StockBuyAndSell {
    public static void stockBuySell(int[] price, int n) {
        int max = 0;
        int buyPrice = 0;
        int currPrice = 0;
        int profit = 0;
        for(int i=1; i<n; i++){
            currPrice = price[i];
            if(currPrice < price[i-1]){
                if(max > 0){
                    profit = 1;
                    System.out.print("("+buyPrice+" "+(i-1) +") " );
                    max = 0;
                }
                buyPrice = i;
            }
            max = Math.max(currPrice - price[buyPrice], max);
        }
        if(max > 0){
            profit = 1;
            System.out.print("("+buyPrice+" "+(n-1) +") " );
        }
        if(profit == 0){
            System.out.println("No Profit");
        }
        else{
            System.out.println("");
        }

    }

    public static void main(String[] args)
    {
        int n=7;
        int[] arr= { 100, 180, 260, 310, 40, 535, 695 };
        stockBuySell(arr, n);
    }
}

