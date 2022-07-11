package Recursion;

import java.util.Scanner;

public class FindIndexOfElementFromArray {
    // return the index of the element form the array using recursion

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("enther the size of the array");
        // int n = scan.nextInt();
        // int x = scan.nextInt();
        // int[] arr = new int[n];

        // for(int i=0; i<arr.length; i++){
        //     arr[i] = scan.nextInt();
        // }

        int[] arr = {-1,0,3,5,9,12};
        int x = 9;

        System.out.println(findIndex(arr,0, x));
    }

    public static int findIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }

        int val = findIndex(arr, idx+1, x);
        if(val == -1){
            return -1;
        }else{
            return val;
        }
    }
}
