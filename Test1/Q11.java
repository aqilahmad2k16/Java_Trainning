package Test1;

import java.util.Stack;

public class Q11 {
    public static void main(String[] args) {
        // // 1st array is sort
        // int[] arr = {1,4,5,7,10};
        // // int k = 20;
        // int k= 90;
        // // Two pointer approach
        // int i=0, j=arr.length-1;
        // while(i<=j){
        //     if(arr[i]*arr[j]<k){
        //         i++;
        //     }else if(arr[i]*arr[j]>k){
        //         j--;
        //     }else{
        //         System.out.println("("+ arr[i] + "," + arr[j] + ")");
        //         return;
        //     }
        // }

        // System.out.println(" there is no such a pair");



        //2nd what if arr is not sorted
        int [] arr = {1,7,4,7,5};
        int k = 20;
        
        // 1st approach by sort it then apply two pointer approach
        // Arrays.sort(arr); T.C = O(nlogn)

        // 2nd approach, requred more attention
        // Stack<Integer>st = new Stack<>();
        // st.push(arr[0]);
        // for(int i=1; i<arr.length; i++){
        //     if(st.peek() * arr[i] == k){
        //         System.out.println("(" + st.peek() + "," + arr[i] + ")");
        //         return;
        //     }else{
        //         st.push(arr[i]);
        //     }
        // }

        //3rd approach(Brute force);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]*arr[j] == k){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    return;
                }
            }
        }

    }
}
