package Recursion;

public class ReverseTheArray {
    public static void main(String[] args) {
        
        int[] arr = {5,8,6,7,2,3};
    
        reverseArrayElement(arr, 0);


    }

    public static void reverseArrayElement(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }

        reverseArrayElement(arr, idx+1);
        System.out.print(arr[idx] + " ");
    }
}
