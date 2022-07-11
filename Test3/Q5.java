package Test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
    // remove the duplicate form the unsorted array
    public static void main(String[] args) {
        int arr[] = {2,2,5,5,3,3,4,1,1};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        
        int i=0, j=1;
        while(i<arr.length && j<arr.length){
            if(arr[i] != arr[j]){
                list.add(arr[i]);
            }

            i++;
            j++;
        }

        list.add(arr[i]);

        System.out.println(list);
    }
}
