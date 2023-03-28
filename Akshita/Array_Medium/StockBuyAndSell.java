// Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

package Array_Medium;

public class StockBuyAndSell {
    public static void stockBuySell(int[] price, int n) {
        int max = 0;
        int buyPrice = 0;
        int currPrice = 0;
        int profit = 0;
        for(int i=1; i<n; i++)
        {
            currPrice = price[i];
            if(currPrice < price[i-1])                                     //[1]
            {
                if(max > 0)                                                //[2]
                {
                    profit = 1;
                    System.out.print("("+buyPrice+" "+(i-1) +") " );
                    max = 0;
                }
                buyPrice = i;
            }
            max = Math.max(currPrice - price[buyPrice], max);              //stores the max profit earned between highest peak and lowest peak
        }

        if(max > 0){                                                       //[3]
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

/*
This function takes an array of prices as input and returns a list of integer arrays representing the buy-sell pairs.
If no profit is possible, the function prints "No Profit" and returns an empty list.
It is based on the fact that stocks are bought at lowest point and sold at highest peaks.
While the currprice is still increasing, it'll be counted as profit.

[1] the current price is compared with the price at [i-1]th index, and if it is less then it is the new buyprice.
The array is then iterated through until the new buyprice if found. The element just before the new buyprice is the selling price.
The max is set to 0 to find the max profit earned while exploring the next valley.

[2] this statement checks if any prior peak exists,
and if it does then the buyprice and selling price day of the profit needs to be printed
while resetting the value of max for the exploration of the next valley.

[3] this condition is used to check and print the highest and lowest peak of the last valley, with highest peak always being the last element,
It will print the peaks if a max exists, i.e, the profit was made.
*/

