package Recursion;
public class PrintElementOfArray{
    public static void main(String[] args) {
        int[] arr = {4,6,8,10,2,3};
        printArrayElement(arr,0);
    }

    public static void printArrayElement(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }


        printArrayElement(arr, idx+1);
        System.out.println(arr[idx]);
    }
}