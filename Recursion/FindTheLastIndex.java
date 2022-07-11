package Recursion;
public class FindTheLastIndex{
    public static void main(String[] args) {
        int[] arr = {4,5,6,4,6};
        int x = 4;

        System.out.println(findLastIndex(arr, 0, x));
    }

    public static int findLastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        int f1 = findLastIndex(arr, idx+1, x);
        if(f1 == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return f1;
        }
    }
}