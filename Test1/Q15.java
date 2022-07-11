package Test1;

import java.util.ArrayList;
import java.util.List;

public class Q15 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        List<Integer> lst = new ArrayList<>();

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                lst.add(arr[i]);
            }else{
                count++;
            }
        }

        for(int i=1; i<=count; i++){
            lst.add(0);
        }

        System.out.println(lst);
    }
}
