package Recursion;

public class MaxOFArray {
    public static void main(String[] args) {
        int[] arr = {12,4,5,23,41,8};
        System.out.println(findMaxOfArray(arr, 0));
    }

    public static int findMaxOfArray(int[] arr, int idx){
        if(idx == arr.length){
            return arr[idx-1];
        }

        int val = findMaxOfArray(arr, idx+1);
        if(val > arr[idx]){
            return val;
        }else{
            return arr[idx];
        }
    }
}
