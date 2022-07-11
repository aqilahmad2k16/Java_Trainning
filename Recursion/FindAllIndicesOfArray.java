package Recursion;

import java.util.ArrayList;

public class FindAllIndicesOfArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,4,9,10};
        int x = 4;
        ArrayList<Integer> list = new ArrayList();
        findAllIndicesOfArray(arr,0, x, list);

        System.out.println(list);
    }

    public static void findAllIndicesOfArray(int[] arr, int idx, int x, ArrayList<Integer> list){
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == x){
            list.add(idx);
        }

        findAllIndicesOfArray(arr, idx+1, x, list);
        return;
    }
}
