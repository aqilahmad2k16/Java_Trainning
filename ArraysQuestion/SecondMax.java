package ArraysQuestion;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        // int num = 6;
        // int k = 2;
        // int c1 = 0;
        // int c2 = 0;
        // for(int i=1; i<num; i++){

        // }

        // Scanner scan = new Scanner(System.in);
        // System.out.println("enter the size of the array");
        // int n=scan.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = scan.nextInt();
        // }
        int[] arr  = {2,6,8,10,5};

        // // 1approach
        // int max1 = Integer.MIN_VALUE;
        // int min1 = Integer.MAX_VALUE;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > max1){
        //         max1 = arr[i];
        //     }

        //     if(arr[i] < min1){
        //         min1 = arr[i];
        //     }
        // }

        // int max2 = Integer.MIN_VALUE;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > min1 && arr[i] < max1){
        //         if(arr[i] > max2){
        //             max2 = arr[i];
        //         }
        //     }
        // }

        // System.out.println(max2);

        //2nd approach
        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);

    }
}
