package Test1;

// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.List;

public class Q13 {
    // remove duplicate from the array
    public static void main(String[] args) {
        int[] arr = {2,2,2,5,4,6};
        //1st approach (two pointer)
        // List<Integer> list = new ArrayList<>();
        // int i=0, j=1;
        // while(i<arr.length && j<arr.length){
        //     if(arr[i] != arr[j]){
        //         list.add(arr[i]);
        //     }

        //     i++;
        //     j++;
        // }
        // list.add(arr[i]);
        // System.out.println(list);

        // 2nd approach(HashSet)
        // List<Integer> ls = new ArrayList<>(arr);
        // HashSet<Integer> hs = new HashSet();
        // for(int i=0; i<arr.length; i++){
        //     hs.add(arr[i]);
        // }

        // Iterator it = hs.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next() + " ");
        // }

        // 3rd approach(hashmap)

    }
}
