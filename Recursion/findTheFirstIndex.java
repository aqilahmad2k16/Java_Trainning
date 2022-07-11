package Recursion;

public class findTheFirstIndex {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,9,5,4};
        int x = 9;

        System.out.println(findTheFirstIndex(arr, 0, x));
    }

    public static int findTheFirstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }

        int f1 = findTheFirstIndex(arr, idx+1, x);
        if(f1 == -1){
            return -1;
        }else{
            return f1;
        }
        
    }
}
