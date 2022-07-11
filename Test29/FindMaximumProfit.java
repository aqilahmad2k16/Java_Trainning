package Test29;
public class FindMaximumProfit {
    public static void main(String agrs[]){
        int[] price = {7,1,5,3,6,4};

        // int min = Integer.MAX_VALUE;
        // int netProfit = 0;
        // int currprofit =0;
        // for(int i=0;i<price.length; i++){
        //     if(price[i] < min){
        //         min = price[i];
        //     }

        //     currprofit = price[i] - min;

        //     if(currprofit > netProfit){
        //         netProfit = currprofit;
        //     }

        // }
        // System.out.println(netProfit);

        //revision
        int min = Integer.MAX_VALUE;
        int netProfit = 0;
        int curProfit = 0;

        for(int i=0; i<price.length; i++){
            if(price[i] < min){
                min = price[i];
            }

            curProfit = price[i] - min;

            if(curProfit > netProfit){
                netProfit = curProfit;
            }
        }

        System.out.println(netProfit);
    }
}
