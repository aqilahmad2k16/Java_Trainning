package Test1;

import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Scanner;

public class Q9{

    //Two pointet approach
    public static void removeTheDuplicate(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int j=1, i=0;
        while(i<arr.length && j<arr.length){
            if(arr[i] != arr[j]){
                list.add(arr[i]);
            }

            i++;
            j++;
        }
                
            
                


        list.add(arr[i]);

        // int[] newArr = new int[list.size()];
        for(int k=0; k<list.size(); k++){
            System.out.println(list.get(k)+ " ");
        }

        // for(int k=0; k<newArr.length; k++){
        //     System.out.println(newArr[i]+ " ");
        // }

    }
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("enter size of the array");
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = scan.nextInt();
        // }

        int [] arr = {2,2,2,2,3};

        removeTheDuplicate(arr);
    }
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     for(int i=0; i<arr.length; i++){
    //         if(!hm.containsKey(arr[i])){
    //             hm.put(arr[i], 1);
    //         }else{
    //             int val = hm.get(arr[i]);
    //             val++;
    //             hm.put(arr[i], val);
    //         }
    //     }

        // ArrayList<Integer> list = new ArrayList<>();
    //     // for(Integer key : hm.keySet()){
    //     //     list.add(key);
    //     // }

    //     int[] newArr = new int[list.size()];
    //     for(int k=0; k<list.size(); k++){
    //         newArr[k] = list.get(k);
    //     }

    //     for(int k=0; k<newArr.length; k++){
    //         System.out.println(newArr[k]+ " ");
    //     }

        
    // }
}