package Test26;

import java.util.Scanner;

public class contiguousSubarray{
    public static void main(String[] args) {
        //find maxiSum subarray and return it's sum
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array and target");

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int sum= Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(maxSum<sum){
                maxSum = sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        System.out.println(maxSum);
    }
}